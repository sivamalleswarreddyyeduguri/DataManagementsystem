package ProjectRD;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/mallu")
public class sav1 extends HttpServlet {
        @Override
        protected void doPost(HttpServletRequest req, HttpServletResponse resp)
        		throws ServletException, IOException {
        	String user="mallesh";
        	String pass="Mallesh@1234";
        	String username=req.getParameter("user");
        	String pw=req.getParameter("pass");
        	req.setAttribute("user",username);
        	req.setAttribute("pass", pw);
        	
        	if(user.equals(username) && pass.equals(pw)) {
        		RequestDispatcher rd=req.getRequestDispatcher("Li2");
        		rd.forward(req, resp);
        	}
        	else {
        		RequestDispatcher rd=req.getRequestDispatcher("Li3");
        		rd.forward(req, resp);
        	}
        	
        }
}
