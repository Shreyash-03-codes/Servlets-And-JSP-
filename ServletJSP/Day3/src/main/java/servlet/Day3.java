package servlet;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import java.io.*;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/Day3")


public class Day3 extends HttpServlet{
	
	protected void service(HttpServletRequest req,HttpServletResponse rep) throws IOException,ServletException {
		String mail=req.getParameter("mail");
		String pass=req.getParameter("pass");
		PrintWriter pt=rep.getWriter();
		if(mail.equals("shreyash@gmail.com") && pass.equals("shreyash123")) {
			RequestDispatcher rd=req.getRequestDispatcher("login.jsp");
			rd.forward(req, rep);
		}
		else {
			pt.println("Cant Log In..!!");
		}
		
	}

}
