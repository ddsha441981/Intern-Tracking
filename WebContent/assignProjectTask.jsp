<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
       <%@ taglib uri="/struts-tags" prefix="s" %>
        <%@ taglib uri="/struts-dojo-tags" prefix="sx" %>
       <%@ taglib uri="http://ckeditor.com" prefix="ckeditor" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href="css/NewFile.css" rel="stylesheet" type="text/css" />

	<script src="ckeditor/ckeditor.js"></script>
	<script src="ckeditor/samples/js/sample.js"></script>
	<link rel="stylesheet" href="ckeditor/samples/css/samples.css">
	<link rel="stylesheet" href="ckeditor/samples/toolbarconfigurator/lib/codemirror/neo.css">
	<sx:head/>
</head>
<body>
<h1>Assign Project By Project Manger</h1><hr>
<form action="SaveAssignTaskbyProjectManger">
<table>

<tr>
		<td><s:select label="Select Batch" cssClass="textboxis"
  name="batchlist" 
  headerKey="1"
  headerValue="------Select Batch------"
  list="L1"
  listKey="Bid"
  listValue="Bname"
  /></td>
</tr> 
<tr>
	<td><s:select label="Select Group" cssClass="textboxis"
  name="grouplist" 
  headerKey="1"
  headerValue="------Select Group------"
  list="L3"
  listKey="groupId"
  listValue="group_name"
  /></td>
</tr>

<tr>
	<td><s:textfield label="Enter Project Topic" name="project_topic" cssClass="textboxis"></s:textfield></td>
</tr>

<tr>
		<td><sx:datetimepicker label="Start Date : " name="Tstrt" displayFormat="dd/MM/yyyy" value="%{'today'}"></sx:datetimepicker></td>
	</tr>
	
	<tr>
		<td><sx:datetimepicker label="End Date : " name="Tend" displayFormat="dd/MM/yyyy" value="%{'today'}"></sx:datetimepicker></td>
	</tr>

<tr>
	<td>
			<s:textarea label="Project Descripation" id="editor1" cols="80" name="editor1" rows="20"></s:textarea>
	</td>
</tr>

<tr>
	<td><s:submit></s:submit></td>
</tr>
</table>
</form>
<ckeditor:replace replace="editor1" basePath="/ckeditor/" />
</body>
</html>