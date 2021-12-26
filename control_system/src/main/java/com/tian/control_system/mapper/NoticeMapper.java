package com.tian.control_system.mapper;


import com.tian.control_system.common.mapper.BaseMapper;
import com.tian.control_system.common.page.Page;
import com.tian.control_system.pojo.Notice;
import com.tian.control_system.pojo.vo.NoticeVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author tianhong yu
 * @date 2018年04月27日上午10:22:25
 */
@Mapper
@Component(value = "noticeMapper")
public interface NoticeMapper extends BaseMapper<Notice> {

    /**
     * 分页查询数据
     * @param page
     * @param createTime
     * @param activeTime
     * @return
     */
    Page<List<NoticeVo>> findAllByPage(@Param(value = "page") Page page, @Param(value = "createTime") String createTime, @Param(value = "activeTime") String activeTime);

    NoticeVo findInfoById(@Param(value = "noticeId") Integer id);

}
