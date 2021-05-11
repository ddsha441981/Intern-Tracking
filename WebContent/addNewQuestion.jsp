<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="/struts-tags" prefix="s" %>
    <%@ taglib uri="/struts-dojo-tags" prefix="sx" %>
    <%@ taglib uri="http://ckeditor.com" prefix="ckeditor" %>
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
	
	
	<script src="ckeditor/ckeditor.js"></script>
	<script src="ckeditor/samples/js/sample.js"></script>
	<link rel="stylesheet" href="ckeditor/samples/css/samples.css">
	<link rel="stylesheet" href="ckeditor/samples/toolbarconfigurator/lib/codemirror/neo.css">
	
	
	
<!-- ***********************************CK Editors***************************************************************
	 *																											*
	 *																											*	
	 *																											*
	 *																											*
	 *																											*
	 *																											*
	 *																											*
	 ***********************************CK Editors***************************************************************-->
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
  <a href="checkPrevious.action?exam_id=<s:property value="exam_id"/>"> Check Previous Question</a>
<div class="container">

  <form class="form-horizontal" id="signupForm" action="saveQuestion" method="get">
  <%-- <s:hidden value="exam_id" name="exam_id">
 </s:hidden> --%>
  <div class="form-group">
      <label for="comment">Enter Question Here :</label>
      <textarea class="form-control" rows="5" id="editor" name="questions"></textarea>
    </div>
    
    <div class="form-group">
    <label class="control-label col-sm-2" for="exam_id">Exam Id:(ReadOnly)</label>
     <div class="col-sm-1">
        <input type="text" id="exam_id" class="form-control" name="exam_id" readonly value="<s:property value="exam_id"/>">
      </div> 
       </div>
      
     <div class="form-group">
      <label class="control-label col-sm-2" for="optionA">Answer Option (A):</label>
      
      <label class="checkbox-inline">
      <input onclick="ATHD()" id="1" type="checkbox" name="optionA" value="">Select It
    </label>
      <div class="col-sm-8">
        <input type="text" id="opt1" class="form-control" name="optionA" placeholder="Enter Answer Option(A)">
      </div>
    </div>
    
    
    <div class="form-group">
      <label class="control-label col-sm-2" for="optionB">Answer Option (B):</label>
      
      <label class="checkbox-inline">
      <input onclick="ATHD()" id="2" type="checkbox"  name="optionB" value="">Select It
    </label>
      <div class="col-sm-8">
        <input type="text" id="opt2" class="form-control" name="optionB" placeholder="Enter Answer Option(B)">
      </div>
    </div>
    
    
    <div class="form-group">
      <label class="control-label col-sm-2" for="optionC">Answer Option(C):</label>
      
      <label class="checkbox-inline">
      <input onclick="ATHD()" id="3" type="checkbox"  name="optionC" value="">Select It
    </label>
      <div class="col-sm-8">
        <input type="text" id="opt3" class="form-control" name="optionC" placeholder="Enter Answer Option(C)">
      </div>
    </div>
    
    
    <div class="form-group">
      <label class="control-label col-sm-2" for="optionD">Answer Option(D):</label>
      
      <label class="checkbox-inline">
      <input onclick="ATHD()" id="4" type="checkbox"   name="optionD" value="">Select It
    </label>
      <div class="col-sm-8">
        <input type="text" id="opt4" class="form-control" name="optionD" placeholder="Enter Answer Option(D)">
      </div>
    </div>
    
    <div class="form-group">
      <label class="control-label col-sm-2" for="optionE">Answer Option:(E)</label>
      
      <label class="checkbox-inline">
      <input onclick="ATHD()" id="5" type="checkbox"  name="optionE" value="">Select It
    </label>
      <div class="col-sm-8">
        <input type="text" id="opt5" class="form-control" name="optionE" placeholder="Enter Answer Option(E)">
      </div>
    </div>
    
    <div class="form-group">
      <label class="control-label col-sm-2" for="optionG">Answer Option:(G)</label>
      
      <label class="checkbox-inline">
      <input onclick="ATHD()" id="6" type="checkbox"   name="optionG" value="">Select It
    </label>
      <div class="col-sm-8">
        <input type="text" id="opt6" class="form-control" name="optionG" placeholder="Enter Answer Option(G)">
      </div>
    </div>
    
     
     <div class="form-group">
      <label class="control-label col-sm-2" for="correctans">Correct Answer:</label>
      <div class="col-sm-8">
        <input type="text" class="form-control" name="correctans" placeholder="Enter Correct Answer" id="showValues">
        <input type="hidden" id="hdnValues" />
      </div>
    </div>
    
    <div class="form-group">
      <label class="control-label col-sm-2" for="qmarks">Question Marks:</label>
      <div class="col-sm-8">
        <input type="text" class="form-control" name="qmarks" placeholder="Enter Marks of Question">
      </div>
    </div>
    
    
    <div class="form-group">        
      <div class="col-sm-offset-2 col-sm-10">
        <button type="submit" class="btn btn-success">Submit</button>
      </div>
    </div>
  </form>
</div>
<ckeditor:replace replace="editor" basePath="/ckeditor/" />



<%-- <a onclick="document.getElementById('div_name2').style.display='';return false;" href="checkPrevious.action?exam_id=<s:property value="exam_id"/>">Check Previous Question...</a>
      
    <br />
<div id="div_name2" style="display:none;margin:15px 15px 0px 15px;padding:5px;border:1px solid #aaa;">
  
<a onclick="document.getElementById('div_name2').style.display='none';return false;">hide Previous Question..</a>
 --%>
 <div id="p1">
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
			<th>Option G</th>
			<th>Correct Answer</th>
			<th>Question Marks</th>
			<th>Exam Id</th>
			<th>Action</th>
			<!-- <th>Action</th> -->
		</tr>
 </thead>
 <tbody>
		<tr>
		
			<td>${myprevious.question_Id};<br></td>
			<td>${myprevious.questions};<br></td>
			<td>${myprevious.optionA};<br></td>
			<td>${myprevious.optionB};</td>
			<td>${myprevious.optionC};</td>
			<td>${myprevious.optionD};</td>
			<td>${myprevious.optionE};</td>
			<td>${myprevious.optionG};</td>
			<td>${myprevious.correctans};</td>
			<td>${myprevious.qmarks};</td>
			<td>${myprevious.exam_id};</td>
			<td><a href="removeQuestion.action?question_Id=${myprevious.question_Id}" class="btn btn-danger" id="deletemy">Remove Question</a></td>
		</tr>
		
</tbody>
		
<!-- <button id="PageRefresh">Refresh a Page in jQuery</button> -->
</table>

</div>

</div>




<script type="text/javascript">
 
// find number of checkboxes (you haven't specified if you 
// have a set number or not. If you have a set number, just 
// set checkboxCount to whatever number you have.
var checkboxCount = 0;
var inputTags = document.getElementsByTagName('input');
for (var i=0, length = inputTags.length; i<length; i++) {
	//alert("Hello");
     if (inputTags[i].type == 'checkbox') {
         checkboxCount++;
     }
}
 
function ATHD() {
	//alert("Total Check Box : "+checkboxCount);
    var totalValue = '';
    for (var i = 1; i <= checkboxCount; i++) {
    	//alert(i+" - "+document.getElementById(i).value);
        if (document.getElementById(i).checked){
        	var ans=document.getElementById("opt"+i).value;
            totalValue +=ans+",";
        }
    }
    document.getElementById("hdnValues").value = totalValue;
    document.getElementById("showValues").value = totalValue;
}


</script>

<%-- <script>
$(document).ready(function(){
	alert("Hello Method Is Ready")
    $("a").click(function(){
        $("div").toggle();
    });
});
</script> --%>
</body>
</html>