package model;
/**
 * ≈‰÷√ µÃÂ¿‡
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
}
