<%@page import="dto.StudentDto"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table >
<tr>
<th>Id</th>
<th>Name</th>
<th>Email</th>
<th>Phone Number</th>
</tr>

<% StudentDto dto=(StudentDto)request.getAttribute("fetchbykey"); %>
<tr>
<td><%=dto.getId() %></td>
<td><%=dto.getName() %></td>
<td><%=dto.getEmail() %></td>
<td><%=dto.getNumber() %></td>
</tr>


</table>
</body>
</html>