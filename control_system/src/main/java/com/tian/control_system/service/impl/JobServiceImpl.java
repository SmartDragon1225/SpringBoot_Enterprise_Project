package com.tian.control_system.service.impl;


import com.tian.control_system.common.page.Page;
import com.tian.control_system.mapper.JobMapper;
import com.tian.control_system.pojo.Job;
import com.tian.control_system.pojo.vo.JobVo;
import com.tian.control_system.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


/**
 * @author tianhong yu
 * @date 2018年04月27日上午10:22:25
 */
@Service
public class JobServiceImpl implements JobService {


	@Qualifier("jobMapper")
	@Autowired
	private JobMapper jobMapper;

	/**
	 * 获取数据库表中所有列转换为对应的实例对象并返回集合
	 *
	 * @return List<Job>
	 */
    @Override
	public List<Job> getAll() {
		return jobMapper.getAll();
	}


   /**
    * 分页查询
    *
    * @param map
    * @return
    */
    @Override
   public Page<List<Job>> findPage(Page page, Map<String,Object> map)
   {
	   return jobMapper.findPage(page,map);
   }



	/**
	 * 通过ID主键查询出实体对象
     *
	 * @param id  主键
	 * @return Job  实体对象
	 */
    @Override
	public  Job findById(Integer id){
		return jobMapper.findById(id);
	}

	/**
	 * 新增一实例插入到数据库表中
	 *
	 * @param  job
	 * @return Job
	 */
    @Override
	public Integer add(Job job) {
		 return jobMapper.add(job);
	}


	/**
	 * 根据主键修改实例对象内容
	 *
	 * @param  job
	 * @return Job
	 */
    @Override
	public void modifyById(Job job) {
		jobMapper.modifyById(job);
	}


	/**
	 * 删除一实例对象
	 *
	 * @param  job
	 * @return List<Job>
	 */
    @Override
	public void delete(Job job) {
		 jobMapper.delete(job);
	}


	/**
	 * 通过主键删除对象
	 *
	 * @param id  主键
	 */
    @Override
	public void deleteById(Integer id) {
		 jobMapper.deleteById(id);
	}

	@Override
	public Page<List<JobVo>> findAllByPage(Page page, Integer departmentId, String name) {
		return jobMapper.findAllByPage(page,departmentId,name);
	}

	@Override
	public List<Job> getJobByDeptId(Integer deptId) {
		return jobMapper.getJobByDeptId(deptId);
	}

	@Override
	public List<Integer> findJobIdByDeptId(Integer id) {
		return jobMapper.findJobIdByDeptId(id);
	}

	@Override
	public String findNameById(Integer id) {
		return jobMapper.findNameById(id);
	}
}
