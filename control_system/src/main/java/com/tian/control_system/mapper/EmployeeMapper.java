package com.tian.control_system.mapper;


import com.tian.control_system.common.mapper.BaseMapper;
import com.tian.control_system.common.page.Page;
import com.tian.control_system.pojo.Employee;
import com.tian.control_system.pojo.vo.EmployeeNumber;
import com.tian.control_system.pojo.vo.EmployeeVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author tianhong yu
 * @date 2018年04月27日上午10:22:25
 */
@Mapper
@Component(value = "employeeMapper")
public interface EmployeeMapper extends BaseMapper<Employee> {

    /**
     * 分页查询员工档案
     * @param page
     * @param deptId
     * @param jobId
     * @param name
     * @return
     */
    Page<List<EmployeeVo>> findAllRecordsByPage(@Param(value = "page") Page page, @Param(value = "deptId") Integer deptId, @Param(value = "jobId") Integer jobId, @Param(value = "name") String name);

    /**
     * 通过Id查找信息
     * @param employeeId
     * @return
     */
    EmployeeVo findInfoById(@Param(value = "id") Integer employeeId);

    EmployeeVo findStatusById(@Param(value = "id") Integer id);

    List<EmployeeNumber> findEmployeeNum(@Param(value = "id") Integer id);

}
