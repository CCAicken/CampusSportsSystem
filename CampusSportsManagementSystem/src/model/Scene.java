package model;

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
	
}
