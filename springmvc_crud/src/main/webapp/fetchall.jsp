<%@page import="java.util.List"%>
<%@page import="com.jsp.jese8.dto.EmpDto"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="1px">
<tr>
<th>id</th>
<th>email</th>
<th>password</th>
<th>name</th>
<th>phone number</th>
<th>role</th>
</tr>
<%List<EmpDto>dto=(List<EmpDto>)request.getAttribute("fetchallkey");
for(EmpDto dto2:dto){

%>
<tr>
<td><%= dto2.getId()%></td>
<td><%= dto2.getEmail()%></td>
<td><%= dto2.getPwd()%></td>
<td><%= dto2.getName()%></td>
<td><%= dto2.getPhone()%></td>
<td><%= dto2.getRole()%></td>

<%} %>

</tr>




</table>
</body>
</html>