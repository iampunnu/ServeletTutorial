package dempApp;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/mul")
public class MulSer extends HttpServlet{
	
	public void doGet(HttpServletRequest httpServletRequest,HttpServletResponse httpServletResponse) {
		
		HttpSession session=httpServletRequest.getSession();
		
		String name=(String) session.getAttribute("pk");
		int i=0;;
	Cookie [] cookies=httpServletRequest.getCookies();
	
	      for(Cookie cookie:cookies) {
	    	  if(cookie.getName().equals("k")) {
	    		  i=Integer.parseInt(cookie.getValue());
	    	  }
	      }
		

	    
		try {
			httpServletResponse.getWriter().println("this is me result is "+i+" "+name);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}

}
