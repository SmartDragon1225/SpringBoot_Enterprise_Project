package com.tian.control_system.pojo;

import java.io.Serializable;


/***
 * @author tianhong yu
 * @date 2018年04月27日上午10:22:25
 */
public class Dictionary implements Serializable{

	private static final long serialVersionUID = 102298031L;

    /**
     * id
     */
	private Integer id;
    /**
     * value
     */
	private Integer value;
    /**
     * name
     */
	private String name;
    /**
     * category
     */
	private String category;
    /**
     * createTime
     */
	private java.util.Date createTime;

	public Integer getId() {
		return this.id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getValue() {
		return this.value;
	}
	public void setValue(Integer value) {
		this.value = value;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return this.category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public java.util.Date getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(java.util.Date createTime) {
		this.createTime = createTime;
	}
}