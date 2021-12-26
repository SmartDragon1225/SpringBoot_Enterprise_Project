package com.tian.control_system.mapper;


import com.tian.control_system.common.mapper.BaseMapper;
import com.tian.control_system.common.page.Page;
import com.tian.control_system.pojo.Document;
import com.tian.control_system.pojo.vo.DocumentVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author tianhong yu
 * @date 2018年04月27日上午10:22:25
 */
@Mapper
@Component(value = "documentMapper")
public interface DocumentMapper extends BaseMapper<Document> {

	Page<List<DocumentVo>> findAllByPage(@Param(value = "page") Page page, @Param(value = "start") String start, @Param(value = "end") String end);

}
