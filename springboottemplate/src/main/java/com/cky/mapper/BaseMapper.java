package com.cky.mapper;

import java.util.ArrayList;

public interface BaseMapper<T> {

	public int deleteById(T entity);

	public int updateEntity(T entity);

	public int insertEntity(T entity);

	public T selectById(T entity);

	public int selectListCountByEntity(T entity);

	public ArrayList<T> selectListByEntity(T entity);

	public ArrayList<T> selectLastList(T entity);

	public T selectByEntity(T entity);
	
	public ArrayList<T> selectListAll(T entity);
}

