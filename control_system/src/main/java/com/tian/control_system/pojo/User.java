package com.tian.control_system.pojo;

import java.io.Serializable;


/***
 * @author tianhong yu
 * @date 2018年04月27日上午10:22:25
 */
public class User implements Serializable{

	private static final long serialVersionUID = 1022494027L;

    /**
     * 用户Id
     */
	private Integer uid;
    /**
     * 用户名
     */
	private String username;
    /**
     * 密码
     */
	private String password;

	public Integer getUid() {
		return this.uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public String getUsername() {
		return this.username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return this.password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}