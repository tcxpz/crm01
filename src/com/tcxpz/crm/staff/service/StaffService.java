package com.tcxpz.crm.staff.service;

import java.util.List;

import com.tcxpz.crm.staff.domain.CrmStaff;

public interface StaffService {
	public CrmStaff login(CrmStaff crmStaff);
	public List<CrmStaff> findAllStaff();
}
