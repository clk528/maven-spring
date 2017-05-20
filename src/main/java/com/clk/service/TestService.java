package com.clk.service;

import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public interface TestService{
	public String test();
	public Map<String, ?> getUser(String nick);
}