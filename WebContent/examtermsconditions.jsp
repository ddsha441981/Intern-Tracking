<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href="css/NewFile.css" rel="stylesheet" type="text/css" />

<link rel="stylesheet" href="css/bootstrap.min.css">
  <script src="js/jquery.min.js"></script>
  <script src="js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
    <style type="text/css">
        .row {
  display: flex; /* equal height of the children */
}

.col {
  flex: 1; /* additionally, equal width */
  font-size:medium;
  font-family:monospace;
  padding: 1em;
 

}
h2{
text-decoration:underline;
text-align: center; 
}
b{
color: purple;

}
  </style>
</head>
<body>
<%@ include file="CommonFile/internHomecommonfile.jsp" %>
    <div class="row">
  <div class="col"><h2><b>Instruction:</b></h2><br>
<blockquote>Name Of Exam :-->>  <b>${myinstruction.examname}</b><br></blockquote>
<blockquote>Total number of questions:-->>  <b>${myinstruction.total_ques}</b><br></blockquote>
<blockquote>Time alloted:-->>  <b>${myinstruction.timee}</b><br></blockquote>
<blockquote>Total Marks:-->>  <b>${myinstruction.total_marks}</b><br></blockquote>
<blockquote>It's Mandatory to Attempt Each question, no negative marks.</blockquote></div>
  <div class="col"><h2><b>Note:</b></h2><br>
<blockquote>Click the 'Submit Test' button given in the bottom of this page to Submit your answers.<br></blockquote>
<blockquote>Test will be submitted automatically if the time expired.<br></blockquote>
<blockquote>Don't refresh the page.</blockquote><br>
<blockquote>Don't refresh the page.</blockquote></div>
</div>
<a href="attemptExam.action?exam_id=${myinstruction.exam_id}" class="btn btn-success" onclick="confirmation()">Start Exam</a>
<script type="text/javascript">
function confirmation(){
	alert("Do You Want to Start Exam");
	
	
}
</script>
</body>
</html>