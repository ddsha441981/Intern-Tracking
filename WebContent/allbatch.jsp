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
    <h4><strong>View!</strong> All Batches</h4>
  </div>
  
   ${requestScope.msg}<!-- For Massage -->
<div class="container">  
 <table class="table table-hover">
 <thead>
		<tr>
			<th>Batch Id</th>
			<th>Batch Name</th>
			<th>Start Date</th>
			<th>End Date</th>
			<th>Project Manger Id</th>
			<th>Action</th>
			<!-- <th>Action</th> -->
		</tr>
 </thead>
		<s:iterator value="b1">
 <tbody>
		<tr>
			<td><s:property value="Bid"/><br></td>
			<td><s:property value="Bname"/><br></td>
			<td><s:property value="Bstrt"/><br></td>
			<td><s:property value="Bend"/></td>
			<td><s:property value="id"/></td>
			<td><a href="editbatch.action?id=<s:property value="Bid"/> " class="btn btn-success">Update Batch</a></td>
			<%-- <td><a href="deletebatch.action?id=<s:property value="Bid"/> " class="btn btn-danger">Delete Batch</a></td> --%>
			
			
		</tr>
		
</tbody>
		</s:iterator>
<!-- <button id="PageRefresh">Refresh a Page in jQuery</button> -->
</table>

</div>
</body>
</html>