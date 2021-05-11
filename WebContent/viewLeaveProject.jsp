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
	<%@ include file="CommonFile/projectHomecommonfile.jsp"%>
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
					<th>Update Status</th>
					<th>Remove Leave</th>
				</tr>
			</thead>
			<s:iterator value="JP" var="lea">
				<tbody>
					<tr>
						<td>${lea.leave_Id}<br></td>
						<td>${lea.startleave}<br></td>
						<td>${lea.endleave}<br></td>
						<td>${lea.leaveReason}</td>
						<td>${lea.leaveType}</td>
						<td>${lea.typeLeave}</td>
						<td>${lea.leaveStatus}</td>
						<td>${lea.leaveApplydate}</td>
						<td>${lea.id}</td>
						<td><a
							<%-- href="editviewLeaveByProject.action?leave_Id=${lea.leave_Id} " --%>
							class="btn btn-success" onclick="updatestatus(${lea.leave_Id})">Update</a></td>
							
							<td><a
							class="btn btn-danger" onclick="removebyprojectstatus(${lea.leave_Id})">Remove</a></td>

					</tr>

				</tbody>
			</s:iterator>
			<!-- <button id="PageRefresh">Refresh a Page in jQuery</button> -->
		</table>

	</div>
	<script type="text/javascript">
	function updatestatus(id) {
	alert("Update Method Is Execute");
	 //var statusupdate = $('status_id').val;
	 alert(id);
	 
	 $.ajax({
	 		     type: "POST",
				 url: "editviewLeaveByProject.action",

                 data: "leave_Id="+id,

                 success: function(response){

                 // we have the response
					alert('Success: ' + e);
                    },

                    error: function(e){

                        alert('Error: ' + e);

                    }

                });
	 
		
	}
	
	</script>
	
	<script type="text/javascript">
	function removebyprojectstatus(id) {
	alert("Remove Method Is Execute");
	 //var statusupdate = $('status_id').val;
	 alert(id);
	 
	 $.ajax({
	 		     type: "POST",
				 url: "removeviewLeaveByProject.action",

                 data: "leave_Id="+id,

                 success: function(response){

                 // we have the response
					alert('Success: ' + e);
                    },

                    error: function(e){

                        alert('Error: ' + e);

                    }

                });
	 
		
	}
	
	</script>
</body>
</html>