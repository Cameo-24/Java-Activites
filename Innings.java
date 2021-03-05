
public class Innings {
	private  String teamname;
	private String inningname;
	private int runs;
	public String getTeamname(){
		return teamname;
	}
	public void setTeamname(String teamname){
		this.teamname=teamname;
	}
	public String getInningname(){
		return inningname;
	}
	public void setInningname(String inningname){
		this.inningname=inningname;
	}
	public int getRuns(){
		return runs;
	}
	public void setRuns(int runs){
		this.runs=runs;
	}
	void displayInningsDetails(){
		 System.out.println("Name:"+teamname+"\nScored:"+runs+"\nNeed 201 to win");
		
	}
	 public static void main(String args[]){
		 Innings e=new Innings();
		 e.setTeamname("Australia");
		 e.setInningname("First");
		 e.setRuns(200);
		 e.displayInningsDetails();
		
	 }

}
