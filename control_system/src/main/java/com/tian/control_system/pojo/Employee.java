package com.tian.control_system.pojo;

import java.io.Serializable;


/***
 * @author tianhong yu
 * @date 2018年04月27日上午10:22:25
 */
public class Employee implements Serializable{

	private static final long serialVersionUID = 1022908032L;

    /**
     * employeeId
     */
	private Integer employeeId;
    /**
     * name
     */
	private String name;
    /**
     * departmentId
     */
	private Integer departmentId;
    /**
     * jobId
     */
	private Integer jobId;
    /**
     * recordId
     */
	private Integer recordId;
    /**
     * 在职状态 1.试用 2 转正 3 退休
     */
	private Integer status;
    /**
     * createTime
     */
	private java.util.Date createTime;

	public Integer getEmployeeId() {
		return this.employeeId;
	}
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getDepartmentId() {
		return this.departmentId;
	}
	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}
	public Integer getJobId() {
		return this.jobId;
	}
	public void setJobId(Integer jobId) {
		this.jobId = jobId;
	}
	public Integer getRecordId() {
		return this.recordId;
	}
	public void setRecordId(Integer recordId) {
		this.recordId = recordId;
	}
	public Integer getStatus() {
		return this.status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public java.util.Date getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(java.util.Date createTime) {
		this.createTime = createTime;
	}
}