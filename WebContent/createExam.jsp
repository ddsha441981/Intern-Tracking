<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="/struts-tags" prefix="s" %>
    <%@ taglib uri="/struts-dojo-tags" prefix="sx" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="css/bootstrap.min.css">
  <script src="js/jquery.min.js"></script>
  <script src="js/bootstrap.min.js"></script>
  
  
  	<link rel="stylesheet" href="validation/css/screen.css">
	<script src="validation/js/jquery.js"></script>
	<script src="validation/js/jquery.validate.js"></script>
	<script src="validation/js/Myvalidations.js"></script>
<style type="text/css">
  .error{
  color: red;
  }
  </style>
  <sx:head/>
</head>
<body>
<%@ include file="CommonFile/projectHomecommonfile.jsp" %>
 <div class="alert alert-info">
    <h4><strong>Create!</strong> Exam Form:</h4>
  </div>
  ${requestScope.msg}<!-- For Massage -->
<div class="container">
  <form class="form-horizontal" id="signupForm" action="saveExamdata">
    <div class="form-group">
      <label class="control-label col-sm-2" for="examname">Exam Name:</label>
      <div class="col-sm-10">
        <input type="text" class="form-control" name="examname" placeholder="Enter Exam Name">
      </div>
    </div>
    
     <div class="form-group">
      <label class="control-label col-sm-2" for="total_ques">Total Questions:</label>
      <div class="col-sm-10">
        <input type="text" class="form-control" name="total_ques" placeholder="Enter Total Questions">
      </div>
    </div>
    
    
    <div class="form-group">
      <label class="control-label col-sm-2" for="total_marks">Total Marks:</label>
      <div class="col-sm-10">
        <input type="text" class="form-control" name="total_marks" placeholder="Enter Total Marks">
      </div>
    </div>
    
    
     <div class="form-group">
      <label class="control-label col-sm-2" for="timee">Time:</label>
      <div class="col-sm-10">
        <input type="text" class="form-control" name="timee" placeholder="Enter Exam Time">
      </div>
    </div>
    
    
     <div class="form-group">
      <label class="control-label col-sm-2" for="examdate">Exam Date:</label>
      <div class="col-sm-10">
       <!--  <input type="text" class="form-control" name="username" placeholder="Enter UserName"> -->
       <sx:datetimepicker  name="examdate" displayFormat="dd/MM/yyyy" value="%{'today'}" cssClass="form-control"></sx:datetimepicker>
      </div>
    </div> 
    
    
     <div class="form-group">
      <label class="control-label col-sm-2" for="examstatus">Exam Status:</label>
      <div class="col-sm-10">
        <input type="text" class="form-control" name="examstatus" placeholder="Enter Exam Status">
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