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
    <h4><strong>View!</strong> All Groups</h4>
  </div>
  
   ${requestScope.msg}<!-- For Massage -->
<div class="container">  
 <table class="table table-hover">
 <thead>
		<tr>
			<th>Group Id</th>
			<th>Group Name</th>
			<th>Batch Id</th>
			<th>Project Manger Id</th>
			<th>Action</th>
			<th>Action</th>
		</tr>
 </thead>
		<s:iterator value="view">
 <tbody>
		<tr>
			<td><s:property value="groupId"/><br></td>
			<td><s:property value="group_name"/><br></td>
			<td><s:property value="batchlist"/><br></td>
			<td><s:property value="id"/></td>
			<td><a href="e.action?id=<s:property value="groupId"/> " class="btn btn-success">Update Group</a></td>
			<td><a href="de.action?id=<s:property value="groupId"/> " class="btn btn-danger">Delete Group</a></td>
			
			
		</tr>
		
</tbody>
		</s:iterator>
<!-- <button id="PageRefresh">Refresh a Page in jQuery</button> -->
</table>

</div>
</body>
</html>