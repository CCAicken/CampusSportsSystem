package model;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import common.properties.ProjectType;
import common.properties.RoleType;

/**
 * 成绩实体类
 * @author Administrator
 *
 */
public class Score {

	private int scoreid;
	private Match match;
	private double scorenumber;
	
	public Score() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Score(int scoreid, Match match, double scorenumber) {
		super();
		this.scoreid = scoreid;
		this.match = match;
		this.scorenumber = scorenumber;
	}

	public int getScoreid() {
		return scoreid;
	}

	public void setScoreid(int scoreid) {
		this.scoreid = scoreid;
	}

	public Match getMatch() {
		return match;
	}

	public void setMatch(Match match) {
		this.match = match;
	}

	public double getScorenumber() {
		return scorenumber;
	}

	public void setScorenumber(double scorenumber) {
		this.scorenumber = scorenumber;
	}
	
	/**
	 * 初始化ResultSet中的第一条数据
	 * @param rs ResultSet结果集
	 */
	public Score(ResultSet rs){
		//rs中只会初始化第一条记录的数据
		try{
			if(rs != null && rs.next()){//必须一一对应
				this.scoreid = rs.getInt("scoreid");
				this.scorenumber = rs.getDouble("scorenumber");
				Match match = new Match(rs);
				this.match = match;
				
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	/**
	 * ResultSet结果集转List
	 * @param rs ResultSet结果集
	 * @return list
	 */
	public static List toList(ResultSet rs){
		//静态方法，用于将0~N的VUser视图数据交换到List数组中来
		List<Score> list = new ArrayList<Score>();
		if(rs != null){
			try{
				while(rs.next()){
					Score score = new Score();
					score.setScoreid(rs.getInt("scoreid"));
					score.setScorenumber(rs.getDouble("scorenumber"));
					Match match = new Match();
					match.setMatchid(rs.getInt("matchid"));
					score.setMatch(match);;
					list.add(score);
				}
			}catch(Exception e){
				e.printStackTrace();
			}
		}else{
			return null;
		}
		return list;
	}
}
