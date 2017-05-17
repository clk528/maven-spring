package com.clk.core.dict;

public enum test {
	SUCCESS(1,"成功"),
	ERROR(-1,"失败");
	
	test(int code,String message){
		this.setCode(code);
		this.setMessage(message);
	}
	
	private int code;
	private String message;
	
	public int getCode(){
		return this.code;
	}
	public void setCode(int code){
		this.code = code;
	}
	public String getMessage(){
		return this.message;
	}
	public void setMessage(String message){
		this.message = message;
	}
}
