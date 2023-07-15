package SessionImp;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dto.Student;
@WebServlet("/pora1")
public class SessionClass2 extends HttpServlet {
       @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	    HttpSession s=req.getSession();
    	    String id=(String)s.getAttribute("id");
    	    String name=(String)s.getAttribute("name");
    	    String email=(String)s.getAttribute("email");
    	    
    	    Student s1=new Student();
    	    s1.setId(Integer.parseInt(id));
    	    s1.setName(name);
    	    s1.setEmail(email);
    	    
    	    s.setAttribute("s1", s1);
    	    s.removeAttribute("id");
    	    s.removeAttribute("name");
    	    s.removeAttribute("email");

    	    
    	    resp.sendRedirect("pora2");
    }
}
