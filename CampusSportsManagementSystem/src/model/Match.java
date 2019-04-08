package model;
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

	public User getuser() {
		return user;
	}

	public void setuser(User user) {
		this.user = user;
	}
}
