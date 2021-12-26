package com.tian.control_system.pojo;

import java.io.Serializable;


/***
 * @author tianhong yu
 * @date 2018年04月27日上午10:22:25
 */
public class Document implements Serializable{

	private static final long serialVersionUID = 1022268030L;

    /**
     * documentId
     */
	private Integer documentId;
    /**
     * title
     */
	private String title;
    /**
     * content
     */
	private String content;
    /**
     * 文档链接
     */
	private String file;
    /**
     * createBy
     */
	private Integer createBy;
    /**
     * createTime
     */
	private java.util.Date createTime;
    /**
     * 有效时间
     */
	private java.util.Date activeTime;

	public Integer getDocumentId() {
		return this.documentId;
	}
	public void setDocumentId(Integer documentId) {
		this.documentId = documentId;
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
	public String getFile() {
		return this.file;
	}
	public void setFile(String file) {
		this.file = file;
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