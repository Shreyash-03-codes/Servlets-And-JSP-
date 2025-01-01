<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<% 
		out.println("Hello World!!");
		session.setAttribute("name", "Shreyash Gurav");
		request.setAttribute("num", 101);
	%>
	
	<h1>The Name is :<%= session.getAttribute("name") %> and the Number is <%= request.getAttribute("num") %></h1>

</body>
</html>