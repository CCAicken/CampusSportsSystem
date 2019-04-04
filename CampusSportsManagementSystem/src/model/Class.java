package model;

public class Class {
	
	private int classid;
	private String classname;
	private Teacher teacher;
	
	public Class() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Class(int classid, String classname, Teacher teacher) {
		super();
		this.classid = classid;
		this.classname = classname;
		this.teacher = teacher;
	}
	
	public int getClassid() {
		return classid;
	}
	public void setClassid(int classid) {
		this.classid = classid;
	}
	public String getClassname() {
		return classname;
	}
	public void setClassname(String classname) {
		this.classname = classname;
	}
	public Teacher getteacher() {
		return teacher;
	}
	public void setteacher(Teacher teacher) {
		this.teacher = teacher;
	}
}
