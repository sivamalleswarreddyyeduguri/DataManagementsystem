package ProjectRD;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/Li3")
public class sav3 extends HttpServlet {
         @Override
        protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        	  Object at=req.getAttribute("user");
        	  Object atr=req.getAttribute("pass");
        	  PrintWriter pw=resp.getWriter();
        	  pw.println(at+" AND "+ atr +" DOESN'T MATCH");
        }
}
