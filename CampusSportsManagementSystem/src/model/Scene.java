package model;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * 场次信息实体类
 * @author Administrator
 *
 */
public class Scene {
	private int sceneid;
	private Arrange arrange;
	private Match match;
	
	public Scene() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Scene(int sceneid, Arrange arrange, Match match) {
		super();
		this.sceneid = sceneid;
		this.arrange = arrange;
		this.match = match;
	}

	public int getSceneid() {
		return sceneid;
	}

	public void setSceneid(int sceneid) {
		this.sceneid = sceneid;
	}

	public Arrange getArrange() {
		return arrange;
	}

	public void setArrange(Arrange arrange) {
		this.arrange = arrange;
	}

	public Match getMatch() {
		return match;
	}

	public void setMatch(Match match) {
		this.match = match;
	}
	
	/**
	 * 初始化ResultSet中的第一条数据
	 * @param rs ResultSet结果集
	 */
	public Scene(ResultSet rs) {
		//rs中只会初始化第一条记录的数据
		try{
			if(rs != null && rs.next()){//必须一一对应
				this.sceneid = rs.getInt("matchid");
				Arrange arrange = new Arrange(rs);
				this.arrange = arrange;
				Match match = new Match(rs);
				this.match = match;
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	/**
	 * ResultSet结果集转List
	 * @param rs ResultSet结果集
	 * @return list
	 */
	public static List toList(ResultSet rs){
		//静态方法，用于将0~N的VUser视图数据交换到List数组中来
		List<Scene> list = new ArrayList<Scene>();
		if(rs != null){
			try{
				while(rs.next()){
					Scene scene = new Scene();
					scene.setSceneid(rs.getInt("sceneid"));
					Arrange arrange = new Arrange();
					arrange.setArrid(rs.getInt("arrid"));
					scene.setArrange(arrange);
					Match match = new Match();
					match.setMatchid(rs.getInt("matchid"));
					scene.setMatch(match);
					list.add(scene);
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
