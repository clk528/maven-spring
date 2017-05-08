package com.clk.core.Message;

import java.io.Serializable;

/**
 * 通用消息对象
 *
 *
 * @param <E>
 */
public class MessageInfo<E> implements Serializable {

    private static final long serialVersionUID = 1L;

    private static final int SUCCESS_STATUS = 10000;

    private static final int SYS_ERROR = 10001;

    public static <T> MessageInfo<T> newMessage(GetMessageStatus messageStatus, Object... args) {
        MessageInfo<T> message = new MessageInfo<T>();
        message.setMessageStatus(messageStatus, args);
        return message;
    }

    /**
     * 返回消息
     */
    private String message;

    /**
     * 返回状态吗
     */
    private int status;

    /**
     * 返回数据
     */
    private E data;

    /**
     * 是否成功
     */
    private boolean success;

    /**
     * 是否重复提交的请求交易
     */
    private boolean repeated;

    public MessageInfo() {
        this.setStatus(SUCCESS_STATUS);
        this.setMessage("成功");
    }

    public MessageInfo(int status, String message) {
        this.setStatus(status);
        this.setMessage(message);
    }

    public void copyMessage(MessageInfo<?> fromMessageInfo) {
        this.setStatus(fromMessageInfo.getStatus());
        this.setMessage(fromMessageInfo.getMessage());
        this.setRepeated(fromMessageInfo.isRepeated());
    }

    public E getData() {
        return data;
    }

    public String getMessage() {
        return message;
    }

    public int getStatus() {
        return status;
    }

    /**
     * 是否重复提交的交易
     * 
     * @return
     */
    public boolean isRepeated() {
        return repeated;
    }

    /**
     * 是否成功
     * 
     * @return
     */
    public boolean isSuccess() {
        return success;
    }

    public void setData(E data) {
        this.data = data;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setMessageStatus(GetMessageStatus getMessageStatus, Object... args) {
        this.setStatus(getMessageStatus.getStatus());
        setFormatMessage(getMessageStatus.getMessage(), args);

    }

    public void setRepeated(boolean repeated) {
        this.repeated = repeated;
    }

    public void setStatus(int status) {
        this.status = status;
        this.success = this.status == SUCCESS_STATUS;
    }

    public void setStatusAndMessage(int status, String message, Object... args) {
        this.setStatus(status);
        setFormatMessage(message, args);
    }

    /**
     * 是否成功
     * 
     * @return
     */
    public boolean success() {
        return success;
    }

    /**
     * 是否系统异常
     * 
     * @return
     */
    public boolean sysError() {
        return status == SYS_ERROR;
    }

    protected void setSuccess(boolean success) {
        this.success = success;
    }

    private void setFormatMessage(String message, Object... args) {
        if (args == null || args.length == 0) {
            this.setMessage(message);
        } else {
            this.setMessage(String.format(message, args));
        }
    }
}
