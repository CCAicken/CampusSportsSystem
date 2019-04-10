package model;
/**
 * 班级实体类
 * @author Administrator
 *
 */
public class Classes {
	
	private int classid;
	private String classname;
	private Major major;
	
	public Classes() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Classes(int classid, String classname, Major major) {
		super();
		this.classid = classid;
		this.classname = classname;
		this.major = major;
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
	public Major getMajor() {
		return major;
	}
	public void setMajor(Major major) {
		this.major = major;
	}
}
