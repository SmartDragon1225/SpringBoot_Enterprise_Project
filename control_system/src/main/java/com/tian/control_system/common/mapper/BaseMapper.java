package com.tian.control_system.common.mapper;



import com.tian.control_system.common.page.Page;

import java.util.List;
import java.util.Map;

/**
 * 基础Mapper
 */
public interface BaseMapper<T> {

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
     * @param t 实体对象
     * @return 自增的id
     */
    Integer add(T t);


    /**
     * 根据主键修改实例对象内容
     *
     * @param t 实体对象
     * @return true 修改成功，false 修改失败
     */
    void modifyById(T t);

    /**
     * 删除一实例对象
     *
     * @param t 实体对象
     * @return true 删除成功，false 删除失败
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
     * @return true 删除成功，false 删除失败
     */
    void deleteById(Integer id);

}
