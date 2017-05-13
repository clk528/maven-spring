package com.clk.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.clk.entity.OrderEntity;

public interface OrderDao {
	/**
	 * @param pageSize 取多少条
	 * @param limit 起始段
	 * @return List
	 */
	static List<OrderEntity> queryAll(@Param("pageSize") Integer pageSize,@Param("limit") Integer limit) {
		// TODO Auto-generated method stub
		return null;
	}
}
