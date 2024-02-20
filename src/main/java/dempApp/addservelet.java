package dempApp;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class addservelet extends HttpServlet{
	
public void doPost(HttpServletRequest httpServletRequest,HttpServletResponse httpServletResponse) throws ServletException, IOException {
	
	Integer i=Integer.parseInt(httpServletRequest.getParameter("num1"));
	Integer j=Integer.parseInt(httpServletRequest.getParameter("num2"));
	Integer k = i + j;
	
	
	/*
						 * httpServletRequest.setAttribute("k", k*k); RequestDispatcher
						 * dispatcher=httpServletRequest.getRequestDispatcher("sq");
						 * dispatcher.forward(httpServletRequest, httpServletResponse);
						 *

	 */
	

	/*
	 * httpServletResponse.sendRedirect("sq?k="+k);
	 */
	
	/*
		 * HttpSession session=httpServletRequest.getSession();
		 * session.setAttribute("k", k);
		 */
	HttpSession session =httpServletRequest.getSession();
	session.setAttribute("pk", "praveen");
	
	Cookie cookie=new Cookie("k", k+"");
	httpServletResponse.addCookie(cookie);
 	 httpServletResponse.sendRedirect("sq");

}
}
