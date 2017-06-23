package com.clk.library.redis;

import redis.clients.jedis.Jedis;

public class RedisHelper extends Jedis{
	public RedisHelper(){
		super("127.0.0.1", 6379);
	}
	
	public boolean checkValueByTime(String key,int time,int num){
		String value = get(key);
		System.out.println(value);
		if(value == null ){
			setex(key, time, "1");
			return false;
		}
		
		int s = Integer.parseInt(value);
		if(s >= num){
			return true;
		}		
		s+=1;
		
		set(key,Integer.toString(s));		
		return false;
	}
}
