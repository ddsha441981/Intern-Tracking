----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 																Intern Tracking DataBase
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

create table admin111
 (
 		id  NUMBER(15)primary key,							
		userA VARCHAR2(50),							
		pwd VARCHAR2(50)		
);
insert into admin111 values(1,'admin','admin');
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

create table projectmanger111
(		id number(10) primary key,
		fname VARCHAR2(50),								
		lname VARCHAR2(50),							
		username VARCHAR2(50),								
		pass VARCHAR2(20),							
		cfpass VARCHAR2(20),								
		email VARCHAR2(255),								
		mob VARCHAR2(15)	
);

----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

create table intern
(
		 id NUMBER(10) primary key,						
		 Ifname VARCHAR2(50),								
		 Ilname VARCHAR2(50),								
		 Iusername VARCHAR2(50),								
		 Ipass VARCHAR2(20),							
		 Icfpass VARCHAR2(20),								
		 Iemail VARCHAR2(255),								
		 Imob VARCHAR2(15),								
		 Bid number(10),
		 FOREIGN KEY (Bid) REFERENCES batch111(Bid),					
		 groupId number(10),
		FOREIGN KEY (groupId) REFERENCES group111(groupId)
);

----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

create table batch111
(
		Bid number(10) primary key,
		Bname varchar(50),
		Bsrt date,
		Bend date,
		id number(10),
		FOREIGN KEY (id) REFERENCES projectmanger111(id)
);
insert into batch111 values(201,'java Doveloper','10/06/2017','16/06/2017','1');
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

create table group111
(
		groupId number(10) primary key,
		group_name varchar(50),
		batchlist varchar(255),
		leftlist varchar(255),
		Bid number(10),
		FOREIGN KEY (Bid) REFERENCES batch111(Bid),
		id number(10),
		FOREIGN KEY (id) REFERENCES projectmanger111(id)
);

----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

create table assignproject1111 
(
		assignId number(10) primary key,
		project_topic varchar(255),
		Tstrt date,
		Tend date,
		editor1 clob,
		Bid number(10),
		FOREIGN KEY (Bid) REFERENCES batch111(Bid),
		groupId number(10),
		FOREIGN KEY (groupId) REFERENCES group111(groupId),
		id number(10),
		FOREIGN KEY (id) REFERENCES projectmanger111(id)
);

----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

create table assigntaskofproject1111
(
		assigntask_id number(10) primary key,
		startassigntask Date,
		endassigntask Date,
		status varchar(255),
		minieditor clob,
		Bid number(10),
		FOREIGN KEY (Bid) REFERENCES batch111(Bid),
		groupId number(10),
		FOREIGN KEY (groupId) REFERENCES group111(groupId),
		id number(10),
		FOREIGN KEY (id) REFERENCES intern(id)
);

----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

create table exammodule111
(
		exam_id number(10) primary key,
		examname varchar(255),
		total_ques number(9),
		total_marks number(9),
		timee varchar(255),
		examdate Date,
		examstatus varchar(50),
		id number(10),
		FOREIGN KEY (id) REFERENCES projectmanger111(id)
);

----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		
		alter table intern add groupId number(10),
		FOREIGN KEY (groupId) REFERENCES group111(groupId);
		
		alter table intern add groupId number(10);
		
		alter table intern add FOREIGN KEY (groupId)REFERENCES group111(groupId);
		

----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

		create table addQuestion1111
(
		question_id number(10) primary key,
		questions blob,
	 	optionA varchar(255),
		optionB varchar(255),
		optionC varchar(255),
		optionD varchar(255),
		optionE varchar(255),
		optionG varchar(255),
		correctans varchar(255),
		qmarks varchar(10),
		exam_id number(10),
		FOREIGN KEY(exam_id)REFERENCES exammodule111(exam_id)
);

		create table addQuestiontest1111
(
		question_id number(10) primary key,
		questions clob,
	 	optionA varchar(255),
		optionB varchar(255),
		optionC varchar(255),
		optionD varchar(255),
		optionE varchar(255),
		optionG varchar(255),
		correctans varchar(255),
		qmarks varchar(10),
		exam_id number(10),
		FOREIGN KEY(exam_id)REFERENCES exammodule111(exam_id)
);

----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

create table internLeave
(
	leave_Id number(9) primary key,
	startleave date,
	endleave date,
	leaveReason clob,
	leaveType varchar(50),
	typeLeave varchar(50),
	leaveStatus varchar(50),
	leaveApplydate date,
	id number(9),
	FOREIGN KEY(id)REFERENCES intern(id)
);

----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
create table myresume
(
	resume_id number(9) primary key,
	resumedata clob
);

----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
create table interviewdata1111
(
	intview_id number(9) primary key,
	company_name varchar(255),
	location_name varchar(255),
	asked_ques clob,
	remarks varchar(255),
	givendate date,
	interview_status varchar(50),
	id number(9),
	FOREIGN KEY(id)REFERENCES intern(id)
);



----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
															Sequence
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------	
seq1,(for add group)
seq2,(for project task)
seq3,(for assign project)
seq4,(For Exam Module)
seq5,(For Exam Add Question)
seq6,(For Intern Leave)
seq7,(For Resume Upload)
seq8,(For Interview mydata)

Find All Sequence
 select * from user_sequences;
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
