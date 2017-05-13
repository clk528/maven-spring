package com.clk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.clk.core.Message.Message;  

@Controller
@RequestMapping("login")
public class CommonService2Controller {
	
	@RequestMapping(value = "checkAccount",produces = "text/html;charset=UTF-8")
	@ResponseBody
	public String  checkAccount(String name){		
		System.out.println("我是好人呢"+(name ==null ? "9666" : name));
		return JSON.toJSONString(new Message(-1,"正在处理中",true));
	}
}