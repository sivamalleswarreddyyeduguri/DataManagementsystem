package cookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/parle1")
public class Cookie2 extends HttpServlet {
      @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	
    	Cookie[] ck=req.getCookies();
    	String id=null;
    	String name=null;
    	String email=null;
    	for(Cookie a:ck) {
    		  if(a.getName().equals("id")) {
    			  id=a.getValue();
    			  a.setMaxAge(0);
    		  }
    		  if(a.getName().equals("name")) {
    			  name=a.getValue();
    			  a.setMaxAge(0);
    		  }
    		  if(a.getName().equals("email")) {
    			  email=a.getValue();
    			  a.setMaxAge(0);
    		  }
    	}
    	  
    	PrintWriter pw=resp.getWriter();
    	pw.println(id);
    	pw.println(name);
    	pw.println(email);
    	
    	   
    }
}
