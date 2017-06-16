package com.clk.controller;

import javax.servlet.http.HttpServletRequest;
import javax.xml.bind.PropertyException;

import org.apache.tomcat.util.security.MD5Encoder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.clk.core.Message.MessageInfo;
import com.clk.core.Message.MessageStatus;
import com.clk.core.dict.Configurer;

@RestController
@RequestMapping("service")
public class CommonService3Controller {
	
	@RequestMapping(value = "doService")
	public String doService(HttpServletRequest request , String api,String args,String appkey,String sign){
		if(request.getMethod() !="POST"){
			return JSON.toJSONString(new MessageInfo<String>(MessageStatus.API_NOT_SUPPORT_METHOD.getStatus(),MessageStatus.API_NOT_SUPPORT_METHOD.getMessage()));
		}
		try{			
			return JSON.toJSONString(call(api, args, appkey, sign));
		} catch(JSONException e){
			return JSON.toJSONString(new MessageInfo<String>(MessageStatus.API_INVLID_DATA_FORMAT.getStatus(),MessageStatus.API_INVLID_DATA_FORMAT.getMessage()));
		} catch(Exception e){
			String errorMsg = getDetailMessage(e);			
			return JSON.toJSONString(new MessageInfo<String>(99999,errorMsg));
		}
	}
	@RequestMapping(value = "test")
	public String test(HttpServletRequest request , @RequestBody String data){
		if(request.getMethod() !="POST"){
			return JSON.toJSONString(new MessageInfo<String>(MessageStatus.API_NOT_SUPPORT_METHOD.getStatus(),MessageStatus.API_NOT_SUPPORT_METHOD.getMessage()));
		}
		JSONObject json =  null;
		String api,args,appkey,sign;
		
		try{
			
			json = JSONObject.parseObject(data);
			api = json.getString("api");
			args = json.getString("args");
			appkey = json.getString("appkey");
			sign = json.getString("sign");
			
		} catch(JSONException e){
			String errorMsg = getDetailMessage(e);			
			return JSON.toJSONString(new MessageInfo<String>(99999,errorMsg));
		} catch(NullPointerException $e) {	
			return JSON.toJSONString(new MessageInfo<String>(MessageStatus.API_INVLID_DATA_FORMAT.getStatus(),MessageStatus.API_INVLID_DATA_FORMAT.getMessage()));
		}
		return JSON.toJSONString(call(api,args,appkey,sign));
	}
	
	/**
	 * 接口调用入口 2017年6月16日 22:19:02
	 * @param api
	 * @param args
	 * @param appkey
	 * @param sign
	 * @return MessageInfo
	 */
	private MessageInfo<?> call(String api,String args,String appkey,String sign){		
		
		if(api == "" || api == null){
			return new MessageInfo<String>(-1,"api is null");
		}
		if(args =="" || args == null){
			return new MessageInfo<String>(-2,"args is null");
		}
		if(appkey == "" || appkey == null){
			return new MessageInfo<String>(-1,"appkey is null");
		}
		if(sign =="" || sign == null){
			return new MessageInfo<String>(-2,"sign is null");
		}
		
		if(!isValidSign(args, appkey, sign)){
			return new MessageInfo<String>(MessageStatus.API_INVLID_SIGN.getStatus(),MessageStatus.API_INVLID_SIGN.getMessage());
		}
		return new MessageInfo<String>(MessageStatus.OK.getStatus(),MessageStatus.OK.getMessage());
	}
	/**
	 * 将Exception 转换为字符返回 2017年6月16日 22:17:51
	 * @author clk
	 * @param e Throwable 
	 * @return String
	 */
	private String getDetailMessage(Throwable e){
		StringBuilder sBuilder = new StringBuilder(e.toString());
		StackTraceElement[] stackTraceElements = e.getStackTrace();

		for (StackTraceElement stackTraceElement : stackTraceElements) {
			sBuilder.append(" \n " + stackTraceElement.toString());
		}
		
		return sBuilder.toString();
	}
	private boolean isValidSign(String message,String appkey,String sign){
		try {
			String appSign = Configurer.getProperty(appkey);
			appSign += message;
			if(MD5Encoder.encode(appSign.getBytes()) != sign){
				return false;
			}
		} catch (PropertyException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
}
