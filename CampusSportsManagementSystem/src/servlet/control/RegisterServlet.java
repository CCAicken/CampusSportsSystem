package servlet.control;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/register.do")
public class RegisterServlet extends HttpServlet {
    public RegisterServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String op = request.getParameter("op");
		if(op == "load"){
			String college = request.getParameter("collegeId");
			
		}else if(op == "add"){
			String userid = request.getParameter("userid");
			String username = request.getParameter("username");
			String agend = request.getParameter("agend");
			String pwd = request.getParameter("pwd");
			String confirmpwd = request.getParameter("confirmpwd");
			String mobile = request.getParameter("mobile");
			String college = request.getParameter("college");
			String major = request.getParameter("major");
			String classid = request.getParameter("classid");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
