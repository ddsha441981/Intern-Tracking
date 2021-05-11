package com.intern.project;

import java.util.Date;

public class ProjecttaskMain {
	int assigntask_id;/*Here assigntask_id is Auto Generated*/
	String batch_name;/*Here Bname is batch name and foriegn key (Bid) of batch*/
	String group_name;/*Here groupName is foriegn key(GroupId) of group111*/
	String intern_name;/*Here Ifname is As a forign key (Intern Id) As a Intern */
	Date startassigntask;
	Date endassigntask;
	String status;
	String minieditor;
	public int getAssigntask_id() {
		return assigntask_id;
	}
	public void setAssigntask_id(int assigntask_id) {
		this.assigntask_id = assigntask_id;
	}
	public String getBatch_name() {
		return batch_name;
	}
	public void setBatch_name(String batch_name) {
		this.batch_name = batch_name;
	}
	public String getGroup_name() {
		return group_name;
	}
	public void setGroup_name(String group_name) {
		this.group_name = group_name;
	}
	public String getIntern_name() {
		return intern_name;
	}
	public void setIntern_name(String intern_name) {
		this.intern_name = intern_name;
	}
	public Date getStartassigntask() {
		return startassigntask;
	}
	public void setStartassigntask(Date startassigntask) {
		this.startassigntask = startassigntask;
	}
	public Date getEndassigntask() {
		return endassigntask;
	}
	public void setEndassigntask(Date endassigntask) {
		this.endassigntask = endassigntask;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMinieditor() {
		return minieditor;
	}
	public void setMinieditor(String minieditor) {
		this.minieditor = minieditor;
	}
	
	
	public String addtaskofproject(){
		System.out.println("here batch id :"+batch_name);
		System.out.println("here Group id :"+group_name);
		System.out.println("here Intern id :"+intern_name);
		System.out.println("here status is :"+minieditor);
		int p= DAOAssigntaskProject.addtakassigntaskofPrject(this);
		if(p>0){
				return "success";
			}
			return "error";
		
		
	}
	
	
}
