<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="/struts-tags" prefix="s" %>
     <%@ taglib uri="/struts-dojo-tags" prefix="sx" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<sx:head/>
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
	height: 250px;
	width: 200px;
}
</style>

</head>
<body>
<h1>Add Batch By Intern</h1>
<s:form action="addBatchbyIntern">
<table>
	<tr>
		<td><s:textfield name="Bid" label="Batch Id" cssClass="textboxis"></s:textfield></td>
	</tr>
	<tr>
		<td><s:textfield name="Bname" label="Batch Name" cssClass="textboxis"></s:textfield></td>
	</tr>
	
	<tr>
		<td><sx:datetimepicker label="Start Date : " name="Bstrt" displayFormat="dd/MM/yyyy" value="%{'today'}"></sx:datetimepicker></td>
	</tr>
	
	<tr>
		<td><sx:datetimepicker label="End Date : " name="Bend" displayFormat="dd/MM/yyyy" value="%{'today'}"></sx:datetimepicker></td>
	</tr>
	<tr>
	<td><s:optiontransferselect
  label="All Intern Records"
  name="leftlist;"
  leftTitle="Intern List"
  rightTitle="Add Intern"
  list="list1"
  listValue="Ifname"
  listKey="id"
  headerValue="--- Please Select ---" 
  doubleName="rightlist"
  doubleList=""
  doubleListKey="id"
  doubleListValue="Ifname"
  doubleHeaderValue="--- Please Select ---" /></td>
  </tr>

	<tr>
		<td><s:submit></s:submit></td>
	</tr>
</table>
</s:form>
</body>
</html>