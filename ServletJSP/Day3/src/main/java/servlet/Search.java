
package servlet;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import java.io.*;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/search")


public class Search extends HttpServlet{
	
	protected void service(HttpServletRequest req,HttpServletResponse rep) throws IOException,ServletException {
		String search=req.getParameter("search");
		rep.sendRedirect("https://www.google.com/search?q="+search);
		
	}

}
