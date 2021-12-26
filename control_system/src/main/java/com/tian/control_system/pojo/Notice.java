package com.tian.control_system.pojo;

import java.io.Serializable;


/***
 * @author tianhong yu
 * @date 2018年04月27日上午10:22:25
 */
public class Notice implements Serializable{

	private static final long serialVersionUID = 1022448028L;

    /**
     * noticeId
     */
	private Integer noticeId;
    /**
     * 标题
     */
	private String title;
    /**
     * content
     */
	private String content;
    /**
     * 创建人
     */
	private Integer createBy;
    /**
     * 创建时间
     */
	private java.util.Date createTime;
    /**
     * 有效时间
     */
	private java.util.Date activeTime;

	public Integer getNoticeId() {
		return this.noticeId;
	}
	public void setNoticeId(Integer noticeId) {
		this.noticeId = noticeId;
	}
	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Integer getCreateBy() {
		return this.createBy;
	}
	public void setCreateBy(Integer createBy) {
		this.createBy = createBy;
	}
	public java.util.Date getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(java.util.Date createTime) {
		this.createTime = createTime;
	}
	public java.util.Date getActiveTime() {
		return this.activeTime;
	}
	public void setActiveTime(java.util.Date activeTime) {
		this.activeTime = activeTime;
	}
}