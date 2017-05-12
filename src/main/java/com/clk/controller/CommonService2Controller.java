package com.clk.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;  

@Controller
@RequestMapping("login")
public class CommonService2Controller {
	
	@RequestMapping(value = "checkAccount",produces = "text/html;charset=UTF-8")
	@ResponseBody
	public String  checkAccount(String name){
		System.out.println("我是好人呢"+(name==null ? "9666" : name));
		Map<String,String> reponse = new HashMap<String, String>();
		reponse.put("code","-1");
		reponse.put("message","尚在测试当中");
		return JSON.toJSONString(reponse);
	}
}
