package com.tian.control_system.service.impl;

import com.tian.control_system.mapper.UserMapper;
import com.tian.control_system.pojo.User;
import com.tian.control_system.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


/**
 * @author tianhong yu
 * @date 2018年04月27日上午10:22:25
 */
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserMapper userMapper;

	@Override
	public User login(User user) {
		User login = userMapper.login(user);
		if(login != null){
			return login;
		}else {
			throw new RuntimeException("用户名或密码错误！");
		}
	}

	@Override
	public User toLogin(String username, String password) {
		return userMapper.toLogin(username,password);
	}

	@Override
	public int updatePwd(Integer userId, String password) {
         return userMapper.updatePwd(userId,password);
	}

/*
	@Autowired
	private UserMapper userMapper;

	*/
/**
	 * 获取数据库表中所有列转换为对应的实例对象并返回集合
	 *
	 * @return List<User>
	 *//*

    @Override
	public List<User> getAll() {
		return userMapper.getAll();
	}


   */
/**
    * 分页查询
    *
    * @param map
    * @return
    *//*

    @Override
   public Page<List<User>> findPage(Page page,Map<String,Object> map)
   {
	   return userMapper.findPage(page,map);
   }



	*/
/**
	 * 通过ID主键查询出实体对象
     *
	 * @param id  主键
	 * @return User  实体对象
	 *//*

    @Override
	public  User findById(Integer id){
		return userMapper.findById(id);
	}

	*/
/**
	 * 新增一实例插入到数据库表中
	 *
	 * @param  user
	 * @return User
	 *//*

    @Override
	public Integer add(User user) {
		 return userMapper.add(user);
	}


	*/
/**
	 * 根据主键修改实例对象内容
	 *
	 * @param  user
	 * @return User
	 *//*

    @Override
	public void modifyById(User user) {
		userMapper.modifyById(user);
	}


	*/
/**
	 * 删除一实例对象
	 *
	 * @param  user
	 * @return List<User>
	 *//*

    @Override
	public void delete(User user) {
		 userMapper.delete(user);
	}


	*/
/**
	 * 通过主键删除对象
	 *
	 * @param id  主键
	 *//*

    @Override
	public void deleteById(Integer id) {
		 userMapper.deleteById(id);
	}
*/

/*	@Override
	public User login(User user) {
		User userVo = userMapper.login(user);
		if (userVo != null){
			return userVo;
		}else {
			throw new CheckException("用户名或密码错误");
		}
	}

	@Override
	public void updatePwd(Integer userId, String password) {
    	userMapper.updatePwd(userId,password);
	}*/
}
