/**
 * Author :tianhongyu
 * Date : 2018/4/30 20:01
 */
package com.tian.control_system.pojo.vo;


import com.tian.control_system.pojo.Job;

public class JobVo extends Job {

    private String statusName;

    private String deptName;

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getStatusName() {
        return statusName;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }
}
