package com.clk.entity;

public class OrderEntity {
	/**
	 * 表id
	 */
	private Integer id;
	/**
	 * 订单号
	 */
	private String orderNo;
	/**
	 * 支付流水号
	 */
	private String payNo;
	/**
	 * 价格
	 */
	private double amount;
	/**
	 * 状态
	 */
	private String status;
	/**
	 * 创建时间
	 */
	private Integer create_time;
	/**
	 * 支付时间
	 */
	private Integer pay_time;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getPayNo() {
		return payNo;
	}
	public void setPayNo(String payNo) {
		this.payNo = payNo;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Integer getCreate_time() {
		return create_time;
	}
	public void setCreate_time(Integer create_time) {
		this.create_time = create_time;
	}
	public Integer getPay_time() {
		return pay_time;
	}
	public void setPay_time(Integer pay_time) {
		this.pay_time = pay_time;
	}
}
