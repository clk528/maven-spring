package com.clk.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CommomServiceController {
	
	@RequestMapping("/hello")
	public String hello(){
		System.out.println("我进来了。。。555555");
		return "hello";
	}
	@RequestMapping("/index")
	public ModelAndView index(){
		
		Map<String, Object> modelMap = new HashMap<String, Object>();
		modelMap.put("time","2017-05-03 12:49:14");
		System.out.println("我进来了。。。");
		System.out.println(modelMap.get("time"));
		return new ModelAndView("index",modelMap);
	}
}
