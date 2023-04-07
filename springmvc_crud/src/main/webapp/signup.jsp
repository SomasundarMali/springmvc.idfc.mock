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
<form:form action="insert" modelAttribute="empobject">
<form:input path="id" placeholder="Enter Id"/><br>
<form:input path="email" placeholder="Enter Email"/><br>
<form:input path="pwd" placeholder="Enter password"/><br>
<form:input path="name" placeholder="Enter Name"/><br>
<form:input path="phone" placeholder="Enter phone number"/><br>
<form:input path="role" placeholder="Enter role"/><br>

<form:button>Submit</form:button>
<form:button>cancel</form:button>
</form:form>
</body>
</html>