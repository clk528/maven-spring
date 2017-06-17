package com.clk.controller;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;
import javax.xml.bind.PropertyException;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.clk.core.dict.test;
import com.clk.service.impl.TestServiceImpl;
import com.clk.library.sendmail;

@Controller
public class CommonServiceController {
	private static Logger logger = Logger.getLogger(CommonServiceController.class.getName());
	
	@Autowired
	private TestServiceImpl testservice;
	
	@RequestMapping("/hello")
	public ModelAndView hello() throws PropertyException{
		logger.info("===================================");
		System.out.println(System.getProperty("webAppRootKey"));
		System.out.println(test.SUCCESS.getMessage());
		Map<String, Object> modelMap = new HashMap<String, Object>();
		modelMap.put("sb", "你好啊");
		return new ModelAndView("hello",modelMap);
	}
	@RequestMapping("/index")
	public ModelAndView index(HttpServletRequest  http){
		
		return _index();
	}
	
	@RequestMapping("/")
	public ModelAndView defaultx(HttpServletRequest  http){		
		return _index();
	}
	
	private ModelAndView _index(){		
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Map<String, Object> modelMap = new HashMap<String, Object>();
		modelMap.put("time",df.format(new Date()));
		modelMap.put("version",(new Date()).getTime());
		return new ModelAndView("index",modelMap);
	}
	
	@RequestMapping(value = "test",produces = "text/html;charset=UTF-8")
	@ResponseBody
	public String test(){
		return testservice.test();
	}
	
	@RequestMapping(value = "getuser",produces = "text/html;charset=UTF-8")
	public ModelAndView getuser(String nick){
		return new ModelAndView("getuser",testservice.getUser(nick));
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
	@RequestMapping(value = "sendmail")
	public String sendmail(HttpServletRequest request){
		if(request.getMethod().equals("POST")){
			String receiveMail = request.getParameter("receiveMail");
			String title = request.getParameter("title");
			String body = request.getParameter("body");
			
			boolean isCheck = true;
			
			if(receiveMail !=null && receiveMail != ""){
				Pattern pattern = Pattern.compile( "[a-zA-Z_]{1,}[0-9]{0,}@(([a-zA-z0-9]-*){1,}\\.){1,3}[a-zA-z\\-]{1,}",Pattern.CASE_INSENSITIVE);
				Matcher matcher = pattern.matcher(receiveMail);
				if(!matcher.matches()){
					isCheck = false;
					System.out.println("A验证不通过");
				}
			} else {
				isCheck = false;
			}
			
			if(title =="" || title == null){
				isCheck = false;
				System.out.println("B验证不通过");
			}
			
			if(body =="" || body == null){
				isCheck = false;
				System.out.println("C验证不通过");
			}
			if(isCheck){
				try {
					sendmail sm = new sendmail();
					sm.send(receiveMail, title,body);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		return "sendmail";
	}
}
