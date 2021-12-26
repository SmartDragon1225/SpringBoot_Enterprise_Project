package com.tian.control_system.service;




import com.tian.control_system.common.page.Page;
import com.tian.control_system.common.service.BaseService;
import com.tian.control_system.pojo.Notice;
import com.tian.control_system.pojo.vo.NoticeVo;

import java.util.List;

/**
 * @author tianhong yu
 * @date 2018年04月27日上午10:22:25
 */
public interface NoticeService extends BaseService<Notice> {

    /**
     * 分页查询数据
     * @param page
     * @param createTime
     * @param activeTime
     * @return
     */
    Page<List<NoticeVo>> findAllByPage(Page page, String createTime, String activeTime);

    NoticeVo findInfoById(Integer id);

}
