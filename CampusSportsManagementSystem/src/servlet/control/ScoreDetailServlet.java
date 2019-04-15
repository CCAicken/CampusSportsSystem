package servlet.control;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import business.dao.SceneDAO;
import business.dao.ScoreDAO;
import business.factory.DAOFactory;
import model.Score;
import model.Student;
import model.Teacher;
import common.properties.RoleType;

/**
 * Servlet implementation class ScoreDetailServlet
 */
@WebServlet("/scoredetail.do")
public class ScoreDetailServlet extends HttpServlet {
    public ScoreDetailServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String op = (String)request.getAttribute("op");
		if(op.equals("user")){
			ScoreDAO sdao = DAOFactory.getScoreDAO();
			int roleid = (Integer)request.getAttribute("roleid");
			String userid = (String)request.getAttribute("userid");
			List<Score> scoreList = sdao.getByUser(userid);
			request.setAttribute("scoreList", scoreList);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
