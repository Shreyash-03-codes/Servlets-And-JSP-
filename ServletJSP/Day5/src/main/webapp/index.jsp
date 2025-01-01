<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>This is JSP file!!!!</h1>
	<% 
		String name="Shreyash Gurav";
		out.print("Name: "+name);
	%>
	
	<p>Hey Everyone I am Learning The JSP and my name is <%=name %></p>

</body>
</html>