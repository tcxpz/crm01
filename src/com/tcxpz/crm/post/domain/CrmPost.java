package com.tcxpz.crm.post.domain;

import java.util.HashSet;
import java.util.Set;

import com.tcxpz.crm.department.domain.CrmDepartment;

public class CrmPost {
	/*
	 * CREATE TABLE crm_post(
     * postId varchar(255) NOT NULL PRIMARY KEY,
	 * postName varchar(100) DEFAULT NULL,
     * depId varchar(255) DEFAULT NULL,
     * CONSTRAINT FOREIGN KEY (depId) REFERENCES crm_department (depId)
	 * );
	 */
	private String postId;
	private String postName;
	private CrmDepartment crmDepartment;
	private Set<CrmPost> crmPostSet = new HashSet<CrmPost>();
	public String getPostId() {
		return postId;
	}
	public void setPostId(String postId) {
		this.postId = postId;
	}
	public String getPostName() {
		return postName;
	}
	public void setPostName(String postName) {
		this.postName = postName;
	}
	public CrmDepartment getCrmDepartment() {
		return crmDepartment;
	}
	public void setCrmDepartment(CrmDepartment crmDepartment) {
		this.crmDepartment = crmDepartment;
	}
	public Set<CrmPost> getCrmPostSet() {
		return crmPostSet;
	}
	public void setCrmPostSet(Set<CrmPost> crmPostSet) {
		this.crmPostSet = crmPostSet;
	}
	@Override
	public String toString() {
		return "CrmPost [postId=" + postId + ", postName=" + postName
				+ ", crmDepartment=" + crmDepartment + ", crmPostSet="
				+ crmPostSet + "]";
	}
}
