<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Update</h1>
	<form:form action="update" modelAttribute="empupdatekey">
		<table>
			<tr>
				<td><label for="a">Id: </label></td>
				<td><form:input path="id" id="a"
						placeholder="enter your Id" /></td>
			</tr>
			<tr>
				<td><label for="aa">Role : </label></td>
				<td><form:input path="role" id="aa"
						placeholder="enter your Role" /></td>
			</tr>
			
		</table>
		<form:button>Update</form:button>
	</form:form>


</body>
</html>