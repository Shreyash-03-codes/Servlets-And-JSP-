package servlet;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpServletRequest;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
@WebServlet("/login")
public class LogIn extends HttpServlet{
	protected void doPost(HttpServletRequest req,HttpServletResponse resp) throws ServletException ,IOException {
		Users users=new Users();
		PrintWriter ptPrintWriter=resp.getWriter();
		resp.setContentType("text/html");
		String email=req.getParameter("email");
		String pass=req.getParameter("pass");
		
		boolean logIn=users.checkUser(email, pass);
		
		if(logIn) {
			ptPrintWriter.print("Log In Successful!!!!");
			resp.sendRedirect("profile.jsp");
		}
		else {
			ptPrintWriter.print("Log In Unsuccessful!!!!");
			RequestDispatcher rd=req.getRequestDispatcher("login.jsp");
			rd.forward(req, resp);
		}
	}
}
