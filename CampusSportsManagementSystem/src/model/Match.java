package model;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * 比赛报名实体类
 * @author Administrator
 *
 */
public class Match {

	private int matchid;
	private Project project;
	private User user;
	
	public Match() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Match(int matchid, Project project, User user) {
		super();
		this.matchid = matchid;
		this.project = project;
		this.user = user;
	}

	public int getMatchid() {
		return matchid;
	}

	public void setMatchid(int matchid) {
		this.matchid = matchid;
	}

	public Project getproject() {
		return project;
	}

	public void setproject(Project project) {
		this.project = project;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	/**
	 * ResultSet结果集转List
	 * @param rs ResultSet结果集
	 * @return list
	 */
	public static List toList(ResultSet rs){
		//静态方法，用于将0~N的VUser视图数据交换到List数组中来
		List<Match> list = new ArrayList<Match>();
		if(rs != null){
			try{
				while(rs.next()){
					Match match = new Match();
					match.setMatchid((rs.getInt("matchid")));
					Project project = new Project();
					project.setProid(rs.getInt("proid"));
					match.setproject(project);
					User user = new User();
					user.setUserid(rs.getString("userid"));
					match.setUser(user);;
					list.add(match);
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
