<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>Hello here are some Expression Language!!</h1>
	
	<% 
		session.setAttribute("name", "Shreyash Gurav");
		int a=99;
		int b=11;
		
	
		
	%>
	
	<h1>The name is ${name} and the some is ${a+b} and addition is ${11+12}  !!</h1>

</body>
</html>