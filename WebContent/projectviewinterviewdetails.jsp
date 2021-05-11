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
    <h4><strong>View!</strong> All Interview Details</h4>
  </div>
  
   ${requestScope.msg}<!-- For Massage -->
<div class="container">  
 <table class="table table-hover">
 <thead>
		<tr>
			<th>Interview Id</th>
			<th>Company Name</th>
			<th>Location</th>
			<th>Asked Question</th>
			<th>Remarks</th>
			<th>Given Date</th>
			<th>Interview Status</th>
			<th>Intern Id</th>
			<th>Action</th>
			
		</tr>
 </thead>
		<s:iterator value="J1">
 <tbody>
		<tr>
			<td><s:property value="intview_id"/><br></td>
			<td><s:property value="company_name"/><br></td>
			<td><s:property value="location_name"/><br></td>
			<td><s:property value="asked_ques"/></td>
			<td><s:property value="remarks"/></td>
			<td><s:property value="givendate"/></td>
			<td><s:property value="interview_status"/></td>
			<td><s:property value="id"/></td>
			
			
			<td> <a onclick="deleteById(<s:property value="intview_id"/>)"   class="btn btn-danger">Remove</a></td> 
			
		</tr>
		
</tbody>
		</s:iterator>

</table>

</div>

 <script type="text/javascript">
	function deleteById(id) {
	alert("Delete Method Execute");
	 //var statusupdate = $('status_id').val;
	 alert(id);
	 
	 $.ajax({
	 		     type: "POST",
				 url: "removeinterview.action",

                 data: "intview_id="+id,

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