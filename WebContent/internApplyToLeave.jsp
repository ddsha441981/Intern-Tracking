<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%@ taglib uri="/struts-dojo-tags" prefix="sx"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="css/bootstrap-select.css">
<script src="js/jquery.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/bootstrap-select.js"></script>

<link rel="stylesheet" href="validation/css/screen.css">
<script src="validation/js/jquery.js"></script>
<script src="validation/js/jquery.validate.js"></script>
<script src="validation/js/Myvalidations.js"></script>
<style type="text/css">
.error {
	color: red;
}
</style>
<sx:head />
</head>
<body>
	<%@ include file="CommonFile/internHomecommonfile.jsp"%>
	<div class="alert alert-info">
		<h4>
			<strong>Intern Apply!</strong> Leave Form:
		</h4>
	</div>
	${requestScope.msg}
	<!-- For Massage -->
	<div class="container">
		<form class="form-horizontal" id="signupForm" action="applyToLeave"
			method="get">

			<div class="form-group">
				<label class="control-label col-sm-2" for="startleave">Start
					Date:</label>
				<div class="col-sm-10">

					<sx:datetimepicker name="startleave" displayFormat="dd/MM/yyyy"
						value="%{'today'}" cssClass="form-control"></sx:datetimepicker>
				</div>
			</div>


			<div class="form-group">
				<label class="control-label col-sm-2" for="endleave">End
					Date:</label>
				<div class="col-sm-10">
					<!--  <input type="text" class="form-control" name="username" placeholder="Enter UserName"> -->
					<sx:datetimepicker name="endleave" displayFormat="dd/MM/yyyy"
						value="%{'today'}" cssClass="form-control"></sx:datetimepicker>
				</div>
			</div>

			<div class="form-group">
				<label class="control-label col-sm-2" for="total_ques">Type
					Of Leave:</label> <select id="first-disabled" class="selectpicker"
					data-hide-disabled="true" data-live-search="true" name="typeLeave">
					<optgroup disabled="disabled" label="disabled">
						<option>Hidden</option>
					</optgroup>
					<optgroup label="Select  Types Of Reason">
						<option>Types Of Leave</option>
					</optgroup>

					<option>Half Day</option>
					<option>Full Day</option>
				</select>

			</div>

			<div class="form-group">
				<label class="control-label col-sm-2" for="total_ques">Types
					Of Reason:</label> <select id="first-disabled" class="selectpicker"
					data-hide-disabled="true" data-live-search="true" name="leaveType">
					<optgroup disabled="disabled" label="disabled">
						<option>Hidden</option>
					</optgroup>
					<optgroup label="Select  Types Of Reason">
						<option>Types Of Reason</option>
					</optgroup>

					<option>A</option>
					<option>B</option>
					<option>C</option>
					<option>D</option>
					<option>E</option>
					<option>F</option>
				</select>

			</div>


			<div class="form-group">
				<label class="control-label col-sm-2" for="total_ques">Reason
					Of Leave:</label>
				<div class="col-sm-10">
					<textarea class="form-control" name="leaveReason"
						placeholder="Enter Leave Reasons" rows="10"></textarea>
				</div>
			</div>



			<div class="form-group">
				<label class="control-label col-sm-2" for="leavestatus">Status:</label>
				<div class="col-sm-10">
					<input type="text" class="form-control" name="leaveStatus"
						placeholder="Enter Leave Status" value="pandding">
				</div>
			</div>


			<div class="form-group">
				<label class="control-label col-sm-2" for="examdate">Leave
					Apply Date:</label>
				<div class="col-sm-10">
					<sx:datetimepicker name="leaveApplydate" displayFormat="dd/MM/yyyy"
						value="%{'today'}" cssClass="form-control"></sx:datetimepicker>
				</div>
			</div>


			<div class="form-group">
				<div class="col-sm-offset-2 col-sm-10">
					<div class="checkbox">
						<label><input type="checkbox"> Remember me</label>
					</div>
				</div>
			</div>
			<div class="form-group">
				<div class="col-sm-offset-2 col-sm-10">
					<button type="submit" class="btn btn-success">Submit</button>
				</div>
			</div>
		</form>
	</div>

</body>
</html>