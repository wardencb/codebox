package com.cky.dao.impl;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.cky.dao.ProUserDao;
import com.cky.entity.ProUser;
import com.cky.mapper.ProUserMapper;

//@Repository
public class ProUserDaoImpl {

	/*private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private ProUserMapper<T> mapper;

	@Override
	public ArrayList<T> selectListByEntity(T entity) throws DataAccessException {
		ArrayList<T> result = null;
		try {

			result = (ArrayList<T>) mapper.selectListByEntity(entity);
		} catch (DataAccessException e) {
			result = null;
			logger.error("ProUserDaoImpl.selectListByEntity Exception is : " + e.getMessage());
			e.printStackTrace();
		}

		return result;
	}

	@Override
	public int insertEntity(T entity) {
		int result = 0;
		try {

			mapper.insertEntity(entity);
			// TODO : 添加查询来确定id
			result = entity.getId();
		} catch (DataAccessException e) {
			result = 0;
			logger.error("ProUserDaoImpl.insertEntity Exception is : " + e.getMessage());
		}

		return result;
	}

	@Override
	public T selectByEntity(T entity) {
		T result = null;
		try {
			result = (T) mapper.selectByEntity(entity);
		} catch (DataAccessException e) {
			result = null;
			logger.error("ProUserDaoImpl.selectByEntity Exception is : " + e.getMessage());
		}
		return result;
	}

	@Override
	public int updateEntity(T entity) {
		int result = 0;
		try {
			mapper.updateEntity(entity);
			result = entity.getId();
		} catch (DataAccessException e) {
			result = 0;
			logger.error("ProUserDaoImpl.updateEntity Exception is : " + e.getMessage());
		}

		return result;
	}

	@Override
	public T selectById(T entity) {
		T result = null;
		try {
			result = (T) mapper.selectById(entity);
		} catch (DataAccessException e) {
			result = null;
			logger.error("ProUserDaoImpl.selectById Exception is : " + e.getMessage());
		}
		return (T) result;
	}

	@Override
	public int deleteEntity(T entity) {
		int result = 0;
		try {
			mapper.deleteById(entity);
			result = entity.getId();
		} catch (DataAccessException e) {
			result = 0;
			logger.error("ProUserDaoImpl.deleteEntity Exception is : " + e.getMessage());
		}

		return result;
	}

	@Override
	public ArrayList<T> selectLastList(T entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int selectListCountByEntity(T entity) {
		int result = 0;
		try {

			result = mapper.selectListCountByEntity(entity);
		} catch (DataAccessException e) {
			result = 0;
			logger.error("ProUserDaoImpl.selectListCountByEntity Exception is : " + e.getMessage());
		}
		return result;
	}

	@Override
	public ArrayList<T> selectListAll(T entity) {
		// TODO Auto-generated method stub
		return null;
	}*/

}
