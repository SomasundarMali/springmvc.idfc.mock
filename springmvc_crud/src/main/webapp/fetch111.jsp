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
<%EmpDto dto=(EmpDto)request.getAttribute("fetchbykey");%>
<tr>
<td><%= dto.getId()%></td>
<td><%= dto.getEmail()%></td>
<td><%= dto.getPwd()%></td>
<td><%= dto.getName()%></td>
<td><%= dto.getPhone()%></td>
<td><%= dto.getRole()%></td>



</tr>




</table>
</body>
</html>