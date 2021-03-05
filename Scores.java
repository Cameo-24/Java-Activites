import java.util.*;
public class Scores extends Thread{
	private int start;
	private int end;
	private String Even;
	private String Odd;
	public Scores(int start, int end) {
		this.start = start;
		this.end = end;
	}
	
	
	public int getStart() {
		return start;
	}


	public void setStart(int start) {
		this.start = start;
	}


	public int getEnd() {
		return end;
	}


	public void setEnd(int end) {
		this.end = end;
	}


	public String getEven() {
		return Even;
	}

	public void setEven(String even) {
		Even = even;
	}

	public String getOdd() {
		return Odd;
	}

	public void setOdd(String odd) {
		Odd = odd;
	}

	public void display(){
		int a=start;
		int b=end;
		ArrayList<String> al = new ArrayList<>();
		for(int i=a;i<=b;i++){
			if(i%2==0){
				al.add(Integer.toString(i));
				setEven(Even);
				
			}
			else{
				al.add(Integer.toString(i));
				setOdd(Even);
				
			}
			
		}
		System.out.println(" "+getEven());
		System.out.println(" "+getEven());
		
		
	
		}
		
		
	}
	
