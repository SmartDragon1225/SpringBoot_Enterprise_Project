package com.tian.control_system.service.impl;


import com.tian.control_system.common.page.Page;
import com.tian.control_system.mapper.NoticeMapper;
import com.tian.control_system.pojo.Notice;
import com.tian.control_system.pojo.vo.NoticeVo;
import com.tian.control_system.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


/**
 * @author tianhong yu
 * @date 2018年04月27日上午10:22:25
 */
@Service
public class NoticeServiceImpl implements NoticeService {

	@Autowired
	private NoticeMapper noticeMapper;

	/**
	 * 获取数据库表中所有列转换为对应的实例对象并返回集合
	 *
	 * @return List<Notice>
	 */
    @Override
	public List<Notice> getAll() {
		return noticeMapper.getAll();
	}


   /**
    * 分页查询
    *
    * @param map
    * @return
    */
    @Override
   public Page<List<Notice>> findPage(Page page, Map<String,Object> map)
   {
	   return noticeMapper.findPage(page,map);
   }



	/**
	 * 通过ID主键查询出实体对象
     *
	 * @param id  主键
	 * @return Notice  实体对象
	 */
    @Override
	public  Notice findById(Integer id){
		return noticeMapper.findById(id);
	}

	/**
	 * 新增一实例插入到数据库表中
	 *
	 * @param  notice
	 * @return Notice
	 */
    @Override
	public Integer add(Notice notice) {
		 return noticeMapper.add(notice);
	}


	/**
	 * 根据主键修改实例对象内容
	 *
	 * @param  notice
	 * @return Notice
	 */
    @Override
	public void modifyById(Notice notice) {
		noticeMapper.modifyById(notice);
	}


	/**
	 * 删除一实例对象
	 *
	 * @param  notice
	 * @return List<Notice>
	 */
    @Override
	public void delete(Notice notice) {
		 noticeMapper.delete(notice);
	}


	/**
	 * 通过主键删除对象
	 *
	 * @param id  主键
	 */
    @Override
	public void deleteById(Integer id) {
		 noticeMapper.deleteById(id);
	}

	@Override
	public Page<List<NoticeVo>> findAllByPage(Page page, String createTime, String activeTime) {
		return noticeMapper.findAllByPage(page,createTime,activeTime);
	}

	@Override
	public NoticeVo findInfoById(Integer id) {
		return noticeMapper.findInfoById(id);
	}
}
