package com.tian.control_system.mapper;


import com.tian.control_system.common.mapper.BaseMapper;
import com.tian.control_system.common.page.Page;
import com.tian.control_system.pojo.Job;
import com.tian.control_system.pojo.vo.JobVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author tianhong yu
 * @date 2018年04月27日上午10:22:25
 */
@Mapper
@Component(value = "jobMapper")
public interface JobMapper extends BaseMapper<Job> {

    /**
     * 查询所有职位并分页
     * @param page
     * @param departmentId
     * @param name
     * @return
     */
    Page<List<JobVo>> findAllByPage(@Param(value = "page") Page page, @Param(value = "departmentId") Integer departmentId, @Param(value = "name") String name);

    List<Job> getJobByDeptId(@Param(value = "deptId") Integer deptId);

    List<Integer> findJobIdByDeptId(@Param(value = "id") Integer id);

    String findNameById(@Param(value = "id") Integer id);

}
