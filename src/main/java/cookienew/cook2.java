package cookienew;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/drlng3")
public class cook2 extends HttpServlet {
     @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	 Cookie [] cook=req.getCookies();
    	 String user=null;
    	 String pass=null;
    	 for(Cookie a:cook) {
    		 if(a.getName().equals("user"))user=a.getValue();
    		 if(a.getName().equals("pass"))pass=a.getValue();
    	 }
           PrintWriter pw=resp.getWriter();
           pw.println(user);
           pw.println(pass);
    };
}
