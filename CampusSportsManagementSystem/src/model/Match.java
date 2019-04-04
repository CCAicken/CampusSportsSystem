package model;

public class Match {

	private int matchid;
	private Project project;
	private String stuname;
	
	public Match() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Match(int matchid, Project project, String stuname) {
		super();
		this.matchid = matchid;
		this.project = project;
		this.stuname = stuname;
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

	public String getStuname() {
		return stuname;
	}

	public void setStuname(String stuname) {
		this.stuname = stuname;
	}
}
