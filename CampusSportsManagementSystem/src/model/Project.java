package model;

public class Project {

	private int proid;
	private String proname;
	private String starttime;
	private String endtime;
	private String addr;
	private int limit;
	private int protype;
	
	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Project(int proid, String proname, String starttime, String endtime,
			String addr, int limit, int protype) {
		super();
		this.proid = proid;
		this.proname = proname;
		this.starttime = starttime;
		this.endtime = endtime;
		this.addr = addr;
		this.limit = limit;
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
	
	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}
	
	public int getProtype() {
		return protype;
	}

	public void setProtype(int protype) {
		this.protype = protype;
	}
}
