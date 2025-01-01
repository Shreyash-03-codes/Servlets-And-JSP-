package servlet;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import java.io.*;

@WebServlet("/login")

public class ResponseGetPost extends HttpServlet{
	protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		PrintWriter pt=res.getWriter();
		if(email.equals("shreyash@gmail.com") && password.equals("shreyash@2005")) {
			pt.print("You Logged In Successfully!!!");
			System.out.println("Logged In Successfully!!!!");
			
		}
		else {
			pt.print(" Logged In Unuccessful!!!");
			System.out.println("Logged In Unsuccessful!!!!");
			
		}
		
	}
}
