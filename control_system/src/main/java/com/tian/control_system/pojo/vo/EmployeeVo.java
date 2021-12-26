/**
 * Author :tianhongyu
 * Date : 2018/5/5 15:11
 */
package com.tian.control_system.pojo.vo;

import com.tian.control_system.pojo.Employee;
import com.tian.control_system.pojo.Record;

public class EmployeeVo extends Employee {

    private String deptName;

    private String jobName;

    private String statusName;

    private Record record;

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public String getStatusName() {
        return statusName;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }

    public Record getRecord() {
        return record;
    }

    public void setRecord(Record record) {
        this.record = record;
    }
}
