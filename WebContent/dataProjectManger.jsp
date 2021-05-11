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
<%@ include file="CommonFile/adminHomecommonfile.jsp" %>
<div class="alert alert-info">
    <h4><strong>View!</strong> All Project Manger.</h4>
  </div>
  
  ${requestScope.msg}<!-- For Massage -->
<div class="container">  
 <table class="table table-hover">
 <thead>
		<tr>
			<th>Id</th>
			<th>First Name</th>
			<th>Last Name</th>
			<th>UserName</th>
			<th>Password</th>
			<th>Confirm Password</th>
			<th>Email</th>
			<th>Mobile</th>
			<th>Action</th>
			<th>Action</th>
			<th>Action</th>
		</tr>
 </thead>
		<s:iterator value="list">
 <tbody>
		<tr>
			<td><s:property value="id"/></td>
			<td><s:property value="fname"/></td>
			<td><s:property value="lname"/></td>
			<td><s:property value="username"/></td>
			<td><s:property value="pass"/></td>
			<td><s:property value="cfpass"/></td>
			<td><s:property value="email"/></td>
			<td><s:property value="mob"/></td>
			<%-- <td><a href="gotprojectmangerProfile.action?=<s:property value="id"/>"> Go to Profile</a></td> --%>
			<td><a href="deleteprojectmangerProfile.action?id=<s:property value="id"/>" class="btn btn-danger">Delete Profile</a></td>
			<td><a href="gotprojectmangerProfile.action?id=<s:property value="id"/>" class="btn btn-success"> Activate Profile</a></td>
			<td>&nbsp;&nbsp;&nbsp;<a href="gotprojectmangerProfile.action?id=<s:property value="id"/>" class="btn btn-danger"> Deactivate Profile</a></td> 
		</tr>
		
</tbody>
		</s:iterator>
<!-- <button id="PageRefresh">Refresh a Page in jQuery</button> -->
</table>

</div>
</body>
</html>