package com.intern.project;

import java.util.ArrayList;

public class AjaxCall {
	private String bid;
	private int groupId;
	private String group_name;
	ArrayList<AjaxCall> view;

	public String getBid() {
		return bid;
	}

	public void setBid(String bid) {
		this.bid = bid;
	}

	public int getGroupId() {
		return groupId;
	}

	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}

	public ArrayList<AjaxCall> getView() {
		return view;
	}

	public void setView(ArrayList<AjaxCall> view) {
		this.view = view;
	}

	public String getGroup_name() {
		return group_name;
	}

	public void setGroup_name(String group_name) {
		this.group_name = group_name;
	}

	@Override
	public String toString() {
		return "AjaxCall [bid=" + bid + ", groupId=" + groupId + ", group_name=" + group_name + "]";
	}

	public String execute() {

		System.out.println(" Selected Batch Id : " + bid);

		setView(DAOGroup.viewdataOfGroup(getBid()));

		System.out.println("Here ArrayList  is:---" + getView().toString());
		if (view.size() > 0) {
			System.out.println("Here Array Size is:-  " + view.size());
			// setGroups(Arrays.asList(new
			// String[]{"Gropu1","Group2","Group3"}));
			return "success";
		}
		return "error";

		// setGroups(Arrays.asList(new String[]{"Gropu1","Group2","Group3"}));

	}

}
