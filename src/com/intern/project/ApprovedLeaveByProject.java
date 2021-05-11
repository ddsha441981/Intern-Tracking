package com.intern.project;

import java.util.ArrayList;
import java.util.Date;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;

public class ApprovedLeaveByProject implements ServletRequestAware/* SessionAware, */ {
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

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	ArrayList<ApprovedLeaveByProject> JP;

	public ArrayList<ApprovedLeaveByProject> getJP() {
		return JP;
	}

	public void setJP(ArrayList<ApprovedLeaveByProject> jP) {
		JP = jP;
	}
	ApprovedLeaveByProject M1;
	
	public ApprovedLeaveByProject getM1() {
		return M1;
	}

	public void setM1(ApprovedLeaveByProject m1) {
		M1 = m1;
	}

	@Override
	public String toString() {
		return "ApprovedLeaveByProject [leave_Id=" + leave_Id + ", startleave=" + startleave + ", endleave=" + endleave
				+ ", leaveReason=" + leaveReason + ", leaveType=" + leaveType + ", typeLeave=" + typeLeave
				+ ", leaveStatus=" + leaveStatus + ", leaveApplydate=" + leaveApplydate + ", id=" + id + ", JP=" + JP
				+ "]";
	}

	public String approvedleaveofIntern() {
		System.out.println("Here Intern Id is :" + id);
		setJP(DAOApprovedLeaveByProject.approvedleavebyProject());
		if (JP.size() > 0) {
			System.out.println("Here Data is " + JP.toString());

			msg = "<div class='alert alert-success'><strong>Success!</strong> Record Retrive  Successfully.......</div>";
			return "success";
		} else {
			msg = "<div class='alert alert-danger'><strong>Error!</strong> Try Again..........</div>";
			return "error";
		}

	}

	public String updateleaveeditById() {
		System.out.println("Heare Leave Id Is After Ajax Call :"+leave_Id);

		// System.out.println("Here Intern Id is :" + id);
		int count = DAOApprovedLeaveByProject.editLeaveProject(leave_Id);
		if (count > 0) {
			//System.out.println("Here Data is " + M1.toString());
			// request.setAttribute("samsungof", M1);
			msg = "<div class='alert alert-success'><strong>Success!</strong> Record Retrive  Successfully.......</div>";

			return "success";
		} else {
			msg = "<div class='alert alert-danger'><strong>Error!</strong> Try Again..........</div>";
			return "error";
		}

	}

	
	public String removeleaveeditById(){
		int d3 =   DAOApprovedLeaveByProject.removedataLeaveProject(leave_Id);
		if(d3 > 0){
			return "success";
		}
		return "error";
	}
	
	/*
	 * Map sessionmap1;
	 * 
	 * @Override public void setSession(Map arg0) { sessionmap1 = arg0;
	 * 
	 * }
	 */
	HttpServletRequest request;

	@Override
	public void setServletRequest(HttpServletRequest arg0) {
		request = arg0;

	}

}
