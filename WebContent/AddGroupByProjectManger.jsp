<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href="css/NewFile.css" rel="stylesheet" type="text/css" />

<link rel="stylesheet" href="css/bootstrap.min.css">
  <script src="js/jquery.min.js"></script>
  <script src="js/bootstrap.min.js"></script>
 
</head>
<body>
<%@ include file="CommonFile/projectHomecommonfile.jsp" %>
<h1>Add Group By Project Manger </h1>
<hr width="1350" style="border-bottom-style: dotted;">
<s:form action="Savegroup">
<table>

<tr>
	<td>Enter Group Name<s:textfield name="group_name"  cssClass="textboxis"></s:textfield></td>
</tr>

 <tr>
		<td>Select Batch<s:select cssClass="textboxis"
  name="batchlist" 
  headerKey="1"
  headerValue="------Select Batch------"
  list="L1"
  listKey="Bid"
  listValue="Bname" 
  /></td>
</tr> 
 	<tr>
	<td>Select Intern
	
	<s:select  cssClass="textareais"
  name="internlist" 
  size="5"
  multiple="true"
  list="L2"
  listKey="id"
  listValue="Ifname"
  
  />
  
	<%-- <s:optiontransferselect
  label="All Intern Records"
  name="leftlist;"
  leftTitle="Intern List"
  rightTitle="Add Intern"
  list="L2"
  listValue="Ifname"
  listKey="id"
  headerValue="--- Please Select ---" 
  doubleName="internlist"
  doubleList=""
  doubleListKey="id"
  doubleListValue="Ifname"
  doubleHeaderValue="--- Please Select ---" /> --%>
  
  
  </td>
  </tr>
<tr>
	<td><s:submit></s:submit></td>
</tr>
</table>
  
  </s:form>
</body>
</html>