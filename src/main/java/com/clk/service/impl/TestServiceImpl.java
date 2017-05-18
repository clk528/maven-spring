package com.clk.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.clk.core.Message.MessageInfo;
import com.clk.dao.OrderDao;
import com.clk.entity.OrderEntity;
//import com.clk.dao.OrderDao;
import com.clk.service.TestService;

@Service("TestService")
public class TestServiceImpl implements TestService{
	@Autowired
	private OrderDao orderdao;//这里不完善
	
	@Override
	public String test() {
		MessageInfo<List<OrderEntity>> message = new MessageInfo<List<OrderEntity>>();
		message.setData(orderdao.queryAll(1, 100));
		return JSON.toJSONString(message);
	}
}
