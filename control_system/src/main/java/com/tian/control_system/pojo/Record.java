package com.tian.control_system.pojo;

import java.io.Serializable;


/***
 * @author tianhong yu
 * @date 2018年04月27日上午10:22:25
 */
public class Record implements Serializable{

	private static final long serialVersionUID = 1022881033L;

    /**
     * recordId
     */
	private Integer recordId;
    /**
     * cardId
     */
	private String cardId;
    /**
     * address
     */
	private String address;
    /**
     * postCode
     */
	private String postCode;
    /**
     * phone
     */
	private String phone;
    /**
     * tel
     */
	private String tel;
    /**
     * qqNum
     */
	private String qqNum;
    /**
     * email
     */
	private String email;
    /**
     * sex
     */
	private String sex;
    /**
     * 政治面貌
     */
	private String party;
    /**
     * birthday
     */
	private java.util.Date birthday;
    /**
     * 民族
     */
	private String race;
    /**
     * 学业程度
     */
	private String education;
    /**
     * 专业
     */
	private String speciality;
    /**
     * hobby
     */
	private String hobby;
    /**
     * remark
     */
	private String remark;
    /**
     * createTime
     */
	private java.util.Date createTime;

	public Integer getRecordId() {
		return this.recordId;
	}
	public void setRecordId(Integer recordId) {
		this.recordId = recordId;
	}
	public String getCardId() {
		return this.cardId;
	}
	public void setCardId(String cardId) {
		this.cardId = cardId;
	}
	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPostCode() {
		return this.postCode;
	}
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}
	public String getPhone() {
		return this.phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getTel() {
		return this.tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getQqNum() {
		return this.qqNum;
	}
	public void setQqNum(String qqNum) {
		this.qqNum = qqNum;
	}
	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSex() {
		return this.sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getParty() {
		return this.party;
	}
	public void setParty(String party) {
		this.party = party;
	}
	public java.util.Date getBirthday() {
		return this.birthday;
	}
	public void setBirthday(java.util.Date birthday) {
		this.birthday = birthday;
	}
	public String getRace() {
		return this.race;
	}
	public void setRace(String race) {
		this.race = race;
	}
	public String getEducation() {
		return this.education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	public String getSpeciality() {
		return this.speciality;
	}
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	public String getHobby() {
		return this.hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public java.util.Date getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(java.util.Date createTime) {
		this.createTime = createTime;
	}
}