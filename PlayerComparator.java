import java.util.Comparator;
public class PlayerComparator implements Comparator<Player1> {

	public int compare(Player1 o1,Player1 o2){  
		Player1 s1=(Player1)o1;  
		Player1 s2=(Player1)o2;  
		  
		if(s1.getName()==s2.getName())  
		return 0;   
		else  
		return -1;  
		}  
		}  
