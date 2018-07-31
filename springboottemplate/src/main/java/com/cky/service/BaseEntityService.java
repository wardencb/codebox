package com.cky.service;

import java.util.ArrayList;

import org.springframework.dao.DataAccessException;


public interface BaseEntityService<T> {
	/**
	 * <b>function:</b> 把Entity对象存储到数据库
	 * 
	 * @author c
	 * @createDate 
	 * @param Entity
	 *            Entity
	 * @return int
	 * @throws DataAccessException
	 */
	public int addEntity(T entity) throws DataAccessException;

	/**
	 * <b>function:</b> 把Entity对象更新信息存储到数据库
	 * 
	 * @author c
	 * @createDate 
	 * @param Entity
	 *            Entity
	 * @return int
	 * @throws DataAccessException
	 */
	public int editEntity(T entity) throws DataAccessException;

	/**
	 * <b>function:</b> 从数据库返回Entity对象数组
	 * 
	 * @author c
	 * @createDate 
	 * @param Entity
	 *            Entity
	 * @return ArrayList<Entity>
	 * @throws DataAccessException
	 */
	public ArrayList<T> getListByEntity(T entity) throws DataAccessException;

	/**
	 * <b>function:</b> 删除数据库中的Entity对象数据
	 * 
	 * @author c
	 * @createDate 
	 * @param Entity
	 *            Entity
	 * @return int
	 * @throws DataAccessException
	 */
	public int destroyEntity(T entity) throws DataAccessException;

	/**
	 * <b>function:</b> 根据id从数据库返回Entity对象
	 * 
	 * @author c
	 * @createDate 
	 * @param Entity
	 *            Entity
	 * @return Entity
	 * @throws DataAccessException
	 */
	public T getById(T entity) throws DataAccessException;

	/**
	 * <b>function:</b> 从数据库返回Entity对象
	 * 
	 * @author c
	 * @createDate 
	 * @param Entity
	 *            Entity
	 * @return Entity
	 * @throws DataAccessException
	 */
	public T getByEntity(T entity) throws DataAccessException;

	/**
	 * <b>function:</b> 从数据库返回所有的Entity对象数组
	 * 
	 * @author c
	 * @createDate 
	 * @param Entity
	 *            Entity
	 * @return Entity
	 * @throws DataAccessException
	 */
	public ArrayList<T> getListAll(T entity) throws DataAccessException;

	/**
	 * <b>function:</b> 从数据库返回符合Entity对象记录的个数
	 * 
	 * @author c
	 * @createDate 
	 * @param Entity
	 *            Entity
	 * @return int
	 * @throws DataAccessException
	 */
	public int getListCountByEntity(T entity) throws DataAccessException;

	/**
	 * <b>function:</b> 从数据库返回最后添加的文章的十种类型的Entity对象数组
	 * 
	 * @author c
	 * @createDate 
	 * @param Entity
	 *            Entity
	 * @return ArrayList<Entity>
	 * @throws DataAccessException
	 */
	public ArrayList<T> getLastList(T entity) throws DataAccessException;
}
