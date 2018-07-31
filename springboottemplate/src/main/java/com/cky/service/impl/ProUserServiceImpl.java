package com.cky.service.impl;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.cky.entity.ProUser;
import com.cky.mapper.ProUserMapper;
import com.cky.service.ProUserService;

@Service
public class ProUserServiceImpl<T extends ProUser> implements ProUserService<T> {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private ProUserMapper<T> dao;

	@Override
	public int addEntity(T entity) {

		int result = 0;
		try {
			entity.setCreatedAt();

			//result = dao.insertEntity(entity);

		} catch (DataAccessException e) {
			result = 0;
			logger.error("ProUserServiceImpl.addEntity Exception is : " + e.getMessage());
		}
		return result;
	}

	@Override
	public int editEntity(T entity) {

		int result = 0;

		try {
			entity.setUpdatedAt();
			//dao.updateEntity(entity);

			result = entity.getId();
		} catch (DataAccessException e) {
			result = 0;
			logger.error("ProUserServiceImpl.editEntity Exception is : " + e.getMessage());
		}

		return result;
	}

	@Override
	public ArrayList<T> getListByEntity(T entity) {

		ArrayList<T> result = null;

		try {
			//result = (ArrayList<T>) dao.selectListByEntity(entity);
		} catch (DataAccessException e) {
			result = null;
			logger.error("ProUserServiceImpl.getListByEntity Exception is : " + e.getMessage());
		}
		return result;
	}

	@Override
	public int destroyEntity(T entity) {

		int result = 0;
		try {
			entity.setDeletedAt();
			//result = dao.deleteEntity(entity);
		} catch (DataAccessException e) {
			result = 0;
			logger.error("ProUserServiceImpl.destroyEntity Exception is : " + e.getMessage());
		}

		return result;
	}

	@Override
	public T getById(T entity) {

		T result = null;

		try {
			//result = dao.selectById(entity);
		} catch (DataAccessException e) {
			result = null;
			logger.error("ProUserServiceImpl.getById Exception is : " + e.getMessage());
		}
		return result;
	}

	@Override
	public T getByEntity(T entity) {

		T result = null;
		try {
			//result = dao.selectByEntity(entity);
		} catch (DataAccessException e) {
			result = null;
			logger.error("ProUserServiceImpl.selectByEntity Exception is :" + e.getMessage());
		}
		return result;
	}

	@Override
	public ArrayList<T> getListAll(T entity) {
		ArrayList<T> result = null;

		try {
			result = (ArrayList<T>) dao.selectListAll(entity);
		} catch (DataAccessException e) {
			result = null;
			logger.error("ProUserServiceImpl.getListByEntity Exception is : " + e.getMessage());
		}
		return result;
	}

	@Override
	public int getListCountByEntity(T entity) {

		int result = 0;
		try {
			//result = dao.selectListCountByEntity(entity);
		} catch (DataAccessException e) {
			result = 0;
			logger.error("ProUserServiceImpl.getListCountByEntity Exception is : " + e.getMessage());
		}
		return result;
	}

	@Override
	public ArrayList<T> getLastList(T entity) {
		// TODO Auto-generated method stub
		return null;
	}

}
