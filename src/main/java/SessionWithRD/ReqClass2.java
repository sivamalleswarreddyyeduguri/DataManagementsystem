package SessionWithRD;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/trailform2")
public class ReqClass2 extends HttpServlet {
        @Override
        protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        	RequestDispatcher re=req.getRequestDispatcher("traildisplay.jsp");
        	req.setAttribute("class","JEE CLASS");
        	re.forward(req, resp);
        }
}
    