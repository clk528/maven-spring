package com.clk.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
//import com.clk.dao.OrderDao;
import com.clk.service.TestService;

@Service("TestService")
public class TestServiceImpl implements TestService{
	//private OrderDao orderdao;//这里不完善
	@Override
	public String test(String name) {
		Map<String,Object> data = new HashMap<String,Object>();
		//data.put("test", orderdao.queryAll(1, 20));
		data.put("a", name);
		return JSON.toJSONString(data);
	}
}
