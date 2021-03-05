import java.util.*;
public class Match  implements Comparable<Match>{
	private String Date;
	private String teamOne;
	private String teamTwo;
	public Match(String date, String teamOne, String teamTwo) {
		super();
		Date = date;
		this.teamOne = teamOne;
		this.teamTwo = teamTwo;
	}
	public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		Date = date;
	}
	public String getTeamOne() {
		return teamOne;
	}
	public void setTeamOne(String teamOne) {
		this.teamOne = teamOne;
	}
	public String getTeamTwo() {
		return teamTwo;
	}
	public void setTeamTwo(String teamTwo) {
		this.teamTwo = teamTwo;
	}
	
	
	
	

}
