package com.tian.control_system.common.page;

import java.util.List;

/**
 * 分页对象
 * </br>
 */
public class Page<E> {

	/**
	 * 总条数
	 */
	private Long totalNum=-1L;

	/**
	 * 当前页数
	 */
	private Integer pageNum=1;

	/**
	 * 每页显示条数
	 */
	private Integer pageSize=-1;

	/**
	 * 开始条数
	 */
	private  Long firstNum=0L;


	/**结果集***/
	private List<E> records;

	public Page(Integer pageNum, Integer pageSize) {
		this.pageNum = pageNum;
		this.pageSize = pageSize;
	}

	public void setFirstNum(Long firstNum) {
		this.firstNum = firstNum;
	}
	public Long getTotalNum() {
		return totalNum;
	}

	public void setTotalNum(Long totalNum) {
		this.totalNum = totalNum;
	}


	/**
	 * 开始条数
	 * @return
	 */
	public Long getFirstNum() {
		return (long) ((pageNum - 1) * pageSize);
	}

	public Integer getPageNum() {
		return pageNum;
	}

	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}

	public List<E> getRecords() {
		return records;
	}

	void setRecords(List<E> records) {
		this.records = records;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

}
