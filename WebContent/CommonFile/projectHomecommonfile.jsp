<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Project Manger Home</h1>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>
      <a class="navbar-brand" href="home.jsp">Project Manger</a>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav">
        <li class="active"><a href="home.jsp">Home</a></li>
        <li class="dropdown">
         <a class="dropdown-toggle" data-toggle="dropdown" href="#">Intern <span class="caret"></span></a>
           <ul class="dropdown-menu">
            <li><a href="AllIntern.action">See All Intern</a></li>
            <li><a href="RegisterIntern.jsp">Register Intern</a></li>
             <li><a href="viewLeaveByProject.action">Verify Intern Leave</a></li>
              <li><a href="projectmangerverifyInterview.action">Verify Intern Interview</a></li>
           
          </ul>
        </li>
         <li class="dropdown">
         <a class="dropdown-toggle" data-toggle="dropdown" href="#">Batch <span class="caret"></span></a>
           <ul class="dropdown-menu">
            <li><a href="addbatch11.action">Add Batch</a></li>
            <li><a href="seeAllBatch.action">View All Batch</a></li>
            <li><a href="addGruop11.action">Add Group</a></li>
            <li><a href="ViewAllGroup.action">View All Group</a></li>
             <li><a href="assignProjectTaskByprojectManger.action">Assign Project</a></li>
            <li><a href="ViewAssignTask.action">View Assign Project</a></li>
           	<li><a href="AddTaskOfPjt.action"> Add Task Of Project</a></li>
           	<li><a href="ViewTaskOfPjt.action"> View Task Of Project</a></li>
           	<li><a href="createExam.jsp">Create Exam</a></li>
 			<li><a href="ViewExam.action">View Exam</a></li>
 			<li><a href="viewAddedQuestion.action">View Added Questions</a></li>
          </ul>
        </li>
        <!-- <li><a href="#">list</a></li>
        <li><a href="#">List</a></li> -->
      </ul>
      <ul class="nav navbar-nav navbar-right">
        <li><a href="ProjectChangepwd.action?id=${requestScope.pmInfo.id}"><span class="glyphicon glyphicon-user"></span> ChangePassword</a></li>
        <li><a href="logoutfrompage.action?id=${requestScope.pmInfo.id}"><span class="glyphicon glyphicon-log-in"></span> Log Out</a></li>
      </ul>
    </div>
  </div>
</nav>
</body>
</html>