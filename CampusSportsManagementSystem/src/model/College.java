package model;
/**
 * 学院实体类
 * @author Administrator
 *
 */
public class College {
	
	private int collegeid;
	private String collegename;
	
	public College() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public College(int collegeid, String collegename) {
		super();
		this.collegeid = collegeid;
		this.collegename = collegename;
	}
	
	public int getCollegeid() {
		return collegeid;
	}
	public void setCollegeid(int collegeid) {
		this.collegeid = collegeid;
	}
	public String getCollegename() {
		return collegename;
	}
	public void setCollegename(String collegename) {
		this.collegename = collegename;
	}
}
