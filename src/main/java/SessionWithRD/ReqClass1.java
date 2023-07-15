package SessionWithRD;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/trailform")
public class ReqClass1 extends HttpServlet {
        @Override
        protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        	 String id=req.getParameter("id");
        	 String name=req.getParameter("name");
        	 String email=req.getParameter("email");
        	 
        	 HttpSession ss=req.getSession();
        	 ss.setAttribute("id",id);
        	 ss.setAttribute("name",name);
        	 ss.setAttribute("email",email);
        	 
        	 RequestDispatcher rd=req.getRequestDispatcher("trailform2");
        	 rd.forward(req, resp);
        }
}
