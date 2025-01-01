<%@page import="java.io.PrintWriter"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%!
		int a=10;
		String name="Shreyash Gurav";
		public int square(){
			return a*a;
		}
	%>
	<% 
		out.println("The Numbers Between 1 to "+a+" Square!!!");
		for(int i=1;i<=square();i++){
			out.println(i);
		}
		
		int x=99;
		
		if(x<100){
			out.println("Here is Your not in Distinction!!!");
		}
		else{
			out.print("Here your in distinction!!!!");
		}
		
	
	%>
	
	<h1>The Name is <%= name %></h1>
	<p>The Square is <%= square()  %></p>
</body>
</html>