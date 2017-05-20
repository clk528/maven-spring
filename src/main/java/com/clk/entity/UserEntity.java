package com.clk.entity;

public class UserEntity {
	
	private Integer id;
	
	private String nick;
	
	private String password;
	
	private String createTime;
	
	private String lastLoginTime;
	
	private String email;
	
	private String createKey;
	
	private String isActivation;
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getNick() {
		return nick;
	}
	
	public void setNick(String nick) {
		this.nick = nick;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getCreateTime() {
		return createTime;
	}
	
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	
	public String getLastLoginTime() {
		return lastLoginTime;
	}
	
	public void setLastLoginTime(String lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getCreateKey() {
		return createKey;
	}
	
	public void setCreateKey(String createKey) {
		this.createKey = createKey;
	}
	
	public String getIsActivation() {
		return isActivation;
	}
	
	public void setIsActivation(String isActivation) {
		this.isActivation = isActivation;
	}
}
