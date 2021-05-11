package com.intern.project;

import java.util.ArrayList;

public class GroupofList {

	ArrayList<AddBatchMain> L1;
	ArrayList<InternMain> L2;
	ArrayList<SaveGroupMain> L3;
	
	
	public ArrayList<AddBatchMain> getL1() {
		return L1;
	}



	public void setL1(ArrayList<AddBatchMain> l1) {
		L1 = l1;
	}



	public ArrayList<InternMain> getL2() {
		return L2;
	}



	public void setL2(ArrayList<InternMain> l2) {
		L2 = l2;
	}



	public ArrayList<SaveGroupMain> getL3() {
		return L3;
	}



	public void setL3(ArrayList<SaveGroupMain> l3) {
		L3 = l3;
	}



	public String listofInternBatch(){
		
		 L1 = AddBatchDao.Allfetchbatch(new AddBatchMain());
		 L2 = RegisterInternDao.AlldataIntern(new InternMain());
		 L3 = SaveGroupDAO.viewdataOfGroup(new SaveGroupMain());
		 if(L1.size()>0 || L2.size()>0 || L3.size()>0) {
			 System.out.println("Batch Name  List is :-"+L1);
			 System.out.println("Intern List is :-"+L2);
			 System.out.println("Group List is :-"+L3);
		return "success";
		 }
		return "error";
	}
	
}
