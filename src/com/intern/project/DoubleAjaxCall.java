package com.intern.project;

import java.util.ArrayList;

public class DoubleAjaxCall{
 private String groupId;
 private int id;/*here id is Intern Id*/
 private String ifname;
 ArrayList<DoubleAjaxCall> VV2;

 
 public String getIfname() {
	return ifname;
}
public void setIfname(String ifname) {
	this.ifname = ifname;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}


public String getGroupId() {
	return groupId;
}
public void setGroupId(String groupId) {
	this.groupId = groupId;
}



public ArrayList<DoubleAjaxCall> getVV2() {
	return VV2;
}
public void setVV2(ArrayList<DoubleAjaxCall> vV2) {
	this.VV2 = vV2;
}

@Override
public String toString() {
	return "DoubleAjaxCall [groupId=" + groupId + ", id=" + id + ", IFname=" + ifname + "]";
}
public String execute(){
	
	 System.out.println(" Selected Group Id : "+groupId);
	 
	 setVV2(DAOGroup.viewdataOfIntern(getGroupId()));
	 
	 System.out.println("Here ArrayList  is:---"+getVV2().toString());
if(VV2.size()>0){
	System.out.println("Here Array Size is:-  "+VV2.size());
	 //setGroups(Arrays.asList(new String[]{"Gropu1","Group2","Group3"}));
	return "success";
}
return "error";
	 
	// setGroups(Arrays.asList(new String[]{"Gropu1","Group2","Group3"}));
	 
 }

}
