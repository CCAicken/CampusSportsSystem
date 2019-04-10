package servlet.control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import util.sendDispatcher;
import business.dao.UserDAO;
import business.impl.UserDaoImpl;
import common.properties.RoleType;
import model.Classes;
import model.College;
import model.Major;
import model.Role;
import model.Student;

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
		if(op == "major"){
			String college = request.getParameter("collegeId");
		}else if(op == "add"){
			String userid = request.getParameter("userid");
			String username = request.getParameter("username");
			String agend = request.getParameter("agend");
			String pwd = request.getParameter("pwd");
			String mobile = request.getParameter("mobile");
			String classid = request.getParameter("classid");
			Student user = new Student();
			user.setUserid(userid);
			user.setUsername(username);
			user.setPwd(pwd);
			user.setAgend(agend);
			user.setMobile(mobile);
			Classes classes = new Classes();
			classes.setClassid(Integer.parseInt(classid));
			user.setClasses(classes);
			UserDAO udao = new UserDaoImpl();
			boolean flag = udao.insertStu(user);
			if(flag){
				sendDispatcher.sendUrl("login.jsp", request, response);
			}else{
				request.setAttribute("Error","◊¢≤· ß∞‹«Î÷ÿ ‘");
			}
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
