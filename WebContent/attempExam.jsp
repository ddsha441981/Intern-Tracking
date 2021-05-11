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
<link rel="stylesheet" type="text/css" href="./style.css">
<style type="text/css">
  .error{
  color: red;
  }
  .space{
  padding-right: 10px;
  }
  
      body {
        margin:0;
        padding:0;
      }
  </style>
  <sx:head/>
  
  <script type="text/javascript">
  function submyExam() {
	  alert("Not Complete Question");
	
}
  </script>
  
  <script type="text/javascript">


 /* GLOBALS (property of window object) */
var intervalhandle;

var stopflag = false;

var hourcounter = 0;
var minutecounter = 0;
var secondcounter = 0;
var tenthsecondcounter = 0;
var hundredthsecondcounter = 0;

function starttimer() {

stopflag = false;

} /* END FUNCTION starttimer */

function stoptimer() {

stopflag = true;

} /* END FUNCTION stoptimer */

function resettimer() {

hourcounter = 0;
document.getElementById("hourelement").innerHTML= hourcounter;
minutecounter = 0;
document.getElementById("minuteelement").innerHTML= minutecounter;
secondcounter = 0;
document.getElementById("secondelement").innerHTML= secondcounter;
tenthsecondcounter = 0;
document.getElementById("tenthelement").innerHTML= tenthsecondcounter;
hundredthsecondcounter = 0;
document.getElementById("hundredthelement").innerHTML= hundredthsecondcounter;

} /* END FUNCTION resettimer */

function checktimedispatcher() {

var currentdate=new Date();
var currenttime= currentdate.toLocaleTimeString();
document.getElementById("clockelement").innerHTML= currenttime;

if (stopflag == true) {
  return;
} /* don't change the timers if we have stopped timing */

hundredthsecondcounter = hundredthsecondcounter +1;
document.getElementById("hundredthelement").innerHTML= hundredthsecondcounter;
if ( (hundredthsecondcounter%10) == 0 ) {
  tenthsecondcounter = tenthsecondcounter +1;
  document.getElementById("tenthelement").innerHTML= tenthsecondcounter;
  if ( (tenthsecondcounter%10) == 0) {
    secondcounter = secondcounter + 1;
    document.getElementById("secondelement").innerHTML= secondcounter;
    if ( (secondcounter%60) == 0) {
      minutecounter = minutecounter + 1;
      document.getElementById("minuteelement").innerHTML= minutecounter;
      if ( (minutecounter%60) == 0) {
        hourcounter = hourcounter + 1;
        document.getElementById("hourelement").innerHTML= hourcounter;
      } /* END hour check */
    } /* END minute check */
  } /* END second check */
} /* END tenth second check */

} /* END FUNCTION checktimedispatcher */

/*!--asdf on window load init--*/



</script>
  
</head>
<body onload="intervalhandle=window.setInterval(function() {checktimedispatcher() },10);">
 <%@ include file="CommonFile/internHomecommonfile.jsp" %>
 <s:form action="checkexamresult" method="get">

<%-- <h1 align="center" style="width:320px;background-color:black;margin-left:auto; margin-right:auto;text-align:center;font-family:Geneva,sanserif;font-size:48px"><span style="color:#ff0000">T</span><span style="color:#ffff00">i</span><span style="color:#00ff00">m</span><span style="color:#00ffff">e</span><span style="color:#0000ff">r</span></h1>
 --%>

<div id="mainpage">

<div id="maincontent">

<div id="targetarea">

<div style="width:50;margin-left:auto; margin-right:auto;text-align:left;color:black;"><p align="center">
<br><span id="clockelement" style="font-size:20px">
starting</span>0<span id="hourelement">
HOURS:</span>0 <span id="minuteelement">MINUTES:</span>
SECONDS:<span id="secondelement">0</span>
1/10th  SECONDS: <span id="tenthelement">
<!-- starting --></span>
1/100th SECONDS:  <span id="hundredthelement">
<!-- starting --></span></p></div>

</div><!--targetarea-->

<p align="center"><button type="button" onclick="starttimer();">Start</button> <button type="button" onclick="stoptimer();">Stop</button> <button type="button" onclick="resettimer();">Reset</button></p>


</div>
  <table width="100%">
  <tr>
  <th>Questions</th>
  		<th>Marks</th>
  </tr>
  <s:iterator var="ques" value="mm1">
 
<input type="hidden" name="que" value="${ques.question_Id}"/>  
  			<tr>
  				<td><p class="question">${ques.questions}</p></td><td>${ques.qmarks}</td></tr>
  				<tr>
  				<td>

  				<ul class="answers">
A : <input type="checkbox" name="ua${ques.question_Id}" value="${ques.optionA}" id="q1a"><label for="q1a">${ques.optionA}</label><br/>
B : <input type="checkbox" name="ua${ques.question_Id}" value="${ques.optionB}" id="q1b"><label for="q1b">${ques.optionB}</label><br/>
C : <input type="checkbox" name="ua${ques.question_Id}" value="${ques.optionC}" id="q1c"><label for="q1c">${ques.optionC}</label><br/>
D : <input type="checkbox" name="ua${ques.question_Id}" value="${ques.optionD}" id="q1d"><label for="q1d">${ques.optionD}</label><br/>
E : <input type="checkbox" name="ua${ques.question_Id}" value="${ques.optionE}" id="q1d"><label for="q1d">${ques.optionE}</label><br/>
G : <input type="checkbox" name="ua${ques.question_Id}" value="${ques.optionG}" id="q1d"><label for="q1d">${ques.optionG}</label><br/> 

<input type="hidden" name="ca${ques.question_Id}" value="${ques.correctans}"/>

</ul></td></tr>

  			
  		
  			
  			</s:iterator>
  			
  </table>
 
		

		
		<!-- <a href="#" class="btn btn-success" id="ansby" onclick="submyExam()">Submit Exam</a> -->
		<s:submit></s:submit>
</s:form>

</body>
</html>