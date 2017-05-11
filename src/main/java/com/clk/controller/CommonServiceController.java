package com.clk.controller;

import java.awt.List;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSONObject;

@Controller
public class CommonServiceController {
	private JSONObject object = new JSONObject();
	private static Logger log = Logger.getLogger(CommonServiceController.class.getName());
	
	@RequestMapping("/hello")
	public ModelAndView hello(){
		log.info("===================================");
		System.out.println("我进来了。。。555555");
		Map<String, Object> modelMap = new HashMap<String, Object>();
		modelMap.put("sb", "你好啊");
		return new ModelAndView("hello",modelMap);
	}
	@RequestMapping("/index")
	public ModelAndView index(HttpServletRequest  http){
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Map<String, Object> modelMap = new HashMap<String, Object>();
		modelMap.put("time",df.format(new Date()));
		try {
			modelMap.put("ip", getIpAddr(http));
		} catch (Exception e) {
			e.printStackTrace();
		}		
		System.out.println("我进来了。。。xxx-----"+modelMap.get("ip"));
		return new ModelAndView("index",modelMap);
	}
	
	@RequestMapping("/")
	public ModelAndView defaultx(HttpServletRequest  http){
		
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Map<String, Object> modelMap = new HashMap<String, Object>();
		modelMap.put("time",df.format(new Date()));
		modelMap.put("ip", http.getRemoteAddr());		
		System.out.println("我进来了。。。xxx"+http.getRemoteAddr());
		return new ModelAndView("index",modelMap);
	}
	/*@RequestMapping("/Login/checkAccount")
	public void checkAccount (){
		Map<String, Object> modelMap = new HashMap<String, Object>();
		modelMap.put("code", "-1");
		modelMap.put("message", "Test");
		modelMap.put("message", new List());
		System.out.println(object.toJSONString(modelMap));
	}*/
	@RequestMapping(value = "service")
	public String service(HttpServletRequest request, String api, String message, String from, String sign){
		System.out.println(api);
		System.out.println(message);
		System.out.println(from);
		System.out.println(sign);		
		return "service";
	}
	
	
	
	public String getIpAddr(HttpServletRequest request) throws Exception{
		String ip = request.getHeader("x-forwarded-for");   
	       if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {   
	           ip = request.getHeader("Proxy-Client-IP");   
	       }   
	       if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {   
	           ip = request.getHeader("WL-Proxy-Client-IP");   
	       }   
	       if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {   
	           ip = request.getRemoteAddr();   
	           if(ip.equals("127.0.0.1") || ip.equals("0:0:0:0:0:0:0:1")){
	               //根据网卡取本机配置的IP
	               InetAddress inet=null;     
	               try {     
	                   inet = InetAddress.getLocalHost();     
	               } catch (UnknownHostException e) {     
	                   e.printStackTrace();     
	               }     
	               ip= inet.getHostAddress();     
	           }  
	       }   
	       // 对于通过多个代理的情况，第一个IP为客户端真实IP,多个IP按照','分割  
	       if(ip != null && ip.length() > 15){    
	           if(ip.indexOf(",")>0){     
	               ip = ip.substring(0,ip.indexOf(","));     
	           }     
	       }     
	       return ip; 
	}
}
