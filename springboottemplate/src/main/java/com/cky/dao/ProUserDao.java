package com.cky.dao;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.cky.entity.ProUser;

//@Mapper
//@Repository
public interface ProUserDao{
	public ArrayList<ProUser> selectListAll(ProUser entity) throws DataAccessException;

}
