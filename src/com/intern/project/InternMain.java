package com.intern.project;

import java.util.ArrayList;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;

public class InternMain implements SessionAware, ServletRequestAware {
	int id;
	String Ifname;
	String Ilname;
	String Iusername;
	String Ipass;
	String Icfpass;
	String Iemail;
	int Imob;
	String Ipm1;
	int Bid;/* Batch id from batch111 for intern to get and see their batch */
	int groupId;
	String msg;
	String resumedata;// Here resume is another variable for resume upload

	
	public String getResumedata() {
		return resumedata;
	}

	public void setResumedata(String resumedata) {
		this.resumedata = resumedata;
	}

	public int getGroupId() {
		return groupId;
	}

	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public int getBid() {
		return Bid;
	}

	public void setBid(int bid) {
		Bid = bid;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIfname() {
		return Ifname;
	}

	public void setIfname(String ifname) {
		Ifname = ifname;
	}

	public String getIlname() {
		return Ilname;
	}

	public void setIlname(String ilname) {
		Ilname = ilname;
	}

	public String getIusername() {
		return Iusername;
	}

	public void setIusername(String iusername) {
		Iusername = iusername;
	}

	public String getIpass() {
		return Ipass;
	}

	public void setIpass(String ipass) {
		Ipass = ipass;
	}

	public String getIcfpass() {
		return Icfpass;
	}

	public void setIcfpass(String icfpass) {
		Icfpass = icfpass;
	}

	public String getIemail() {
		return Iemail;
	}

	public void setIemail(String iemail) {
		Iemail = iemail;
	}

	public int getImob() {
		return Imob;
	}

	public void setImob(int imob) {
		Imob = imob;
	}

	public String getIpm1() {
		return Ipm1;
	}

	public void setIpm1(String ipm1) {
		Ipm1 = ipm1;
	}

	ArrayList<InternMain> list1;

	public ArrayList<InternMain> getList1() {
		return list1;
	}

	public void setList(ArrayList<InternMain> list1) {
		this.list1 = list1;
	}

	@Override
	public String toString() {
		return "InternMain [Iid=" + id + ", Ifname=" + Ifname + ", Ilname=" + Ilname + ", Iusername=" + Iusername
				+ ", Ipass=" + Ipass + ", Icfpass=" + Icfpass + ", Iemail=" + Iemail + ", Imob=" + Imob + "]";
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String saveintern() {
		int i = RegisterInternDao.registerIntern(this);
		if (i > 0) {
			return "success";
		}
		return "error";
	}

	public String allInternData() {
		setList(RegisterInternDao.AlldataIntern(this));
		if (list1.size() > 0) {
			return "success";
		}
		return "error";
	}

	public String InterndatafetchById() {/* Data fetch using id by session */
		int id = (Integer) sessionmap.get("userId");
		System.out.println("Get Record for : " + id);
		InternMain Ipm1 = RegisterInternDao.internFetchById(id);

		System.out.println("Data fetch By Object" + Ipm1);
		if (Ipm1.getId() > 0) { /* if(pm1.getId()>0){ */
			System.out.println("In Condition :-" + Ipm1.getId());
			request.setAttribute("info", Ipm1);

			msg = "<div class='alert alert-success'><strong>Hello!</strong> Login Successfully.</div>";
			return "success";
		}

		msg = "<div class='alert alert-danger'><strong>Hello!</strong> Error try Again!!!!!.</div>";
		return "error";

	}

	public String deletedataById() {
		int j = RegisterInternDao.interndelete(getId());
		System.out.println("Data is " + j);
		if (j > 0) {
			msg = "<div class='alert alert-danger'><strong>Danger!</strong> Contact Delete Successfully.</div>";
			return "success";
		}
		return "error";

	}

	public String uploadresume() {

		System.out.println("file is " + resumedata);

		int i = RegisterInternDao.saveresume(this);
		if (i > 0) {
			return "success";
		}
		return "error";

	}

	Map sessionmap;

	@Override
	public void setSession(Map map) {
		sessionmap = map;

	}

	HttpServletRequest request;

	@Override
	public void setServletRequest(HttpServletRequest arg0) {
		request = arg0;

	}

	/*
	 * public String editProjectManger(){
	 * RegisterProjectMangerDao.editProjectManger(id); return "success"; }
	 */
}
