package model;
/**
 * 专业实体类
 * @author Administrator
 *
 */
public class Major {

	private int majorid;
	private String majorname;
	private College collegeid;
	
	public Major() {
		super();
	}

	public Major(int majorid, String majorname, College collegeid) {
		super();
		this.majorid = majorid;
		this.majorname = majorname;
		this.collegeid = collegeid;
	}

	public int getMajorid() {
		return majorid;
	}

	public void setMajorid(int majorid) {
		this.majorid = majorid;
	}

	public String getMajorname() {
		return majorname;
	}

	public void setMajorname(String majorname) {
		this.majorname = majorname;
	}

	public College getCollegeid() {
		return collegeid;
	}

	public void setCollegeid(College collegeid) {
		this.collegeid = collegeid;
	}
	
}
