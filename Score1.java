import java.util.*;
public class Score1 extends Thread {
	String matchType;
	  String scoreString;
	  
	  public Score1(String matchType, String scoreString) {
			this.matchType = matchType;
			this.scoreString = scoreString;
	  }
	public String getMatchType() {
		return matchType;
	}
	public void setMatchType(String matchType) {
		this.matchType = matchType;
	}
	public String getScoreString() {
		return scoreString;
	}
	public void setScoreString(String scoreString) {
		this.scoreString = scoreString;


	}
	public void getScores()
	{
		String array[] = scoreString.split(",");
		ArrayList<Integer> al = new ArrayList<>();
		for(int i=0;i<array.length;i++)
		{
			al.add(Integer.parseInt(array[i]));
		}
		Collections.sort(al);
		for(int e:al)
		{
			System.out.println(e);
		}
	}
	public void run()
	{
		System.out.println("After Sorting "+matchType);
		getScores();
	}
	  
	

}
