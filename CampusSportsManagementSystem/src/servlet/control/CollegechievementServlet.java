package servlet.control;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;

import util.ConvertJsonUtils;
import util.sendDispatcher;
import model.College;
import model.ScoreCollege;
import business.dao.*;
import business.factory.DAOFactory;

/**
 * 查看学院成绩的servlet类
 */
@WebServlet("/collegechievement.do")
public class CollegechievementServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CollegechievementServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		response.setCharacterEncoding("UTF-8"); 
		request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf-8");
		
		ScoreCollegeDAO scdao = DAOFactory.getScoreCollegeDAO();
		CollegeDAO cdao = DAOFactory.getCollegeDAO();

		String action=request.getParameter("action");
		String opretion=request.getParameter("opretion");
		List<ScoreCollege> scorecollege;
		// 获取学院成绩
		scorecollege = scdao.getAllCollegeScore(action,opretion);
		// 获取所有学院
		List<College> collegelist = cdao.select();
		if (action.equals("search")) {
			PrintWriter out=response.getWriter();
			if(scorecollege!=null){
				response.setCharacterEncoding("UTF-8"); 
				request.setCharacterEncoding("UTF-8");
		        response.setContentType("text/html;charset=utf-8");
				String main=ConvertJsonUtils.ConvertListToPageJson(scorecollege);
				out.print(main);
				out.flush();
				out.close();
			}
		} else {
			request.setAttribute("collegelist", collegelist);
			request.setAttribute("scorecollege", scorecollege);
			sendDispatcher.sendUrl("collegechievement.jsp", request, response);
		}
	}

}
