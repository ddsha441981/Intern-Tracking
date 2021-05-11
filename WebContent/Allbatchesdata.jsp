<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<s:select label="Select Batch" cssClass="textboxis"
  name="batchlist" 
  headerKey="1"
  headerValue="------Select Batch------"
  list="L1"
  listKey="Bid"
  listValue="Bname"
  />
<br><br>
<s:select label="Select Intern" cssClass="textareais"
  name="internlist" 
  size="5"
  multiple="true"
  list="L2"
  listKey="id"
  listValue="Ifname"
  
  />

<br><br>
All batch list and intern list
<h5>Here Batch</h5>
<s:iterator value="L1">
<br><s:property value="Bid"/>
</s:iterator>

<br><br><br>
<h5>Here Intern Id</h5>
<s:iterator value="L2">
<br><s:property value="id"/>

</s:iterator>
<br><br><br>
<h5>Here groupId</h5>
<s:iterator value="L3">
<br><s:property value="groupId"/>
</s:iterator>
</body>
</html>