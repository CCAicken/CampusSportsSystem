package servlet.control;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import util.sendDispatcher;
import model.Project;
import model.Student;
import model.Teacher;
import business.basic.BaseDao;
import business.basic.BaseDaoImpl;
import business.dao.MatchDAO;
import business.dao.ProjectDAO;
import business.factory.DAOFactory;

/**
 * Servlet implementation class projectRegistrantionServlet
 */
@WebServlet("/projectregistrantionservlet.do")
public class projectRegistrantionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public projectRegistrantionServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/plan;charset=utf-8");
		HttpSession session = request.getSession();
		Student stu = null;
		Teacher tea = null;
		//int usertype = (Integer)session.getAttribute("usertype");//获取用户类型
		int usertype = 1;
		
		ProjectDAO pdao = DAOFactory.getProjectDAO();
		
		List<Project> projectList = null;
		if(usertype==1 || usertype==2){
			projectList = pdao.selectByType(usertype);//教师和学生只能查看自己能报名的项目
			if(usertype==1){
				stu = (Student)session.getAttribute("loginuser");
			}else{
				tea = (Teacher)session.getAttribute("loginuser");
			}
		}
		else{
			projectList = pdao.select();//组委会可以查看所有报名项目
		}
		request.setAttribute("projectList", projectList);
		sendDispatcher.sendUrl("projectRegistration.jsp", request, response);

		String op = request.getParameter("op");
		if(op=="add"){
			int proid;
			int userid;
			String pid = request.getParameter("proid");
			if(pid!=null&&!pid.equals("")){
				proid = Integer.parseInt(pid);
			}
			if(usertype==1){
				userid = Integer.parseInt(stu.getUserid());
			}
			else{
				userid = Integer.parseInt(tea.getUserid());
			}
			
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
