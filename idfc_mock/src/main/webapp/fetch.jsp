<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Fetch</h1>
<form:form action="fet" modelAttribute="fetchkey">
<form:input path="id" placeholder="Enter id"/><br>
<form:button>Fetch</form:button>



</form:form>
</body>
</html>