package com.tcxpz.crm.staff.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.tcxpz.crm.staff.dao.StaffDao;
import com.tcxpz.crm.staff.domain.CrmStaff;

public class StaffDaoImpl extends HibernateDaoSupport implements StaffDao {

	@Override
	public CrmStaff find(String loginName, String loginPwd) {
		String sql = "from CrmStaff where loginName=? and loginPwd=?";
		List<CrmStaff> crmStaffList = this.getHibernateTemplate().find(sql,loginName,loginPwd);
		if(crmStaffList.size()==1){
			return crmStaffList.get(0);
		}
		return null;
	}

	@Override
	public List<CrmStaff> findAll() {
		return this.getHibernateTemplate().find("from CrmStaff");
	}
}
