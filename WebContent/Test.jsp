<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="/struts-tags" prefix="s" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script type="text/javascript">
$(document).ready(function(){
	$('#batch').change(function(){
		 var Bid = {
                 "bid": $("#batch").val()
             };
		
		
		$.ajax({
			url:'mygroupdata',
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
                        '<option value=' + data.view[i] + '>' + data.view[i].group_name + '</option>');
                    
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
<s:form action="">

<s:select label="Select Batch" cssClass="textboxis" id="batch"
  name="batchlist" 
  headerKey="1"
  headerValue="------Select Batch------"
  list="L1"
  listKey="Bid"
  listValue="Bname" 
  />
  
<%-- Select Batch : <select id="batch" name="batchName">
		<option>Select Batch</option>
		<option value="201">batch1</option>
		<option value="203">batch2</option>
		<option value="306">batch3</option>
		<option value="2">batch4</option>
</select> --%>
	
Select Group : <select id="group" name="groupName">
				<option>Select Group</option>
</select>
	
	<s:submit value="Save"></s:submit>
</s:form>
</body>
</html>