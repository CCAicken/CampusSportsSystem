package model;

public class User {
	
	private String userid;
	private String username;
	private String userpwd;
	private String useragend;
	private String usermobile;
	private Role role;
	private College college;
	private Class classid;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public User(String userid, String username, String userpwd,
			String useragend, String usermobile, Role role, College college,Class classid) {
		super();
		this.userid = userid;
		this.username = username;
		this.userpwd = userpwd;
		this.useragend = useragend;
		this.usermobile = usermobile;
		this.role = role;
		this.college = college;
		this.classid = classid;
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
	public String getuserpwd() {
		return userpwd;
	}
	public void setuserpwd(String userpwd) {
		this.userpwd = userpwd;
	}
	public String getuseragend() {
		return useragend;
	}
	public void setuseragend(String useragend) {
		this.useragend = useragend;
	}
	public String getusermobile() {
		return usermobile;
	}
	public void setusermobile(String usermobile) {
		this.usermobile = usermobile;
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
	public Class getclassid() {
		return classid;
	}
	public void setcollege(Class classid) {
		this.classid = classid;
	}
}
