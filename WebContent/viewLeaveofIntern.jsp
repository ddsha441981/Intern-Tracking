<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="/struts-tags" prefix="s"%>
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
	<%@ include file="CommonFile/internHomecommonfile.jsp"%>
	<div class="alert alert-info">
		<h4>
			<strong>View!</strong> All Leave of Intern
		</h4>
	</div>

	${requestScope.msg}
	<!-- For Massage -->
	<div class="container">
		<table class="table table-hover">
			<thead>
				<tr>
					<th>Leave Id</th>
					<th>start Leave</th>
					<th>End Leave</th>
					<th>Leave Reason</th>
					<th>Leave Type</th>
					<th>Type Leave</th>
					<th>Leave Status</th>
					<th>Leave Apply date</th>
					<th>id</th>

				</tr>
			</thead>
			<s:iterator value="MH1" var="leaveof">
				<tbody>
					<tr>
						<td>${leaveof.leave_Id}<br></td>
						<td>${leaveof.startleave}<br></td>
						<td>${leaveof.endleave}<br></td>
						<td>${leaveof.leaveReason}</td>
						<td>${leaveof.leaveType}</td>
						<td>${leaveof.typeLeave}</td>
						<td>${leaveof.leaveStatus}</td>
						<td>${leaveof.leaveApplydate}</td>
						<td>${leaveof.id}</td>


					</tr>

				</tbody>
			</s:iterator>
			<!-- <button id="PageRefresh">Refresh a Page in jQuery</button> -->
		</table>

	</div>
</body>
</html>