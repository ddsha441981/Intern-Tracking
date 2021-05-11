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
<%@ include file="CommonFile/internHomecommonfile.jsp" %>
<div class="alert alert-info">
    <h4><strong>Project Manger!</strong> Home.</h4>
  </div>
  
  ${requestScope.msg}<!-- For Massage -->
<div class="container">  
 <table class="table table-hover">
 <thead>
		<tr>
			<th>Id</th>
			<th>First Name</th>
			<th>Last Name</th>
			<th>User Name</th>
			<th>Email</th>
			<th>Mobile No.</th>
			<th>Batch Id </th>
			<th>Action </th>
		</tr>
 </thead>
		
 <tbody>
		<tr>
			<td>${info.id}<td>
			<%-- <td>info.Ifname}<td> 
			<td>${requestScope.info.Ilname}<td>
			<td>${requestScope.info.Iusername}<td>
			<td>${requestScope.info.Iemail}<td>
			<td>${requestScope.info.Imob}<td>  --%>
			<%-- <td>${requestScope.info.Bid}<td> --%>
			<td><a href="editIntern.action?id=${Info.id}" class="btn btn-success">Edit Profile</a></td>
		</tr>

</tbody>
<!-- <button id="PageRefresh">Refresh a Page in jQuery</button> -->
</table>

<s:form action="uploadresume" method="get">
	Upload Resume : <s:file cssClass="glyphicon glyphicon-upload" name="resumedata"></s:file>
	<s:submit></s:submit>
	</s:form>
	<br><br>
	<a href="a.jsp" class="glyphicon glyphicon-download-alt">Download Resume</a>
</div>
<div>
	
</div>
</body>
</html>