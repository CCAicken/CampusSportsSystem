package model;

public class Teacher {
	
	private String teaid;
	private String teaname;
	private String teapwd;
	private String teaagend;
	private String teamobile;
	private Role role;
	private College college;
	
	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Teacher(String teaid, String teaname, String teapwd,
			String teaagend, String teamobile, Role role, College college) {
		super();
		this.teaid = teaid;
		this.teaname = teaname;
		this.teapwd = teapwd;
		this.teaagend = teaagend;
		this.teamobile = teamobile;
		this.role = role;
		this.college = college;
	}
	
	public String getTeaid() {
		return teaid;
	}
	public void setTeaid(String teaid) {
		this.teaid = teaid;
	}
	public String getTeaname() {
		return teaname;
	}
	public void setTeaname(String teaname) {
		this.teaname = teaname;
	}
	public String getTeapwd() {
		return teapwd;
	}
	public void setTeapwd(String teapwd) {
		this.teapwd = teapwd;
	}
	public String getTeaagend() {
		return teaagend;
	}
	public void setTeaagend(String teaagend) {
		this.teaagend = teaagend;
	}
	public String getTeamobile() {
		return teamobile;
	}
	public void setTeamobile(String teamobile) {
		this.teamobile = teamobile;
	}
	public Role getrole() {
		return role;
	}
	public void setrole(Role role) {
		this.role = role;
	}
	public College getcollege() {
		return college;
	}
	public void setcollege(College college) {
		this.college = college;
	}
}
