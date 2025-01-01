<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>About Page</h1>
<a href="home.jsp">Home</a> &nbsp;&nbsp;&nbsp;
<a href="profile.jsp">Profile</a>
<% String name=session.getAttribute("name").toString(); %>
<p>Welcome :<%=name %><p/>


</body>
</html>