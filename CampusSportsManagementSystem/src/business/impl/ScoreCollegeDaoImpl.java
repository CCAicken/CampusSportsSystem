package business.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import model.ScoreCollege;
import business.basic.BaseDao;
import business.basic.BaseDaoImpl;
import business.dao.ScoreCollegeDAO;

public class ScoreCollegeDaoImpl implements ScoreCollegeDAO {

	
	private BaseDao bdao=null;
	public ScoreCollegeDaoImpl() {
		bdao=new BaseDaoImpl();
	}
	@Override
	public ScoreCollege getByCollegeid(int collegeid) {
		String sql="SELECT collegeid,collegename, ROUND(AVG(scorenumber), 2) as scorenumber from (select collegeid,collegename, ROUND(AVG(scorenumber), 2) as scorenumber from V_StudentScore where collegeid=? GROUP BY collegeid,collegename UNION ALL select collegeid,collegename, ROUND(AVG(scorenumber), 2) as scorenumber from V_TeacherScore where collegeid=? GROUP BY collegeid,collegename) as a where collegeid=? GROUP BY collegeid,collegename";
		Object[] param={collegeid,collegeid,collegeid};
		ResultSet rs=bdao.select(sql, param);
		
		ScoreCollege sCollege =new ScoreCollege(rs);
		if(sCollege.getCollegename()!=null||sCollege.getCollegename().equals("")){
			bdao.close();
			return sCollege;
		}else {
			bdao.close();
			return null;
		}
		
	}

	@Override
	public List<ScoreCollege> getAllCollegeScore() {
		String sql="SELECT collegeid,collegename, ROUND(AVG(scorenumber), 2) as scorenumber from (select collegeid,collegename, ROUND(AVG(scorenumber), 2) as scorenumber from V_StudentScore GROUP BY collegeid,collegename UNION ALL select collegeid,collegename, ROUND(AVG(scorenumber), 2) as scorenumber from V_TeacherScore GROUP BY collegeid,collegename) as a GROUP BY collegeid,collegename";
		ResultSet rs =bdao.select(sql);
		List<ScoreCollege> list=null;
		try {
			if(rs!=null&&rs.next()){
				list= ScoreCollege.toList(rs);
				bdao.close();
			}else {
				bdao.close();
				return null;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
		
	}

	@Override
	public List<ScoreCollege> getAllCollegeScoreBypage(ScoreCollege scorecollege) {
		// TODO Auto-generated method stub
		return null;
	}

}
