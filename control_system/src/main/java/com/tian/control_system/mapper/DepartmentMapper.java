package com.tian.control_system.mapper;

import com.tian.control_system.common.mapper.BaseMapper;
import com.tian.control_system.common.page.Page;
import com.tian.control_system.pageEntity.PageEntity;
import com.tian.control_system.pojo.Department;
import com.tian.control_system.pojo.vo.DepartmentVo;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author tianhong yu
 * @date 2018年04月27日上午10:22:25
 */
@Mapper
@Component(value = "departmentMapper")
public interface DepartmentMapper extends BaseMapper<Department> {

    //分页查询！
    List<Department> pageList(Integer page, Integer rows);

    /**
     * 通过名称查询部门
     * @param department
     * @return
     */
    Integer findDepartmentByName(@Param(value = "department") Department department);

    //条件查询
    List<Department> select(@Param("name") String name,
                            @Param("status") Integer status);
    /**
     * 查询所有部门并分页
     * @param page
     * @param
     * @return
     */
    Page<List<DepartmentVo>> findDepartmentByPage(@Param(value = "page") Page page,
                                                  @Param(value = "department") Department department);

    Integer add(Department department);

}
