package com.intern.project;
import java.util.ArrayList;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;

public class ProjectMangerMain implements SessionAware,ServletRequestAware{
	int id;
	String fname;
	String lname;
	String username;
	String pass;
	String cfpass;
	String email;
	int mob;
	String pm1;
	String msg;
	
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
	public String getCfpass() {
		return cfpass;
	}
	public void setCfpass(String cfpass) {
		this.cfpass = cfpass;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getMob() {
		return mob;
	}
	public void setMob(int mob) {
		this.mob = mob;
	}
	ArrayList<ProjectMangerMain> list;
	public ArrayList<ProjectMangerMain> getList() {
		return list;
	}
	public void setList(ArrayList<ProjectMangerMain> list) {
		this.list = list;
	}
	
	public String getPm1() {
		return pm1;
	}
	public void setPm1(String pm1) {
		this.pm1 = pm1;
	}
	@Override
	public String toString() {
		return "RegisterProjectmangergetter [id=" + id + ", fname=" + fname + ", lname=" + lname + ", username="
				+ username + ", pass=" + pass + ", cfpass=" + cfpass + ", email=" + email + ", mob=" + mob + "]";
	}
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String saveprojectmanger()  {				/* Insert Values of Project Manger(Registeration) Method */
		int i= RegisterProjectMangerDao.registerProjectManger(this);
		if(i>0)
		{
			return "success";
		}
		return "error";
	}

	public String allProjectManger(){					/* Retrive All Data of Project Manger  Method from Projectmanger111 */
		setList(RegisterProjectMangerDao.AlldataProjectManger(this));
		if(list.size()>0){
			return "success";
		}
		return "error";
	}
	
	public String datafetchById(){/* Data fetch using id by session*/
		int id=(Integer)sessionmap.get("userId");
		System.out.println("Get Record for : "+id);
		ProjectMangerMain pm1= RegisterProjectMangerDao.datafetchById(id);
		
		System.out.println("Data fetch By Object"+pm1);
		if(pm1.getId()>0){ /*if(pm1.getId()>0){*/
			System.out.println("In Condition :-"+pm1.getId());
			request.setAttribute("pmInfo", pm1);
			
			msg="<div class='alert alert-success'><strong>success!</strong> Login SuccessFully!!!!!.</div>";
			return "success";
		}
		msg="<div class='alert alert-danger'><strong>Hello!</strong> Error try Again!!!!!.</div>";
		return "error";
	}
	Map sessionmap;
	@Override
	public void setSession(Map map) {
		  sessionmap=map;  
		  
	}
	HttpServletRequest request;
	@Override
	public void setServletRequest(HttpServletRequest arg0) {
		request=arg0;
		
	}
	
	public String deletedataById(){
		int j= RegisterProjectMangerDao.projectdelete(getId());
		System.out.println("Data is "+j);
		if(j>0){
			msg="<div class='alert alert-danger'><strong>Danger!</strong> Project Manger Delete Successfully.</div>";
			return "success";
		}
		return "error";
		
	}
	
	public String changepwdById(){
		System.out.println("This Is Change Password Method Is Call");
		System.out.println("Here Project Manager Id Is :"+id);
		return "success";
		
	}
	/*public String editProjectManger(){
		RegisterProjectMangerDao.editProjectManger(id);
		return "success";
	}*/
}
