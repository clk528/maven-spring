package com.clk.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.clk.core.Message.MessageInfo;
import com.clk.dao.OrderDao;
import com.clk.entity.OrderEntity;
import com.clk.entity.UserEntity;
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

	@Override
	public Map<String, ?> getUser(String nick) {
		Map<String,Object> map = new HashMap<String,Object>();
		UserEntity user = orderdao.getUser(nick);
		if(nick == null){
			map.put("code", 0);
			map.put("Message", "你大爷用户名呢?");
			return map;
		}else if(user == null){
			map.put("code", 0);
			map.put("Message", "你输的用户名不存在可能去了火星!!!(斜眼笑。。。)");
		} else{
			map.put("code", 1);
			map.put("Message", orderdao.getUser(nick));
		}		
		return map;
	}
}
