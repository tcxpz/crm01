package com.tcxpz.crm.staff.service.impl;

import java.util.List;

import com.tcxpz.crm.staff.dao.StaffDao;
import com.tcxpz.crm.staff.domain.CrmStaff;
import com.tcxpz.crm.staff.service.StaffService;
import com.tcxpz.crm.utils.MD5Utils;

public class StaffServiceImpl implements StaffService {
	private StaffDao staffDao;
	public void setStaffDao(StaffDao staffDao) {
		this.staffDao = staffDao;
	}
	@Override
	public CrmStaff login(CrmStaff crmStaff) {
		return staffDao.find(crmStaff.getLoginName(), MD5Utils.getMD5Value(crmStaff.getLoginPwd()));
	}
	@Override
	public List<CrmStaff> findAllStaff() {
		return staffDao.findAll();
	}
}
