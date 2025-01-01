package servlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import java.io.*;


@WebServlet("/login")
public class LogIn extends HttpServlet{
	protected void service(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException {
		PrintWriter pt=resp.getWriter();
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String pass=req.getParameter("pass");
		HttpSession session=req.getSession();
		session.setAttribute("name", name);
		session.setAttribute("email", email);
		session.setAttribute("pass", pass);
		
		RequestDispatcher rd=req.getRequestDispatcher("/home.jsp");
		rd.forward(req, resp);
	}

}
