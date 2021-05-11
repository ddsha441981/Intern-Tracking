<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="/struts-tags"  prefix="s" %>
    <%@ taglib uri="/struts-dojo-tags" prefix="sx" %>
     <%@ taglib uri="http://ckeditor.com" prefix="ckeditor" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Project Assign Task</title>
<sx:head/>

<script src="ckeditor_4.6.1_basic/ckeditor.js"></script>
	<script src="ckeditor_4.6.1_basic/samples/js/sample.js"></script>
	<link rel="stylesheet" href="ckeditor_4.6.1_basic/samples/css/samples.css">
	<link rel="stylesheet" href="ckeditor_4.6.1_basic/samples/toolbarconfigurator/lib/codemirror/neo.css">

<link href="css/NewFile.css" rel="stylesheet" type="text/css" />
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>

<script type="text/javascript">
$(document).ready(function(){
	$('#batch').change(function(){
		 var Bid = {
                 "bid": $("#batch").val()
             };
		
		alert("Batch Id : "+Bid);
		$.ajax({
			url:'mygroupdata1',
			data: JSON.stringify(Bid),
            dataType: 'json',
            contentType: 'application/json',
            type: 'POST',
            async: true,
			success:function(data){
				alert("success Val : "+data.view);	
				for (var i = 0; i < data.view.length; i++) {
                    //console.log(" " + data.groups[i]);
                    $('#group').append(
                        '<option value=' + data.view[i].groupId + '>' + data.view[i].group_name + '</option>');
                    
                }
			},
			error:function(data){
				alert("error Val : "+data);	
			}	
		});
		
	});
	
	
	$('#group').change(function(){
		 var groupId = {
                 "groupId": $("#group").val()
             };
		
		 alert("hello"+groupId);
		
		$.ajax({
			url:'myinterndata',
			data: JSON.stringify(groupId),
            dataType: 'json',
            contentType: 'application/json',
            type: 'POST',
            async: true,
			success:function(data){
				alert("success Val : "+data.VV2);	
				for (var i = 0; i < data.VV2.length; i++) {
                    //console.log(" " + data.groups[i]);
                    $('#inter').append(
                        '<option value='+data.VV2[i]+'>' + data.VV2[i].ifname + '</option>');
                    
                }
			},
			error:function(data){
				alert("error Val : "+data);	
			}	
		});
		
	});
	
	
}); 
</script>
</head>
<body>
<h1>Assign Project Task</h1>
<s:form action="addprojecttask" method="get">
<table>

	<tr>
		<td><s:select label="Select Batch" cssClass="textboxis" id="batch"
  name="batch_name" 
  headerKey="1"
  headerValue="------Select Batch------"
  list="L1"
  listKey="Bid"
  listValue="Bname" 
  /></td>
	</tr>
	
	<tr>
		<td>Select Group : <select id="group" name="group_name" class="textboxis">
			 <option>Select Group</option>
</select></td>
	</tr>
	
	<tr>
		<td>Select Intern : <select id="inter" name="intern_name" class="textboxis">
		 <option>Select Intern</option>
				</select></td>
	</tr>
	
	<tr>
		<td><sx:datetimepicker label="Start Date : " name="startassigntask" displayFormat="dd/MM/yyyy" value="%{'today'}"  cssClass="textboxis"></sx:datetimepicker></td>
	</tr>
	
	<tr>
		<td><sx:datetimepicker label="End Date : " name="endassigntask" displayFormat="dd/MM/yyyy" value="%{'today'}" cssClass="textboxis"></sx:datetimepicker></td>
	</tr>
	
	<tr>
		<td><s:textfield name="status" label="Project Status" cssClass="textboxis"></s:textfield></td>
	</tr>
	
	<tr>
		<td>
		<s:textarea id="editor" name="minieditor" label="About Project Task"></s:textarea>
					
				
				</td>
	</tr>
	
	<tr>
		<td><s:submit></s:submit></td>
	</tr>
</table>

  </s:form>
  <script>
	initSample();
</script>
</body>
</html>