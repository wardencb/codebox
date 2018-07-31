package com.cky.dao;

import java.util.ArrayList;

import org.springframework.dao.DataAccessException;

public interface BaseEntityDao<T> {
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
	public ArrayList<T> selectListByEntity(T entity) throws DataAccessException;

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
	public int insertEntity(T entity) throws DataAccessException;

	/**
	 * <b>function:</b> 根据条件从数据库返回Entity对象
	 * 
	 * @author c
	 * @createDate 
	 * @param Entity
	 *            Entity
	 * @return Entity
	 * @throws DataAccessException
	 */
	public T selectByEntity(T entity) throws DataAccessException;

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
	public int updateEntity(T entity) throws DataAccessException;

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
	public T selectById(T entity) throws DataAccessException;

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
	public int deleteEntity(T entity) throws DataAccessException;

	/**
	 * <b>function:</b> 从数据库返回最后添加的文章的十种类型的Entity对象数组
	 * 
	 * @author c
	 * @createDate 
	 * @return ArrayList<Entity>
	 * @throws DataAccessException
	 */
	public ArrayList<T> selectLastList(T entity) throws DataAccessException;

	/**
	 * <b>function:</b> 从数据库返回符合Entity对象的条件的对象个数
	 * 
	 * @author c
	 * @createDate 
	 * @return ArrayList<Entity>
	 * @throws DataAccessException
	 */
	public int selectListCountByEntity(T entity) throws DataAccessException;

	/**
	 * <b>function:</b> 从数据库返回Entity数组
	 * 
	 * @author c
	 * @createDate 
	 * @return ArrayList<Entity>
	 * @throws DataAccessException
	 */
	public ArrayList<T> selectListAll(T entity) throws DataAccessException;
}
