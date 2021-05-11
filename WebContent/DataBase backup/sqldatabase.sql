					
1		SQL> desc admin111;								
		 Name                                      Null?    Type								
		 ----------------------------------------- -------- ----------------------------								
		 ID                                        NOT NULL NUMBER(15)								
		 USERA                                              VARCHAR2(50)								
		 PWD                                                VARCHAR2(50)								
										
										
2		SQL> desc projectmanger111;								
		 Name                                      Null?    Type								
		 ----------------------------------------- -------- ----------------------------								
		 ID                                        NOT NULL NUMBER(10)								
		 FNAME                                              VARCHAR2(50)								
		 LNAME                                              VARCHAR2(50)								
		 USERNAME                                           VARCHAR2(50)								
		 PASS                                               VARCHAR2(20)								
		 CFPASS                                             VARCHAR2(20)								
		 EMAIL                                              VARCHAR2(255)								
		 MOB                                                VARCHAR2(15)								
										
										
3		SQL> desc intern;								
		 Name                                      Null?    Type								
		 ----------------------------------------- -------- -------------------								
		 ID                                        NOT NULL NUMBER(10)								
		 IFNAME                                             VARCHAR2(50)								
		 ILNAME                                             VARCHAR2(50)								
		 IUSERNAME                                          VARCHAR2(50)								
		 IPASS                                              VARCHAR2(20)								
		 ICFPASS                                            VARCHAR2(20)								
		 IEMAIL                                             VARCHAR2(255)								
		 IMOB                                               VARCHAR2(15)								
		 BID                                                NUMBER(10)					here batch is a As foreign key			of batch111
		 GROUPID                                            NUMBER(10)					here group is a As foreign key			of group111
										
										
4		SQL> desc batch111;								
		 Name                                      Null?    Type								
		 ----------------------------------------- -------- ----------------------------								
		 BID                                       NOT NULL NUMBER(10)								
		 BNAME                                              VARCHAR2(50)								
		 BSRT                                               DATE								
		 BEND                                               DATE								
		 ID                                                 NUMBER(10)					here id is As foreign key of project manger			
										
										
5		SQL> desc group111;								
		 Name                                      Null?    Type								
		 ----------------------------------------- -------- ----------------------------								
		 GROUPID                                   NOT NULL NUMBER(10)								
		 GROUP_NAME                                         VARCHAR2(50)								
		 BID                                                NUMBER(10)								
		 ID                                                 NUMBER(10)								
										
										
6										
		SQL> desc assignproject1111;								
		 Name                                      Null?    Type								
		 ----------------------------------------- -------- ----------------------------								
		 ASSIGNID                                  NOT NULL NUMBER(10)								
		 PROJECT_TOPIC                                      VARCHAR2(255)								
		 TSTRT                                              DATE								
		 TEND                                               DATE								
		 EDITOR1                                            CLOB								
		 BID                                                NUMBER(10)								
		 GROUPID                                            NUMBER(10)								
		 ID                                                 NUMBER(10)								
		 STATUS                                             VARCHAR2(50)								
										
										
7										
		SQL> desc assigntaskofproject1111;								
		 Name                                      Null?    Type								
		 ----------------------------------------- -------- ----------------------------								
		 ASSIGNTASK_ID                             NOT NULL NUMBER(10)								
		 STARTASSIGNTASK                                    DATE								
		 ENDASSIGNTASK                                      DATE								
		 STATUS                                             VARCHAR2(255)								
		 MINIEDITOR                                         CLOB								
		 BID                                                NUMBER(10)								
		 GROUPID                                            NUMBER(10)								
		 ID                                                 NUMBER(10)								

		 
8

		SQL> desc exammodule111;
		 Name                                      Null?    Type
		 ----------------------------------------- -------- ----------------------------
		 EXAM_ID                                   NOT NULL NUMBER(10)
		 EXAMNAME                                           VARCHAR2(255)
		 TOTAL_QUES                                         NUMBER(38)
		 TOTAL_MARKS                                        NUMBER(38)
		 TIMEE                                              VARCHAR2(255)
		 EXAMDATE                                           DATE
		 EXAMSTATUS                                         VARCHAR2(50)
		 ID                                                 NUMBER(10)
		 
		 
9

		SQL> desc addQuestion1111;
		 Name                                      Null?    Type
		 ----------------------------------------- -------- ----------------------------
		 QUESTION_ID                               NOT NULL NUMBER(10)
		 QUESTIONS                                          BLOB
		 OPTIONA                                            VARCHAR2(255)
		 OPTIONB                                            VARCHAR2(255)
		 OPTIONC                                            VARCHAR2(255)
		 OPTIOND                                            VARCHAR2(255)
		 OPTIONE                                            VARCHAR2(255)
		 OPTIONG                                            VARCHAR2(255)
		 CORRECTANS                                         VARCHAR2(255)
		 QMARKS                                             VARCHAR2(10)
		 EXAM_ID                                            NUMBER(10)