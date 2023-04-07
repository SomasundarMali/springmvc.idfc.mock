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
<form:form action="insert" modelAttribute="insertkey">
<form:input path="id" placeholder="enter the id"/><br>
<form:input path="name" placeholder="enter the name"/><br>
<form:input path="email" placeholder="enter the email id"/>
<form:input path="number" placeholder="enter the phone number"/><br>
<form:button>Submit</form:button>
<form:button>Cancel</form:button>
</form:form>
</body>
</html>