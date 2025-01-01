<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>Home Page</h1>


<a href="aboutus.jsp">About Us </a> &nbsp;&nbsp;&nbsp;
<a href="profile.jsp">Profile</a>
<% 
	String name=null;
	if(session!=null){
		Object sessionName=session.getAttribute("name");
		if(sessionName!=null){
			name=sessionName.toString();
		}
	}
	%>
<p>Welcome :<%=name!=null?name:"Guest" %><p/>



</body>
</html>