package com.tian.control_system.pojo;

import java.io.Serializable;


/***
 * @author tianhong yu
 * @date 2018年04月27日上午10:22:25
 */
public class Department implements Serializable{

	private static final long serialVersionUID = 1022998031L;

    /**
     * departmentId
     */
	private Integer departmentId;
    /**
     * name
     */
	private String name;
    /**
     * 描述
     */
	private String remark;
    /**
     * status
     */
	private Integer status;

	public Integer getDepartmentId() {
		return this.departmentId;
	}
	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public Integer getStatus() {
		return this.status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
}