package com.clk.core.Message;

public class Message {
	private Integer code;
	private String message;
	
	public Message(Integer code , String message){
		this.code = code;
		this.message = message;
	}
	
	/**
	 * @author clk
	 * @param code 状态码  
	 * @param message 消息说明
	 * @param is 没有意义
	 * @return void
	 * @since 2017年5月12日 22:10:39
	 */
	public Message(Integer code , String message, boolean is){
		this.code = code;
		this.message = is ?  message + "，稍后再试" : message;
	}
	
	
	
	
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
}
