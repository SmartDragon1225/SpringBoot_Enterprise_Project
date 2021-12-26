package com.tian.control_system.service;




import com.tian.control_system.common.page.Page;
import com.tian.control_system.common.service.BaseService;
import com.tian.control_system.pojo.Employee;
import com.tian.control_system.pojo.vo.EmployeeNumber;
import com.tian.control_system.pojo.vo.EmployeeVo;

import java.util.List;

/**
 * @author tianhong yu
 * @date 2018年04月27日上午10:22:25
 */
public interface EmployeeService extends BaseService<Employee> {

    /**
     * 分页查询员工档案
     * @param page
     * @param deptId
     * @param jobId
     * @param name
     * @return
     */
    Page<List<EmployeeVo>> getAllRecordsByPage(Page page, Integer deptId, Integer jobId, String name);

    /**
     * 通过Id查找信息
     * @param employeeId
     * @return
     */
    EmployeeVo findInfoById(Integer employeeId);

    EmployeeVo findStatusById(Integer id);

    List<EmployeeNumber> findEmployeeNum(Integer id);

}
