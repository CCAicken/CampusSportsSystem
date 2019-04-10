package model;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

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
	public static List toList(ResultSet rs){
		//静态方法，用于将0~N的VUser视图数据交换到List数组中来
		List<College> list = new ArrayList<College>();
		if(rs != null){
			try{
				while(rs.next()){
					College college = new College();
					college.setCollegeid((rs.getInt("collegeid")));
					college.setCollegename((rs.getString("collegename")));
					list.add(college);
				}
			}catch(Exception e){
				e.printStackTrace();
			}
		}else{
			return null;
		}
		return list;
	}
}
