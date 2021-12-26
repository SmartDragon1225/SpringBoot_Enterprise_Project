/*
package com.tian.control_system.service.impl;


import com.tian.control_system.common.page.Page;
import com.tian.control_system.mapper.RecordMapper;
import com.tian.control_system.service.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


*/
/**
 * @author tianhong yu
 * @date 2018年04月27日上午10:22:25
 *//*

@Service
public class RecordServiceImpl implements RecordService {

	@Autowired
	private RecordMapper recordMapper;

	*/
/**
	 * 获取数据库表中所有列转换为对应的实例对象并返回集合
	 *
	 * @return List<Record>
	 *//*

    @Override
	public List<Record> getAll() {
		return recordMapper.getAll();
	}


   */
/**
    * 分页查询
    *
    * @param map
    * @return
    *//*

    @Override
   public Page<List<Record>> findPage(Page page, Map<String,Object> map)
   {
	   return recordMapper.findPage(page,map);
   }



	*/
/**
	 * 通过ID主键查询出实体对象
     *
	 * @param id  主键
	 * @return Record  实体对象
	 *//*

    @Override
	public  Record findById(Integer id){
		return recordMapper.findById(id);
	}

	*/
/**
	 * 新增一实例插入到数据库表中
	 *
	 * @param  record
	 * @return Record
	 *//*

    @Override
	public Integer add(Record record) {
		 return recordMapper.add(record);
	}


	*/
/**
	 * 根据主键修改实例对象内容
	 *
	 * @param  record
	 * @return Record
	 *//*

    @Override
	public void modifyById(Record record) {
		recordMapper.modifyById(record);
	}


	*/
/**
	 * 删除一实例对象
	 *
	 * @param  record
	 * @return List<Record>
	 *//*

    @Override
	public void delete(Record record) {
		 recordMapper.delete(record);
	}


	*/
/**
	 * 通过主键删除对象
	 *
	 * @param id  主键
	 *//*

    @Override
	public void deleteById(Integer id) {
		 recordMapper.deleteById(id);
	}
}
*/
