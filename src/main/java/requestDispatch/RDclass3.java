package requestDispatch;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/rd3")
public class RDclass3 extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter pw=resp.getWriter();
		pw.println("from 3 rd class");
		String id=req.getParameter("id");
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		PrintWriter pw1=resp.getWriter();
		pw1.println(id);
		pw1.println(name);
		pw1.println(email);
	}
	
}
