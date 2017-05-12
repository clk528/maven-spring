package com.clk.dao.Mapper;

import java.util.List;

import com.clk.model.appChat;
import com.clk.model.userInfoModel;

public interface QueryMapper {
	List<appChat> query(userInfoModel user);
}
