package com.clk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/maven-spring/login", method = RequestMethod.GET)
public class CommonService2Controller {
	
	@RequestMapping(value = "/checkAccount")
	public ModelAndView checkAccount(){
		System.out.println("hahah");
		return new ModelAndView("index");
	}
}
