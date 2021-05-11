package com.intern.project;

import java.util.ArrayList;
import java.util.Date;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

public class LeaveofInternMain implements SessionAware {
	int leave_Id;/* Auto Gen */
	Date startleave;
	Date endleave;
	String leaveReason;
	String leaveType;
	String typeLeave;
	String leaveStatus;
	Date leaveApplydate;
	int id;// Intern Id As A Foreign Key
	String msg;
	ArrayList<LeaveofInternMain> MH1;

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

	public int getLeave_Id() {
		return leave_Id;
	}

	public void setLeave_Id(int leave_Id) {
		this.leave_Id = leave_Id;
	}

	public Date getStartleave() {
		return startleave;
	}

	public void setStartleave(Date startleave) {
		this.startleave = startleave;
	}

	public Date getEndleave() {
		return endleave;
	}

	public void setEndleave(Date endleave) {
		this.endleave = endleave;
	}

	public String getLeaveReason() {
		return leaveReason;
	}

	public void setLeaveReason(String leaveReason) {
		this.leaveReason = leaveReason;
	}

	public String getLeaveType() {
		return leaveType;
	}

	public void setLeaveType(String leaveType) {
		this.leaveType = leaveType;
	}

	public String getTypeLeave() {
		return typeLeave;
	}

	public void setTypeLeave(String typeLeave) {
		this.typeLeave = typeLeave;
	}

	public String getLeaveStatus() {
		return leaveStatus;
	}

	public void setLeaveStatus(String leaveStatus) {
		this.leaveStatus = leaveStatus;
	}

	public Date getLeaveApplydate() {
		return leaveApplydate;
	}

	public void setLeaveApplydate(Date leaveApplydate) {
		this.leaveApplydate = leaveApplydate;
	}

	public ArrayList<LeaveofInternMain> getMH1() {
		return MH1;
	}

	public void setMH1(ArrayList<LeaveofInternMain> mH1) {
		MH1 = mH1;
	}

	public String leaveofIntern() {
		int id = (int) sessionmap1.get("userId");
		setId(id);
		System.out.println("Here Intern Id is :" + id);

		int m = DAOLeaveofIntern.leaveofInternsave(this);
		if (m > 0) {
			msg = "<div class='alert alert-success'><strong>Success!</strong> Addded  Successfully.......</div>";
			return "success";
		} else {
			msg = "<div class='alert alert-danger'><strong>Error!</strong> Try Again..........</div>";
			return "error";
		}
	}

	public String viewleaveofIntern() {
		int id = (int) sessionmap1.get("userId");
		setId(id);
		System.out.println("Here Intern Id is :" + id);
		setMH1(DAOLeaveofIntern.viewLeaveallInternById(id));
		if (MH1.size() > 0) {
			System.out.println("Here Data is " + MH1.toString());

			msg = "<div class='alert alert-success'><strong>Success!</strong> Record Retrive  Successfully.......</div>";
			return "success";
		} else {
			msg = "<div class='alert alert-danger'><strong>Error!</strong> Try Again..........</div>";
			return "error";
		}

	}

	Map sessionmap1;

	@Override
	public void setSession(Map arg0) {
		sessionmap1 = arg0;

	}
}
