package com.tcxpz.crm.staff.dao;

import java.util.List;

import com.tcxpz.crm.staff.domain.CrmStaff;

public interface StaffDao {
	public CrmStaff find(String loginName,String loginPwd);
	public List<CrmStaff> findAll();
}
