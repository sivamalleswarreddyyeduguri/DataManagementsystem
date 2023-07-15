package rrd2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hello")
public class Resp1 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	 System.out.println("first servlet class");
    	 System.out.println("---------------------");
    	 String id=req.getParameter("id");
    	 String name=req.getParameter("name");
    	 String email=req.getParameter("email");
         System.out.println(id);
         System.out.println(name);
         System.out.println(email);
         System.out.println("-------------------------");
         resp.sendRedirect("Resp?k="+id+"&l="+name+"&m="+email);
    	 		
    }
}
