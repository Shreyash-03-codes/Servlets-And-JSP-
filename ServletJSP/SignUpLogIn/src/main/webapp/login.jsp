<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

	<style>
		*{
		padding:0px;
		margin:0px;
		box-sizing:border-box;
	}
	
	.container{
		height: 100vh;
		width:100vw;
		background-color: yellow;
		display: flex;
		justify-content: center;
		align-items: center;
		flex-direction: column;
		gap:10%;
	}
	.heading{
		color:red;
	}
	
	.form{
		height: 40%;
		width: 40%;
		background-color: grey;
		padding-top:6%;
		padding-left:8%;
	}
	</style>
</head>
<body>

		<div class="container">
		<h1 class="heading">Fill The Form to Log in !!!</h1>
		
		<div class="form">
			<form action="login" method="post" >
		
				<label for="email">Enter Your Email:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</label>
				<input type="email" name="email" id="email" placeholder="Enter The Email.."><br/><br/>
				
				
				<label for="pass">Enter The Password:</label>
				<input type="password" name="pass" id="pass" placeholder="Enter The Password.."><br/><br/><br/>
				<span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span>
				<input type="submit" id="submit" name="submit" value="Submit">
				
			</form>
		</div>
		
	</div>

</body>
</html>