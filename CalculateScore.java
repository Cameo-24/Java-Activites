import java.util.*;
public class CalculateScore extends Thread {
	public String matchString;
	public String scoreString;
	public int sum=0;
	public double meanScore;
	public int minscore;
	public int maxscore;
	public CalculateScore(String matchString, String scoreString) {
		super();
		this.matchString = matchString;
		this.scoreString = scoreString;
	}
	
	public String getMatchString() {
		return matchString;
	}

	public void setMatchString(String matchString) {
		this.matchString = matchString;
	}

	public String getScoreString() {
		return scoreString;
	}

	public void setScoreString(String scoreString) {
		this.scoreString = scoreString;
	}

	public double getMeanScore() {
		return meanScore;
	}

	public void setMeanScore(double meanScore) {
		this.meanScore = meanScore;
	}

	public int getMinscore() {
		return minscore;
	}

	public void setMinscore(int minscore) {
		this.minscore = minscore;
	}

	public int getMaxscore() {
		return maxscore;
	}

	public void setMaxscore(int maxscore) {
		this.maxscore = maxscore;
	}

	public void run(){
		String ar[] = scoreString.split(",");
		int sum=0;
		ArrayList<Integer> al = new ArrayList<>();
		for(int i=0;i<ar.length;i++)
		{
			al.add(Integer.parseInt(ar[i]));
			
		}
		   for(int i=0;i<al.size();i++)
		    {
		    	sum = sum+al.get(i);
		    }
		   meanScore = (double)sum/(double)al.size();
		    Collections.sort(al);
			minscore = al.get(0);
			maxscore = Collections.max(al);
			String strDouble = String.format("%.2f", meanScore);
			System.out.println("Mean Score: "+strDouble);
			System.out.println("Min Score: "+getMinscore());
			System.out.println("Max Score: "+getMaxscore());
		    
		
	}

}
					