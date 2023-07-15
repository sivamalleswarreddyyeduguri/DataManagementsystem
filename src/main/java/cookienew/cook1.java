package cookienew;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/drlng")
public class cook1 extends HttpServlet {
         @Override
        protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        	String user=req.getParameter("username");
        	String pass=req.getParameter("password");
        	
        	Cookie ck=new Cookie("user",user);
        	Cookie ck1=new Cookie("pass",pass);
        	resp.addCookie(ck);
        	resp.addCookie(ck1);
        	resp.sendRedirect("drlng2");
        	
        }
}
