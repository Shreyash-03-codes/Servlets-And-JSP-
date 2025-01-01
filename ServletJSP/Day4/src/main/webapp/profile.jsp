<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>Profile Page</h1>
<a href="aboutus.jsp">About Us </a> &nbsp;&nbsp;&nbsp;
<a href="home.jsp">Home</a>
<a href="logout.jsp">Log Out</a>

<% String name=session.getAttribute("name").toString(); %>
<p>Welcome :<%=name %><p/>



</body>
</html>