package servlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import jakarta.servlet.http.HttpServletRequest;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/signup")

public class SignUp extends HttpServlet{
	protected void doPost(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException {
		Users users=new Users();
		resp.setContentType("text/html");
		String email=req.getParameter("email");
		String name=req.getParameter("name");
		String pass=req.getParameter("pass");
		String mobile=req.getParameter("mobile");
		String gender=req.getParameter("gender");
		int re=users.insert(name, email, pass, gender, mobile);
		
		if(re>0) {
			PrintWriter pt=resp.getWriter();
			pt.print("Sign Up Successfully!!!!");
			HttpSession session=req.getSession();
			session.setAttribute("name", name);
			resp.sendRedirect("login.jsp");
		}
		else {
			PrintWriter pt=resp.getWriter();
			pt.print("Sign Up Failed!!!!");
			RequestDispatcher rd=req.getRequestDispatcher("signup.html");
			rd.forward(req, resp);
		}
	}
}
