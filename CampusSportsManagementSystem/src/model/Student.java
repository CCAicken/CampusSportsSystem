package model;

public class Student {

	private String stuid;
	private String stuname;
	private String stupwd;
	private String stuagend;
	private String stumobile;
	private Class classid;
	
	public Student() {
		super();
	}
	
	public Student(String stuid, String stuname, String stupwd,
			String stuagend, String stumobile, Class classid) {
		super();
		this.stuid = stuid;
		this.stuname = stuname;
		this.stupwd = stupwd;
		this.stuagend = stuagend;
		this.stumobile = stumobile;
		this.classid = classid;
	}
	
	public String getStuid() {
		return stuid;
	}
	public void setStuid(String stuid) {
		this.stuid = stuid;
	}
	public String getStuname() {
		return stuname;
	}
	public void setStuname(String stuname) {
		this.stuname = stuname;
	}
	public String getStupwd() {
		return stupwd;
	}
	public void setStupwd(String stupwd) {
		this.stupwd = stupwd;
	}
	public String getStuagend() {
		return stuagend;
	}
	public void setStuagend(String stuagend) {
		this.stuagend = stuagend;
	}
	public String getStumobile() {
		return stumobile;
	}
	public void setStumobile(String stumobile) {
		this.stumobile = stumobile;
	}
	public Class getclassid() {
		return classid;
	}
	public void setclassid(Class classid) {
		this.classid = classid;
	}
}
