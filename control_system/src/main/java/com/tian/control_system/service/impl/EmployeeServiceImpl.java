package com.tian.control_system.service.impl;


import com.tian.control_system.common.page.Page;
import com.tian.control_system.mapper.EmployeeMapper;
import com.tian.control_system.pojo.Employee;
import com.tian.control_system.pojo.vo.EmployeeNumber;
import com.tian.control_system.pojo.vo.EmployeeVo;
import com.tian.control_system.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


/**
 * @author tianhong yu
 * @date 2018年04月27日上午10:22:25
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeMapper employeeMapper;

	/**
	 * 获取数据库表中所有列转换为对应的实例对象并返回集合
	 *
	 * @return List<Employee>
	 */
    @Override
	public List<Employee> getAll() {
		return employeeMapper.getAll();
	}


   /**
    * 分页查询
    *
    * @param map
    * @return
    */
    @Override
   public Page<List<Employee>> findPage(Page page, Map<String,Object> map)
   {
	   return employeeMapper.findPage(page,map);
   }



	/**
	 * 通过ID主键查询出实体对象
     *
	 * @param id  主键
	 * @return Employee  实体对象
	 */
    @Override
	public  Employee findById(Integer id){
		return employeeMapper.findById(id);
	}

	/**
	 * 新增一实例插入到数据库表中
	 *
	 * @param  employee
	 * @return Employee
	 */
    @Override
	public Integer add(Employee employee) {
		 return employeeMapper.add(employee);
	}


	/**
	 * 根据主键修改实例对象内容
	 *
	 * @param  employee
	 * @return Employee
	 */
    @Override
	public void modifyById(Employee employee) {
		employeeMapper.modifyById(employee);
	}


	/**
	 * 删除一实例对象
	 *
	 * @param  employee
	 * @return List<Employee>
	 */
    @Override
	public void delete(Employee employee) {
		 employeeMapper.delete(employee);
	}


	/**
	 * 通过主键删除对象
	 *
	 * @param id  主键
	 */
    @Override
	public void deleteById(Integer id) {
		 employeeMapper.deleteById(id);
	}

	/**
	 * 获取所有员工档案
	 * @param page
	 * @param deptId
	 * @param jobId
	 * @param name
	 * @return
	 */
	@Override
	public Page<List<EmployeeVo>> getAllRecordsByPage(Page page, Integer deptId, Integer jobId, String name) {
		return employeeMapper.findAllRecordsByPage(page, deptId, jobId, name);
	}

	/**
	 * 通过Id获取员工信息
	 * @param employeeId
	 * @return
	 */
	@Override
	public EmployeeVo findInfoById(Integer employeeId) {
		return employeeMapper.findInfoById(employeeId);
	}

	@Override
	public EmployeeVo findStatusById(Integer id) {
		return employeeMapper.findStatusById(id);
	}

	@Override
	public List<EmployeeNumber> findEmployeeNum(Integer id) {
		return employeeMapper.findEmployeeNum(id);
	}
}
