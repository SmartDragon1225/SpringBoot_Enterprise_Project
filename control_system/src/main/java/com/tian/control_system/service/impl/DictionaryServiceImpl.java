package com.tian.control_system.service.impl;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.tian.control_system.common.BaseUser;
import com.tian.control_system.common.page.Page;
import com.tian.control_system.mapper.DictionaryMapper;
import com.tian.control_system.pageEntity.PageEntity;
import com.tian.control_system.pojo.Dictionary;
import com.tian.control_system.service.DictionaryService;
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
public class DictionaryServiceImpl implements DictionaryService {

	@Qualifier("dictionaryMapper")
	@Autowired
	private DictionaryMapper dictionaryMapper;

	@Override
	public Integer add(Dictionary dictionary) {
		return dictionaryMapper.add(dictionary);
	}

	@Override
	public PageEntity pageList(Integer page, Integer rows) {
		PageHelper.startPage(page,rows);
		List<Dictionary> dictionaryList = dictionaryMapper.pageList(page, rows);
		PageInfo<Dictionary> pageInfo = new PageInfo<>(dictionaryList);
		PageEntity pageEntity = new PageEntity();
		pageEntity.setPageList(pageInfo.getList());
		pageEntity.setTotal(pageInfo.getTotal());
		return pageEntity;
	}

	@Override
	public List<Dictionary> findEmployeeStatus() {
		return null;
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

	/**
	 * 获取数据库表中所有列转换为对应的实例对象并返回集合
	 *
	 * @return List<Dictionary>
	 */
    /*@Override
	public List<Dictionary> getAll() {
		return dictionaryMapper.getAll();
	}


   *//**
	 * 分页查询
	 *
	 * @param map
	 * @return
	 *//*
    @Override
   public Page<List<Dictionary>> findPage(Page page, Map<String,Object> map)
   {
	   return dictionaryMapper.findPage(page,map);
   }



	*//**
	 * 通过ID主键查询出实体对象
	 *
	 * @param id  主键
	 * @return Dictionary  实体对象
	 *//*
    @Override
	public  Dictionary findById(Integer id){
		return dictionaryMapper.findById(id);
	}

	*//**
	 * 新增一实例插入到数据库表中
	 *
	 * @param  dictionary
	 * @return Dictionary
	 *//*
    @Override
	public Integer add(Dictionary dictionary) {
		 return dictionaryMapper.add(dictionary);
	}


	*//**
	 * 根据主键修改实例对象内容
	 *
	 * @param  dictionary
	 * @return Dictionary
	 *//*
    @Override
	public void modifyById(Dictionary dictionary) {
		dictionaryMapper.modifyById(dictionary);
	}


	*//**
	 * 删除一实例对象
	 *
	 * @param  dictionary
	 * @return List<Dictionary>
	 *//*
    @Override
	public void delete(Dictionary dictionary) {
		 dictionaryMapper.delete(dictionary);
	}


	*//**
	 * 通过主键删除对象
	 *
	 * @param id  主键
	 *//*
    @Override
	public void deleteById(Integer id) {
		 dictionaryMapper.deleteById(id);
	}

	@Override
	public List<Dictionary> findEmployeeStatus() {
		return dictionaryMapper.findEmployeeStatus();
	}
}
*/
}