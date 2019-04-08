package model;
/**
 * 场次安排实体类
 * @author Administrator
 *
 */
public class Arrange {
	private int arrid;
	private String arrname;
	private int proid;
	private String starttime;
	private String endtime;
	private String addr;
	private int leveltype;
	private int state;
	
	public Arrange() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Arrange(int arrid, String arrname, int proid, String starttime,
			String endtime, String addr, int leveltype, int state) {
		super();
		this.arrid = arrid;
		this.arrname = arrname;
		this.proid = proid;
		this.starttime = starttime;
		this.endtime = endtime;
		this.addr = addr;
		this.leveltype = leveltype;
		this.state = state;
	}

	public int getArrid() {
		return arrid;
	}

	public void setArrid(int arrid) {
		this.arrid = arrid;
	}

	public String getArrname() {
		return arrname;
	}

	public void setArrname(String arrname) {
		this.arrname = arrname;
	}

	public int getProid() {
		return proid;
	}

	public void setProid(int proid) {
		this.proid = proid;
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

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public int getLeveltype() {
		return leveltype;
	}

	public void setLeveltype(int leveltype) {
		this.leveltype = leveltype;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}
	
}
