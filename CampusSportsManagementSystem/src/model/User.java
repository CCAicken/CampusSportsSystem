package model;
/**
 * 用户实体类
 * @author Administrator
 *
 */
public class User {
	
	private String userid;
	private String username;
	private String pwd;
	private String agend;
	private String mobile;
	private Role role;
	private College college;
	private Classes classes;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public User(String userid, String username, String pwd,
			String agend, String mobile, Role role, College college,Classes classes) {
		super();
		this.userid = userid;
		this.username = username;
		this.pwd = pwd;
		this.agend = agend;
		this.mobile = mobile;
		this.role = role;
		this.college = college;
		this.classes = classes;
	}
	
	public String getuserid() {
		return userid;
	}
	public void setuserid(String userid) {
		this.userid = userid;
	}
	public String getusername() {
		return username;
	}
	public void setusername(String username) {
		this.username = username;
	}
	public String getpwd() {
		return pwd;
	}
	public void setpwd(String pwd) {
		this.pwd = pwd;
	}
	public String getagend() {
		return agend;
	}
	public void setagend(String agend) {
		this.agend = agend;
	}
	public String getmobile() {
		return mobile;
	}
	public void setmobile(String mobile) {
		this.mobile = mobile;
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
	public Classes getclasses() {
		return classes;
	}
	public void setcollege(Classes classes) {
		this.classes = classes;
	}
}
