package com.clk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CommomServiceController {
	
	@RequestMapping("/hello")
	public String hello(){
		System.out.println("我进来了。。。");
		return "index";
	}
}
