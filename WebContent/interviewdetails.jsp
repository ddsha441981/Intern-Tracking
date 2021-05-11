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

<link rel="stylesheet" href="doubleselectDropdown/css/autocomplete.css">
<script src="doubleselectDropdown/js/jquery.min.js"></script>
<script type="text/javascript"
	src="doubleselectDropdown/js/typeahead.bundle.js"></script>
<style type="text/css">
.error {
	color: red;
}
</style>
<sx:head />
<script type="text/javascript">
	$(document).ready(
			function() {
				// Defining the local dataset
				var citys = 
					 [ 'Pune','Mumbai','Shimla','Jodhpur', 'Jaipur', 'Nagpur', 'Maharastra','Panjab',
						'Utter Pradesh', 'Rajasthan', 'Delhi', 'TamilNadu','Baroda', 'Ahmednagar'];

				// Constructing the suggestion engine
				var citys = new Bloodhound({
					datumTokenizer : Bloodhound.tokenizers.whitespace,
					queryTokenizer : Bloodhound.tokenizers.whitespace,
					local : citys
				});

				// Initializing the typeahead
				$('.typeahead').typeahead({
					hint : true,
					highlight : true, /* Enable substring highlighting */
					minLength : 1
				/* Specify minimum characters required for showing result */
				}, {
					name : 'citys',
					source : citys
				});
			});
</script>
</head>
<body>
	<%@ include file="CommonFile/internHomecommonfile.jsp"%>
	<div class="alert alert-info">
		<h4>
			<strong>Intern !</strong> Interview Feedback:
		</h4>
	</div>
	${requestScope.msg}
	<!-- For Massage -->
	<div class="container">
		<form class="form-horizontal" action="interviewdata" method="get">


			<%-- <div class="form-group">
		<h2>Type your favorite car name</h2>
        <input type="text" class="typeahead tt-query" autocomplete="off" spellcheck="false" placehoder="Select State Name:">
    </div>

		<s:label name="stateName" value="Select State Name:" /> --%>

			<div class="form-group">
				<label class="control-label col-sm-2" for="company_name">Company
					Name:</label>
				<div class="col-sm-10">
					<input type="text" class="form-control" name="company_name"
						placeholder="Enter Company Name">
				</div>
			</div>

			<div class="form-group">
				<label class="control-label col-sm-2">Select Location:</label>
				<div class="col-sm-10">
					<input type="text" name="location_name" class="typeahead tt-query" autocomplete="off"
						spellcheck="false">
				</div>
			</div>


			<div class="form-group">
				<label class="control-label col-sm-2" for="givendate">Given
					Date:</label>
				<div class="col-sm-10">
					<sx:datetimepicker name="givendate" displayFormat="dd/MM/yyyy" value="%{'today'}" cssClass="form-control"></sx:datetimepicker>
				</div>
			</div>


			<div class="form-group">
				<label class="control-label col-sm-2" for="asked_ques">Asked
					Question:</label>
				<div class="col-sm-10">
					<textarea class="form-control" name="asked_ques"
						placeholder="Enter Asked Questions" rows="10"></textarea>
				</div>
			</div>

			<div class="form-group">
				<label class="control-label col-sm-2" for="remarks">Remarks:</label>
				<div class="col-sm-10">
					<textarea class="form-control" name="remarks"
						placeholder="Enter Remark" rows="10"></textarea>
				</div>
			</div>

			<div class="form-group">
				<label class="control-label col-sm-2" for="interview_status">Status:</label>
				<div class="col-sm-10">
					<input type="text" class="form-control" name="interview_status"
						placeholder="Enter Interview Status">
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