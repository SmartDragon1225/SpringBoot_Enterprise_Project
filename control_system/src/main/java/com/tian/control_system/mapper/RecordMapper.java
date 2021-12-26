package com.tian.control_system.mapper;


import com.tian.control_system.common.mapper.BaseMapper;
import com.tian.control_system.pojo.Record;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * @author tianhong yu
 * @date 2018年04月27日上午10:22:25
 */
@Mapper
@Component(value = "recordMapper")
public interface RecordMapper extends BaseMapper<Record> {

	

}
