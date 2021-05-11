<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View Exam Module</title>
<link rel="stylesheet" href="css/bootstrap.min.css">
  <script src="js/jquery.min.js"></script>
  <script src="js/bootstrap.min.js"></script>
 
</head>
<body>
<%@ include file="CommonFile/projectHomecommonfile.jsp" %>
<div class="alert alert-info">
    <h4><strong>View!</strong> All Questions</h4>
  </div>
  
   ${requestScope.msg}<!-- For Massage -->
<div class="container">  
 <table class="table table-hover">
 <thead>
		<tr>
			<th>Question Id</th>
			<th>Question</th>
			<th>Option A</th>
			<th>Option B</th>
			<th>Option C</th>
			<th>Option D</th>
			<th>Option E</th>
			<th>Option F</th>
			<th>Correct Answer</th>
			<th>Question Marks</th>
			<th>Exam Id</th>
			<!-- <th>Action</th> -->
		</tr>
 </thead>
		<s:iterator value="questionList">
 <tbody>
		<tr>
			<td><s:property value="question_Id"/><br></td>
			<td><s:property value="questions"/><br></td>
			<td><s:property value="optionA"/><br></td>
			<td><s:property value="optionB"/></td>
			<td><s:property value="optionC"/></td>
			<td><s:property value="optionD"/></td>
			<td><s:property value="optionE"/></td>
			<td><s:property value="optionG"/></td>
			<td><s:property value="correctans"/></td>
			<td><s:property value="qmarks"/></td>
			<td><s:property value="exam_id"/></td>
			
		</tr>
		
</tbody>
		</s:iterator>
<!-- <button id="PageRefresh">Refresh a Page in jQuery</button> -->
</table>

</div>
</body>
</html>