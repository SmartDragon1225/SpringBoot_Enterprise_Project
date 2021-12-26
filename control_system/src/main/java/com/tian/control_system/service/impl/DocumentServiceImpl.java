package com.tian.control_system.service.impl;

import com.tian.control_system.common.BaseUser;
import com.tian.control_system.common.page.Page;
import com.tian.control_system.mapper.DocumentMapper;
import com.tian.control_system.pojo.vo.DocumentVo;
import com.tian.control_system.service.DocumentService;
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
public class DocumentServiceImpl implements DocumentService {

	@Qualifier("documentMapper")
	@Autowired
	private DocumentMapper documentMapper;

	@Override
	public Page<List<DocumentVo>> findAllByPage(Page page, String start, String end) {
		return documentMapper.findAllByPage(page,start,end);
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


	/*
	*//**
	 * 获取数据库表中所有列转换为对应的实例对象并返回集合
	 *
	 * @return List<Document>
	 *//*
    @Override
	public List<Document> getAll() {
		return documentMapper.getAll();
	}


   *//**
    * 分页查询
    *
    * @param map
    * @return
    *//*
    @Override
   public Page<List<Document>> findPage(Page page, Map<String,Object> map)
   {
	   return documentMapper.findPage(page,map);
   }



	*//**
	 * 通过ID主键查询出实体对象
     *
	 * @param id  主键
	 * @return Document  实体对象
	 *//*
    @Override
	public  Document findById(Integer id){
		return documentMapper.findById(id);
	}

	*//**
	 * 新增一实例插入到数据库表中
	 *
	 * @param  document
	 * @return Document
	 *//*
    @Override
	public Integer add(Document document) {
		 return documentMapper.add(document);
	}


	*//**
	 * 根据主键修改实例对象内容
	 *
	 * @param  document
	 * @return Document
	 *//*
    @Override
	public void modifyById(Document document) {
		documentMapper.modifyById(document);
	}


	*//**
	 * 删除一实例对象
	 *
	 * @param  document
	 * @return List<Document>
	 *//*
    @Override
	public void delete(Document document) {
		 documentMapper.delete(document);
	}


	*//**
	 * 通过主键删除对象
	 *
	 * @param id  主键
	 *//*
    @Override
	public void deleteById(Integer id) {
		 documentMapper.deleteById(id);
	}

	@Override
	public Page<List<DocumentVo>> findAllByPage(Page page, String start, String end) {
		return documentMapper.findAllByPage(page, start, end);
	}*/
}
