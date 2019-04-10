package model;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * 配置实体类
 * @author Administrator
 *
 */
public class Config {

	private int configid;
	private String starttime;
	private String endtime;
	
	public Config() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Config(int configid, String starttime, String endtime) {
		super();
		this.configid = configid;
		this.starttime = starttime;
		this.endtime = endtime;
	}
	
	public int getConfigid() {
		return configid;
	}
	public void setConfigid(int configid) {
		this.configid = configid;
	}
	public String getStarttime() {
		return starttime;
	}
	public void setStarttime(String starttime) {
		this.starttime = starttime;
	}
	public String getEndtime() {
		return endtime;
	}
	public void setEndtime(String endtime) {
		this.endtime = endtime;
	}
	
	/**
	 * 初始化ResultSet中的第一条数据
	 * @param rs ResultSet结果集
	 */
	public Config(ResultSet rs) {
		//rs中只会初始化第一条记录的数据
		try{
			if(rs != null && rs.next()){//必须一一对应
				this.configid = rs.getInt("configid");
				this.starttime = rs.getString("starttime");
				this.endtime = rs.getString("endtime");
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
		List<Config> list = new ArrayList<Config>();
		if(rs != null){
			try{
				while(rs.next()){
					Config config = new Config();
					config.setConfigid((rs.getInt("configid")));
					config.setStarttime((rs.getString("starttime")));
					config.setEndtime((rs.getString("endtime")));
					list.add(config);
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
