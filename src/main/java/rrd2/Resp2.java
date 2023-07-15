package rrd2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/Resp")
public class Resp2 extends HttpServlet {
      @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	System.out.println("2 st servlet class");
    	System.out.println("---------------------");
    	String id=req.getParameter("k");
    	String name=req.getParameter("l");
    	String email=req.getParameter("m");
    	System.out.println(id);
    	System.out.println(name);
    	System.out.println(email);
    	System.out.println("-------------------------");
    	
    	String k=req.getParameter(id);
    	String l=req.getParameter(name);
    	String m=req.getParameter(email);
    	
    	PrintWriter pw=resp.getWriter();
    	pw.println("not executed");
    	pw.println(k);
    	pw.println(l);
    	pw.println(m);
    	
    	
    }
}
