<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Insert title here</title>
</head>
	<body>
		<p><c:out value="${error}"/></p>
		<form method="POST" action="/code">
		<label>What is the code? <input type="text" name="password"></label>
		<button>Try Code</button>
		</form>
		<p>(P.S, it's "bushido")</p>
	</body>
</html>