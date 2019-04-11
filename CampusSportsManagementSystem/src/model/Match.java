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
	private Student user;
	
	public Match() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Match(int matchid, Project project, Student user) {
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

	public Student getUser() {
		return user;
	}

	public void setUser(Student user) {
		this.user = user;
	}
	
	/**
	 * 初始化ResultSet中的第一条数据
	 * @param rs ResultSet结果集
	 */
	public Match(ResultSet rs) {
		//rs中只会初始化第一条记录的数据
		try{
			if(rs != null && rs.next()){//必须一一对应
				this.matchid = rs.getInt("matchid");
				Project project = new Project(rs);
				this.project = project;
				Student user = new Student(rs);
				this.user = user;
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
		List<Match> list = new ArrayList<Match>();
		if(rs != null){
			try{
				do{
					Match match = new Match();
					match.setMatchid((rs.getInt("matchid")));
					Project project = new Project();
					project.setProid(rs.getInt("proid"));
					match.setproject(project);
					Student user = new Student();
					user.setUserid(rs.getString("userid"));
					match.setUser(user);;
					list.add(match);
				}while(rs.next());
			}catch(Exception e){
				e.printStackTrace();
			}
		}else{
			return null;
		}
		return list;
	}
}
