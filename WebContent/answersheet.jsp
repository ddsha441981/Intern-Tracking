<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

		<link rel="stylesheet" href="bootstraptable/css/bootstrap.min.css">
		<link rel="stylesheet" href="bootstraptable/css/dataTables.bootstrap.min.css">

		<script src="bootstraptable/js/jquery-1.12.4.js"></script>
 		<script src="bootstraptable/js/jquery.dataTables.min.js"></script>
  		<script src="bootstraptable/js/dataTables.bootstrap.min.js"></script>

</head>
<body>

<table id="example" class="table table-striped table-bordered" cellspacing="0" width="100%">
        <thead>
            <tr>
                <th>S.No</th>
                <th>Correct Answer</th>
            
            	<th colspan="1">A</th>
                <th colspan="1">B</th>
                <th colspan="1">C</th>
                <th colspan="1">D</th>
                <th colspan="1">E</th>
                <th colspan="1">G</th>
            	  
            </tr>
        </thead>
        <s:iterator var="ques" value="mm1">
        <tbody>
            <tr>
               <td>${ques.question_Id}</td>
                <td>${ques.correctans}</td>
                <td>${ques.optionA}</td>
                <td>${ques.optionB}</td>
                <td>${ques.optionC}</td>
                <td>${ques.optionD}</td>
                <td>${ques.optionE}</td>
                <td>${ques.optionG}</td>
                
            </tr>
            
            
            
        </tbody></s:iterator>
    </table>
</body>
</html>