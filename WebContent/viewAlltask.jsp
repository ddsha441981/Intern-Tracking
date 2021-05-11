<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="css/bootstrap.min.css">
  <script src="js/jquery.min.js"></script>
  <script src="js/bootstrap.min.js"></script>
 
</head>
<body>
<%@ include file="CommonFile/projectHomecommonfile.jsp" %>
<div class="alert alert-info">
    <h4><strong>View!</strong> All Project Assign Project Manger</h4>
  </div>
  
   ${requestScope.msg}<!-- For Massage -->
<div class="container">  
 <table class="table table-hover">
 <thead>
		<tr>
			<!--  <th>AssignId</th> --> 
			<th>Project Topic</th>
			<th>Project Description</th>
			<!-- <th>Start Date</th>
			<th>End Date</th> -->
			<th>Batch Id</th>
			<th>Group Id</th>
			<th>Project Manger Id</th>
			 <th>Project Status</th>
			<!--<th>Action</th> -->
		</tr>
 </thead>
		
 <tbody>
		<tr>
			<%-- <td>${obj.assignId}</td> --%>
			<td>${obj.project_topic}</td>
			<td>${obj.editor1}</td>
			<%-- <td>${obj.Tstrt}</td>
			<td>${obj.Tend}</td> --%>
			<td>${obj.batchlist}</td>
			<td>${obj.grouplist}</td>
			<td>${obj.id}</td>
			<td>${obj.status}</td>
		<td></td>
	</tr>
		
</tbody>

</table>

</div>
</body>
</html>