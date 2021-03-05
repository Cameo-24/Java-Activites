import java.util.*;
public class Player implements Comparable<Player> {
	private String name;

	public Player(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

	public int compareTo(Player r){
		 if(name==r.name)    
			 return 0;      
			 else    
			 return -1;     
		
	}
	
}
