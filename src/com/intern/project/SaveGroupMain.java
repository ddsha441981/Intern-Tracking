package com.intern.project;

import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

public class SaveGroupMain implements SessionAware {
	int groupId;/* this is Auto Generated group id */
	int id;/* Project Manger As A Foriegn Key get using Session */
	String group_name;
	String batchlist;/* Batch list As A Foriegn Key (Bid) get using Session */
	String internlist;

	public String getInternlist() {
		return internlist;
	}

	public void setInternlist(String internlist) {
		this.internlist = internlist;
	}

	public int getGroupId() {
		return groupId;
	}

	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGroup_name() {
		return group_name;
	}

	public void setGroup_name(String group_name) {
		this.group_name = group_name;
	}

	public String getBatchlist() {
		return batchlist;
	}

	public void setBatchlist(String batchlist) {
		this.batchlist = batchlist;
	}

	ArrayList<SaveGroupMain> view;

	public ArrayList<SaveGroupMain> getView() {
		return view;
	}

	public void setView(ArrayList<SaveGroupMain> view) {
		this.view = view;
	}

	public String savegroupbyProjectManger() {
		System.out.println("intern selected : " + internlist);
		int id = (Integer) session.get("userId");
		setId(id);/* here this id is project manger id */
		System.out.println("Project Manger Id is :-" + id);
		System.out.println("Batch id is :-" + getBatchlist());
		System.out.println("Intern List is :-" + internlist);

		int i = SaveGroupDAO.savedataOfGroup(this);
		int G1 = RegisterInternDao.groupidforIntern(groupId, internlist);
		if (G1 > 0) {
			System.out.println("After Updateing group Id +" + G1);
			return "success";
		}

		return "error";

	}

	public String viewGroup() {
		setView(SaveGroupDAO.viewdataOfGroup(this));
		if (view.size() > 0) {

			return "success";
		}

		return "error";

	}

	Map session;

	@Override
	public void setSession(Map arg0) {

		session = arg0;
	}
}
