package com.tian.control_system.mapper;


import com.tian.control_system.common.mapper.BaseMapper;
import com.tian.control_system.pojo.Dictionary;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author tianhong yu
 * @date 2018年04月27日上午10:22:25
 */
@Mapper
@Component(value = "dictionaryMapper")
public interface DictionaryMapper extends BaseMapper<Dictionary> {

	//查询全部
	List<Dictionary> findEmployeeStatus();

	//添加
	Integer add(Dictionary dictionary);

	//分页查询
	List<Dictionary> pageList(Integer page,Integer rows);

}
