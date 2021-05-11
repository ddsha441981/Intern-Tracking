<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Intern Tracking  Home</h1>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>
      <a class="navbar-brand" href="#">Intern Tracking</a>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav">
        <li class="active"><a href="home.jsp">Home</a></li>
        <li class="dropdown">
         <a class="dropdown-toggle" data-toggle="dropdown" href="#">Intern Activity <span class="caret"></span></a>
           <ul class="dropdown-menu">
            <li><a href="internApplyToLeave.jsp">Apply To Leave</a></li>
            <li><a href="viewLeave.action">View Leave Status</a></li>
            <li><a href="#">PlaceMent</a></li>
            <li><a href="#">View PlaceMent Details</a></li>
            <li><a href="interviewdetails.jsp">Interview</a></li>
             <li><a href="viewInterviewmydata.action">View Interview</a></li>
          </ul>
        </li>
        <li><a href="AllViewExam.action">Exam Module</a></li>
        <!-- <li><a href="#">Link</a></li> -->
      </ul>
      <ul class="nav navbar-nav navbar-right">
        <li><a href="changepwd.action?id=${requestScope.info.id}"><span class="glyphicon glyphicon-log-out"></span> ChangePassword</a></li>
        <li><a href="logoutfrompage.action?id=${requestScope.info.id}"><span class="glyphicon glyphicon-log-out"></span> Log Out</a></li>
        
      </ul>
    </div>
  </div>
</nav>
</body>
</html>