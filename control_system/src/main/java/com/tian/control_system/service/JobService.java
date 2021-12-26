package com.tian.control_system.service;




import com.tian.control_system.common.page.Page;
import com.tian.control_system.common.service.BaseService;
import com.tian.control_system.pojo.Job;
import com.tian.control_system.pojo.vo.JobVo;

import java.util.List;

/**
 * @author tianhong yu
 * @date 2018年04月27日上午10:22:25
 */
public interface JobService extends BaseService<Job> {

    /**
     * 查询所有职位并分页
     * @param page
     * @param departmentId
     * @param name
     * @return
     */
    Page<List<JobVo>> findAllByPage(Page page, Integer departmentId, String name);


    List<Job> getJobByDeptId(Integer deptId);

    List<Integer> findJobIdByDeptId(Integer id);

    String findNameById(Integer id);
}
