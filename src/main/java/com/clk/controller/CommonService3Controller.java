package com.clk.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
//import com.clk.core.Message.Message;
import com.clk.core.Message.MessageInfo;
import com.clk.core.Message.MessageStatus;

@RestController
@RequestMapping("service")
public class CommonService3Controller {
	
	@RequestMapping(value = "doService")
	public MessageInfo<?> doService(HttpServletRequest request , @RequestBody String data){
		if(request.getMethod() !="POST"){
			return new MessageInfo<String>(MessageStatus.API_INVLID_SIGN.getStatus(),MessageStatus.API_INVLID_SIGN.getMessage());
		}
		JSONObject jsonObject = JSON.parseObject(data);
		
		String api = jsonObject.getString("api");
		String args = jsonObject.getString("args");
		
		if(api == "" || api == null){
			return new MessageInfo<String>(-1,"api is null");
		}
		if(args =="" || args == null){
			return new MessageInfo<String>(-2,"args is null");
		}
		
		return new MessageInfo<String>(MessageStatus.OK.getStatus(),MessageStatus.OK.getMessage());
	}
}
