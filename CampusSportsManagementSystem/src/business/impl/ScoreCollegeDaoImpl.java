package business.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.regex.Pattern;

import model.ScoreCollege;
import business.basic.BaseDao;
import business.basic.BaseDaoImpl;
import business.dao.ScoreCollegeDAO;

public class ScoreCollegeDaoImpl implements ScoreCollegeDAO {

	private BaseDao bdao = null;

	public ScoreCollegeDaoImpl() {
		bdao = new BaseDaoImpl();
	}

	@Override
	public ScoreCollege getByCollegeid(int collegeid) {
		String sql = "SELECT collegeid,collegename, ROUND(AVG(scorenumber), 2) as scorenumber from (select collegeid,collegename, ROUND(AVG(scorenumber), 2) as scorenumber from V_StudentScore where collegeid=? GROUP BY collegeid,collegename UNION ALL select collegeid,collegename, ROUND(AVG(scorenumber), 2) as scorenumber from V_TeacherScore where collegeid=? GROUP BY collegeid,collegename) as a where collegeid=? GROUP BY collegeid,collegename";
		Object[] param = { collegeid, collegeid, collegeid };
		ResultSet rs = bdao.select(sql, param);

		ScoreCollege sCollege = new ScoreCollege(rs);
		if (sCollege.getCollegename() != null
				|| sCollege.getCollegename().equals("")) {
			bdao.close();
			return sCollege;
		} else {
			bdao.close();
			return null;
		}

	}
	@Override
	public List<ScoreCollege> getSearchCollege(String opretion) {
		String sql = "SELECT collegeid,collegename, ROUND(AVG(scorenumber), 2) as scorenumber from (select collegeid,collegename, ROUND(AVG(scorenumber), 2) as scorenumber from V_StudentScore where collegename='"+opretion+"' GROUP BY collegeid,collegename UNION ALL select collegeid,collegename, ROUND(AVG(scorenumber), 2) as scorenumber from V_TeacherScore where collegename='"+opretion+"' GROUP BY collegeid,collegename) as a where collegename='"+opretion+"' GROUP BY collegeid,collegename";
		ResultSet rs = bdao.select(sql);
		List<ScoreCollege> list = null;
		try {
			if (rs != null && rs.next()) {
				list = ScoreCollege.toList(rs);
				bdao.close();
			} else {
				bdao.close();
				return null;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<ScoreCollege> getAllCollegeScore(String action, String opretion) {
		ResultSet rs;
		if (action.equals("all") && opretion.equals("all")) {
			String sql = "SELECT collegeid,collegename, ROUND(AVG(scorenumber), 2) as scorenumber from (select collegeid,collegename, ROUND(AVG(scorenumber), 2) as scorenumber from V_StudentScore GROUP BY collegeid,collegename UNION ALL select collegeid,collegename, ROUND(AVG(scorenumber), 2) as scorenumber from V_TeacherScore GROUP BY collegeid,collegename) as a GROUP BY collegeid,collegename";
			rs = bdao.select(sql);
		} else {

			if (isInteger(opretion)) {
				String sql = "SELECT collegeid,collegename, ROUND(AVG(scorenumber), 2) as scorenumber from (select collegeid,collegename, ROUND(AVG(scorenumber), 2) as scorenumber from V_StudentScore GROUP BY collegeid,collegename UNION ALL select collegeid,collegename, ROUND(AVG(scorenumber), 2) as scorenumber from V_TeacherScore GROUP BY collegeid,collegename) as a GROUP BY collegeid,collegename";
				rs = bdao.select(sql);
			} else {
				String sql = "SELECT collegeid,collegename, ROUND(AVG(scorenumber), 2) as scorenumber from (select collegeid,collegename, ROUND(AVG(scorenumber), 2) as scorenumber from V_StudentScore where collegename like'%?%'  GROUP BY collegeid,collegename UNION ALL select collegeid,collegename, ROUND(AVG(scorenumber), 2) as scorenumber from V_TeacherScore where collegename like'%?%' GROUP BY collegeid,collegename) as a where collegename like'%?%' GROUP BY collegeid,collegename";
				Object[] param = { opretion, opretion, opretion };
				rs = bdao.select(sql, param);
			}
		}

		List<ScoreCollege> list = null;
		try {
			if (rs != null && rs.next()) {
				list = ScoreCollege.toList(rs);
				bdao.close();
			} else {
				bdao.close();
				return null;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;

	}

	/*
	 * ：推荐，速度最快 判断是否为整数
	 * 
	 * @param str 传入的字符串
	 * 
	 * @return 是整数返回true,否则返回false
	 */

	public static boolean isInteger(String str) {
		Pattern pattern = Pattern.compile("^[-\\+]?[\\d]*$");
		return pattern.matcher(str).matches();
	}

	@Override
	public List<ScoreCollege> getAllCollegeScoreBypage(ScoreCollege scorecollege) {
		// TODO Auto-generated method stub
		return null;
	}

}
