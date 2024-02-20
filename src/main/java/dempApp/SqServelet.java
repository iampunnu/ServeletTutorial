package dempApp;

import java.io.IOException;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/sq")
public class SqServelet  extends HttpServlet{

	
	public void doGet(HttpServletRequest httpServletRequest,HttpServletResponse httpServletResponse) {
		
		
		/*
		 * String i= httpServletRequest.getParameter("k");
		 */		
		
		
		/*
		 * HttpSession session=httpServletRequest.getSession(); int
		 * i=(int)session.getAttribute("k");
		 */
		HttpSession session=httpServletRequest.getSession();
		
		String name=(String) session.getAttribute("pk");
		int i=0;;
	Cookie []	cookies=httpServletRequest.getCookies();
	
	      for(Cookie cookie:cookies) {
	    	  if(cookie.getName().equals("k")) {
	    		  i=Integer.parseInt(cookie.getValue());
	    	  }
	      }
		
         httpServletRequest.getSession().removeAttribute("pk");
	    
		try {
			httpServletResponse.getWriter().println("this is me result is "+i+" "+name);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}
}
