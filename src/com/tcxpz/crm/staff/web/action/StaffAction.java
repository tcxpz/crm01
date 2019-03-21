package com.tcxpz.crm.staff.web.action;

import java.util.List;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.tcxpz.crm.staff.domain.CrmStaff;
import com.tcxpz.crm.staff.service.StaffService;

public class StaffAction extends ActionSupport implements ModelDriven<CrmStaff> {
	private CrmStaff crmStaff = new CrmStaff();
	@Override
	public CrmStaff getModel() {
		return crmStaff;
	}
	private StaffService staffService;
	public void setStaffService(StaffService staffService) {
		this.staffService = staffService;
	}
	
	//实现功能
	public String login(){
		CrmStaff staff = staffService.login(crmStaff);
		if(staff != null){
			ActionContext.getContext().getSession().put("loginStaff", staff);
			return "success";
		}
		this.addFieldError("", "用户不存在或密码不正确");
		return "login";
	}
	public String home(){
		return "home";
	}
	public String findAllStaff(){
		List<CrmStaff> crmStaffList = staffService.findAllStaff();
		ActionContext.getContext().put("crmStaffList", crmStaffList);
		return "findAllStaff";
	}
}
