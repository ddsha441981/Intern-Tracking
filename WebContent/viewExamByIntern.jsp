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
<%@ include file="CommonFile/internHomecommonfile.jsp" %>
<div class="alert alert-info">
    <h4><strong>View!</strong> All Batches</h4>
  </div>
  
   ${requestScope.msg}<!-- For Massage -->
<div class="container">  
 <table class="table table-hover">
 <thead>
		<tr>
			<th>Exam Id</th>
			<th>Exam Name</th>
			<th>Total Question</th>
			<th>Total Marks</th>
			<th>Exam Time</th>
			<th>Exam Date</th>
			<th>Exam Status</th>
			<th>Project Manger Id</th>
			<th>Action</th>
			 <th>Action</th>
			<!-- <th>Action</th> -->
			<!-- <th>Action</th> -->
		</tr>
 </thead>
		<s:iterator value="examlist">
 <tbody>
		<tr>
			<td><s:property value="exam_id"/><br></td>
			<td><s:property value="examname"/><br></td>
			<td><s:property value="total_ques"/><br></td>
			<td><s:property value="total_marks"/></td>
			<td><s:property value="timee"/></td>
			<td><s:property value="examdate"/></td>
			<td><s:property value="examstatus"/></td>
			<td><s:property value="id"/></td>
			<%-- <td><a href="editexam.action?exam_id=<s:property value="exam_id"/> " class="btn btn-success">Update</a></td> --%>
			 <%-- <td><a href="attemptExam.action?exam_id=<s:property value="exam_id"/> " class="btn btn-success">Attempt Exam</a></td> --%> 
			<td><a href="viewInstructions.action?exam_id=<s:property value="exam_id"/>"  class="btn btn-success">Attempt Exam</a></td> 
			 <td><a href="answers.action?exam_id=<s:property value="exam_id"/> " class="btn btn-success">Result</a></td> 
			
		</tr>
		
</tbody>
		</s:iterator>
<!-- <button id="PageRefresh">Refresh a Page in jQuery</button> -->
</table>

</div>
</body>
</html>