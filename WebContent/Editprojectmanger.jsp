<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
.textboxis{
	
	border: 2px solid #456879;
	border-radius:10px;
	height: 22px;
	width: 230px;
}

.textareais{
	
	border: 2px solid #456879;
	border-radius:10px;
	height: 80px;
	width: 230px;
}
</style>
</head>
<body>
<h1>Project Manger Register Form</h1>
<s:form action="aProjectmanger">
<table>
		<tr>
			<td><s:textfield name="id" label="Enter Id" cssClass="textboxis" value='<s:property="%{requestScope.pmInfo.fname}"'>></s:textfield></td>
		</tr>
		
		<tr>
			<td><s:textfield name="fname" label="Enter First Name" cssClass="textboxis"></s:textfield></td>
		</tr>
		
		
		<tr>
			<td><s:textfield name="lname" label="Enter Last Name" cssClass="textboxis"></s:textfield></td>
		</tr>
		
		<tr>
			<td><s:textfield name="username" label="Enter User Name" cssClass="textboxis"></s:textfield></td>
		</tr>
		
		<tr>
			<td><s:password name="pass" label="Enter Password" cssClass="textboxis"></s:password></td>
		</tr>
		
		<tr>
			<td><s:password name="cfpass" label="Enter Confirm Password" cssClass="textboxis"></s:password></td>
		</tr>
		
		<tr>
			<td><s:textfield name="email" label="Enter Email" cssClass="textboxis"></s:textfield></td>
		</tr>
		
		<tr>
			<td><s:textfield name="mob" label="Enter Mobile No" cssClass="textboxis"></s:textfield></td>
		</tr>
		
		<tr>
			<td><s:submit></s:submit></td>
		</tr>
</table>
</s:form>
</body>
</html>