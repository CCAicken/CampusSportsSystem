package business.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import model.Score;
import model.Student;
import business.basic.BaseDao;
import business.basic.BaseDaoImpl;
import business.dao.ScoreDAO;

public class ScoreDaoImpl implements ScoreDAO {

	private BaseDao bdao=null;
	public ScoreDaoImpl(){
		bdao=new BaseDaoImpl();
	}
	@Override
	public boolean insert(Score score) {
		String sql="insert into T_Score(matchid,scorenumber) values(?,?)";
		Object[] param={score.getMatch(),score.getScorenumber()};
		int row = bdao.insert(sql,param);
		if(row>0)
		{
			return true;
		}else {
			return false;
		}
		
	}

	@Override
	public boolean update(Score score) {
		String sql="update T_Score set matchid=?,scorenumber=? where scoreid=?";
		Object[] param={score.getMatch(),score.getScorenumber(),score.getScoreid()};
		int row= bdao.update(sql,param);
		if(row>0)
		{
		return true;	
		}else {
			return false;
		}
	}

	@Override
	public List<Score> getByUser(String userid) {
		String sql = "select * from V_StudentScore where userid=?";
		Object[] param = {userid};
		ResultSet rs = bdao.select(sql, param);
		List<Score> list = null;
		try {
			if(rs!=null&&rs.next()){
				list = Score.toList(rs);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			return list;
		}
	}

}
