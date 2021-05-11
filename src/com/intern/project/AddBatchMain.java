package com.intern.project;

import java.util.ArrayList;
import java.util.Date;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

public class AddBatchMain implements SessionAware {
int Bid;
String Bname;
Date Bstrt;
Date Bend;
int id;/*Id is project manger*/
/*String leftlist; Data fetch from database without save data */
String rightlist; /* data insert*/
String msg;

public String getMsg() {
	return msg;
}

public void setMsg(String msg) {
	this.msg = msg;
}

ArrayList<AddBatchMain> b1;


public ArrayList<AddBatchMain> getB1() {
	return b1;
}

public void setB1(ArrayList<AddBatchMain> b1) {
	this.b1 = b1;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public int getBid() {
	return Bid;
}

public void setBid(int bid) {
	Bid = bid;
}

public String getBname() {
	return Bname;
}

public void setBname(String bname) {
	Bname = bname;
}

public Date getBstrt() {
	return Bstrt;
}

public void setBstrt(Date bstrt) {
	Bstrt = bstrt;
}

public Date getBend() {
	return Bend;
}

public void setBend(Date bend) {
	Bend = bend;
}

/*public String getLeftlist() {
	return leftlist;
}

public void setLeftlist(String leftlist) {
	this.leftlist = leftlist;
}*/

public String getRightlist() {
	return rightlist;
}

public void setRightlist(String rightlist) {
	this.rightlist = rightlist;
}

/*@Override
public String toString() {
	return "AddBatchMain [Bid=" + Bid + ", Bname=" + Bname + ", Bstrt=" + Bstrt + ", Bend=" + Bend + "]";
}*/

public String saveBatch(){
	System.out.println("intern selected : "+rightlist);
	int id=(Integer)mysession.get("userId");
	setId(id);
	int i= AddBatchDao.addBatchByProjectManger(this);
	int i1= RegisterInternDao.batchidforIntern(Bid,rightlist);
	if(i1>0)
	{
		return "success";
	}
	return "error";
}

public String allbatch(){					/* Retrive All Data of Batch Method */
	setB1(AddBatchDao.Allfetchbatch(this));
	if(b1.size()>0){

		return "success";
	}
	
	return "error";
}

public String deleteBatchByProject(){
	int j= AddBatchDao.batchDeleteById(getBid());
	System.out.println("Data is "+j);
	if(j>0){
		msg="<div class='alert alert-danger'><strong>Danger!</strong> Contact Delete Successfully.</div>";
		return "success";
	}
	return "error";
	
}

Map mysession;
@Override
public void setSession(Map map1) {
	mysession = map1;
	
}
	
}
