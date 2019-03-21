package com.tcxpz.crm.coursetype.domain;

import java.util.HashSet;
import java.util.Set;

import com.tcxpz.crm.classes.domain.CrmClasses;

public class CrmCourseType {
	/*CREATE TABLE crm_course_type(
	  courseTypeId varchar(255) NOT NULL PRIMARY KEY,
	  courseCost double DEFAULT NULL,
	  total int(11) DEFAULT NULL,
	  courseName varchar(500) DEFAULT NULL,
	  remark varchar(5000) DEFAULT NULL
	);*/
	private String courseTypeId;
	private Double courseCost;
	private Integer total;
	private String courseName;
	private String remark;
	private Set<CrmClasses> crmClasseSet = new HashSet<CrmClasses>();
	public String getCourseTypeId() {
		return courseTypeId;
	}
	public void setCourseTypeId(String courseTypeId) {
		this.courseTypeId = courseTypeId;
	}
	public Double getCourseCost() {
		return courseCost;
	}
	public void setCourseCost(Double courseCost) {
		this.courseCost = courseCost;
	}
	public Integer getTotal() {
		return total;
	}
	public void setTotal(Integer total) {
		this.total = total;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public Set<CrmClasses> getCrmClasseSet() {
		return crmClasseSet;
	}
	public void setCrmClasseSet(Set<CrmClasses> crmClasseSet) {
		this.crmClasseSet = crmClasseSet;
	}
	@Override
	public String toString() {
		return "CrmCourseType [courseTypeId=" + courseTypeId + ", courseCost="
				+ courseCost + ", total=" + total + ", courseName="
				+ courseName + ", remark=" + remark + ", crmClasseSet="
				+ crmClasseSet + "]";
	}
}
