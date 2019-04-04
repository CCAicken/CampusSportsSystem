package model;

public class Score {

	private int scoreid;
	private Match match;
	private double scorenumber;
	
	public Score() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Score(int scoreid, Match match, double scorenumber) {
		super();
		this.scoreid = scoreid;
		this.match = match;
		this.scorenumber = scorenumber;
	}

	public int getScoreid() {
		return scoreid;
	}

	public void setScoreid(int scoreid) {
		this.scoreid = scoreid;
	}

	public Match getMatch() {
		return match;
	}

	public void setMatch(Match match) {
		this.match = match;
	}

	public double getScorenumber() {
		return scorenumber;
	}

	public void setScorenumber(double scorenumber) {
		this.scorenumber = scorenumber;
	}
}
