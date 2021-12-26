package com.tian.control_system.service.impl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.tian.control_system.common.BaseUser;
import com.tian.control_system.common.page.Page;
import com.tian.control_system.mapper.DepartmentMapper;
import com.tian.control_system.pageEntity.PageEntity;
import com.tian.control_system.pojo.Department;
import com.tian.control_system.pojo.vo.DepartmentVo;
import com.tian.control_system.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author tianhong yu
 * @date 2018年04月27日上午10:22:25
 */
@Service
public class DepartmentServiceImpl implements DepartmentService {

	@Qualifier("departmentMapper")
	@Autowired
	private DepartmentMapper departmentMapper;

	public PageEntity pageList(Integer page, Integer rows) {
		PageHelper.startPage(page,rows);//拼接sql ==> limit page,rows
		List<Department> list = departmentMapper.pageList(page,rows);
		PageInfo<Department> pageInfo = new PageInfo<>(list);
		PageEntity pageEntity = new PageEntity();
		pageEntity.setPageList(pageInfo.getList());
		pageEntity.setTotal(pageInfo.getTotal());
		return pageEntity;
	}

	@Override
	public List<Department> select(String name, Integer status) {
		return departmentMapper.select(name,status);
	}

	@Override
	public Page<List<DepartmentVo>> findDepartmentByPage(Page page, Department department) {
		return departmentMapper.findDepartmentByPage(page,department);
	}

	@Override
	public BaseUser findByPhone(String user) {
		return null;
	}

	@Override
	public Set<String> getRoles(Integer userId) {
		return null;
	}

	@Override
	public Set<String> getPermissions(Integer userId) {
		return null;
	}

	@Override
	public void loginSuccess(String username, String host) {

	}

	@Override
	public Integer add(Department department) {
		return departmentMapper.add(department);
	}

	/**
	 * 获取数据库表中所有列转换为对应的实例对象并返回集合
	 *
	 * @return List<Department>
	 */
    /*@Override
	public List<Department> getAll() {
		return departmentMapper.getAll();
	}


   *//**
    * 分页查询
    *
    * @param map
    * @return
    *//*
    @Override
   public Page<List<Department>> findPage(Page page, Map<String,Object> map)
   {
	   return departmentMapper.findPage(page,map);
   }



	*//**
	 * 通过ID主键查询出实体对象
     *
	 * @param id  主键
	 * @return Department  实体对象
	 *//*
    @Override
	public  Department findById(Integer id){
		return departmentMapper.findById(id);
	}

	*//**
	 * 新增一实例插入到数据库表中
	 *
	 * @param  department
	 * @return Department
	 *//*
    @Override
	public Integer add(Department department) {
    	//检查部门名称是否已存在
		Integer count = departmentMapper.findDepartmentByName(department);
		if (count > 0){
			try {
				throw new Exception("部门名称已存在");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		 return departmentMapper.add(department);
	}


	*//**
	 * 根据主键修改实例对象内容
	 *
	 * @param  department
	 * @return Department
	 *//*
    @Override
	public void modifyById(Department department) {
		departmentMapper.modifyById(department);
	}


	*//**
	 * 删除一实例对象
	 *
	 * @param  department
	 * @return List<Department>
	 *//*
    @Override
	public void delete(Department department) {
		 departmentMapper.delete(department);
	}


	*//**
	 * 通过主键删除对象
	 *
	 * @param id  主键
	 *//*
    @Override
	public void deleteById(Integer id) {
		 departmentMapper.deleteById(id);
	}

	*//**
	 * 查询所有部门并分页
	 * @param page
	 * @param
	 * @return
	 *//*
	@Override
	public Page<List<DepartmentVo>> findDepartmentByPage(Page page, Department department) {
		return departmentMapper.findDepartmentByPage(page,department);
	}*/
}
