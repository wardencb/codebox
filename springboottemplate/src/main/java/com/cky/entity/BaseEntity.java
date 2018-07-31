package com.cky.entity;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BaseEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3162793375007873706L;

	public final Logger logger = LoggerFactory.getLogger(this.getClass());

	/** 表前缀 */
	public final String PRE_TABLE = "pro_";

	/** entity对应的表名字 ---- 便于日后做分表功能 */
	public String tableName = "";

	/** id */
	private int id;
	/** 生成时间 */
	private String createdAt;
	/** 更新时间 */
	private String updatedAt;
	/** 删除时间 */
	private String deletedAt;

	private ArrayList<Integer> ids;

	/** 每页记录数 */
	private int perPage = 10;

	/** 当前页面数 */
	private int page = 1;

	/** 当前起始记录数 */
	private int startRecord = 0;

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	public void setCreatedAt() {

		this.createdAt = this.getDateTime();
	}

	public String getUpdatedAt() {
		return this.updatedAt;

	}

	public void setUpdatedAt(String updatedAt) {
		this.updatedAt = updatedAt;

	}

	public void setUpdatedAt() {
		this.updatedAt = this.getDateTime();
	}

	public String getDeletedAt() {
		return this.deletedAt;
	}

	public void setDeletedAt(String deletedAt) {
		this.deletedAt = deletedAt;
	}

	public void setDeletedAt() {
		this.deletedAt = this.getDateTime();
	}

	public ArrayList<Integer> getIds() {
		return ids;
	}

	public void setIds(ArrayList<Integer> ids) {
		this.ids = ids;
	}

	public void setIds(String idStr) {

		logger.info("BaseEntity.setIds idStr is : " + idStr);

		ArrayList<Integer> ids = new ArrayList<Integer>();
		String[] idStrArr = idStr.split(",");

		for (String strId : idStrArr) {
			int id = Integer.parseInt(strId.trim());
			ids.add(id);
		}

		this.ids = ids;
	}

	/**
	 * @return the perPage
	 */
	public int getPerPage() {
		return this.perPage;
	}

	/**
	 * @param perPage the perPage to set
	 */
	public void setPerPage(int perPage) {
		this.perPage = perPage;
		this.setStartRecord((page - 1) * perPage);
	}

	/**
	 * @return the page
	 */
	public int getPage() {
		return this.page;
	}

	/**
	 * @param page the page to set
	 */
	public void setPage(int page) {
		this.page = page;
		this.setStartRecord((page - 1) * perPage);
	}

	/**
	 * @return the startRecord
	 */
	public int getStartRecord() {
		return this.startRecord;
	}

	/**
	 * @param startRecord the startRecord to set
	 */
	public void setStartRecord(int startRecord) {
		this.startRecord = startRecord;
	}

	/** 获取当前时间的字符串格式 */
	private String getDateTime() {

		Date date = new Date();
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		return df.format(date);
	}

	public String getTableName() {
		// TODO Auto-generated method stub
		return null;
	}

}
