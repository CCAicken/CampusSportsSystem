package model;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * 比赛项目实体类
 * @author Administrator
 *
 */
public class Project {

	private int proid;
	private String proname;
	private int scenelimit;
	private int collegelimit;
	private int totallimit;
	private int protype;
	
	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Project(int proid, String proname, int scenelimit, int collegelimit,
			int totallimit, int protype) {
		super();
		this.proid = proid;
		this.proname = proname;
		this.scenelimit = scenelimit;
		this.collegelimit = collegelimit;
		this.totallimit = totallimit;
		this.protype = protype;
	}

	public int getProid() {
		return proid;
	}

	public void setProid(int proid) {
		this.proid = proid;
	}

	public String getProname() {
		return proname;
	}

	public void setProname(String proname) {
		this.proname = proname;
	}

	public int getScenelimit() {
		return scenelimit;
	}

	public void setScenelimit(int scenelimit) {
		this.scenelimit = scenelimit;
	}

	public int getCollegelimit() {
		return collegelimit;
	}

	public void setCollegelimit(int collegelimit) {
		this.collegelimit = collegelimit;
	}

	public int getTotallimit() {
		return totallimit;
	}

	public void setTotallimit(int totallimit) {
		this.totallimit = totallimit;
	}

	public int getProtype() {
		return protype;
	}

	public void setProtype(int protype) {
		this.protype = protype;
	}
	
	/**
	 * ResultSet结果集转List
	 * @param rs ResultSet结果集
	 * @return list
	 */
	public static List toList(ResultSet rs){
		//静态方法，用于将0~N的VUser视图数据交换到List数组中来
		List<Project> list = new ArrayList<Project>();
		if(rs != null){
			try{
				while(rs.next()){
					Project project = new Project();
					project.setProid((rs.getInt("proid")));
					project.setProname((rs.getString("proname")));
					project.setProtype((rs.getInt("protype")));
					project.setCollegelimit((rs.getInt("collegelimit")));
					project.setScenelimit((rs.getInt("scenelimit")));
					project.setTotallimit((rs.getInt("totallimit")));
					list.add(project);
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
