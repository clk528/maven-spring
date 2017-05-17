package com.clk.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.annotation.MapperScan;

import com.clk.entity.OrderEntity;
@MapperScan
public interface OrderDao {
	/**
	 * @param pageSize 取多少条
	 * @param limit 起始段
	 * @return List
	 */
	List<OrderEntity> queryAll(@Param("pageSize") Integer pageSize,@Param("limit") Integer limit);
}
