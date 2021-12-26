package com.tian.control_system.pojo;

import java.io.Serializable;


/***
 * @author tianhong yu
 * @date 2018年04月27日上午10:22:25
 */
public class Job implements Serializable{

	private static final long serialVersionUID = 1022358029L;

    /**
     * jobId
     */
	private Integer jobId;
    /**
     * name
     */
	private String name;
    /**
     * remark
     */
	private String remark;
    /**
     * 部门Id
     */
	private Integer departmentId;
    /**
     * 1 正常 2 取消
     */
	private Integer status;

	public Integer getJobId() {
		return this.jobId;
	}
	public void setJobId(Integer jobId) {
		this.jobId = jobId;
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
	public Integer getDepartmentId() {
		return this.departmentId;
	}
	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}
	public Integer getStatus() {
		return this.status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
}