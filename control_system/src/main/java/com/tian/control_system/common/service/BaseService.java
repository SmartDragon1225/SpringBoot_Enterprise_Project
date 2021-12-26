package com.tian.control_system.common.service;




import com.tian.control_system.common.page.Page;

import java.util.List;
import java.util.Map;

/**
 * 公共service
 *
 * @author Wenqiang Yang
 * @date 2017/12/10
 */
public interface BaseService<T> {

    /**
     * 获取数据库表中所有对象的集合
     *
     * @return List<T> 对象集合
     */
    List<T> getAll();


    /**
     * 通过ID主键查询出实体对象
     *
     * @param id 主键
     * @return T 实体对象
     */
    T findById(Integer id);

    /**
     * 新增一实例插入到数据库表中
     *
     * @param t
     */
    Integer add(T t);


    /**
     * 根据主键修改实例对象内容
     *
     * @param t
     */
    void modifyById(T t);

    /**
     * 删除一实例对象
     *
     * @param t
     * @return:
     */
    void delete(T t);


    /**
     * 分页查询
     *
     * @param map
     * @return
     */
    Page<List<T>> findPage(Page page, Map<String, Object> map);


    /**
     * 通过主键删除对象
     *
     * @param id 主键
     */
    void deleteById(Integer id);

}
