package com.clk.service.impl;

import java.util.HashMap;
import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.clk.dao.OrderDao;
import com.clk.service.TestService;

public class TestServiceImpl implements TestService{

	@Override
	public String test(String name) {
		Map<String,Object> data = new HashMap<String,Object>();
		data.put("test", OrderDao.queryAll(1, 20));
		return JSON.toJSONString(data);
	}
}
