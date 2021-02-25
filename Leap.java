import java.util.Scanner;
class Leap {
	 boolean CheckLeap(int year){
		 if(year % 400 ==0)
			 return true;
			 if(year % 100 ==0)
				 return false;
				 if(year % 4==0)
					 return true;
				 return false;
				 
			
		
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int year=s.nextInt();
		while(year<=0)
		{
			System.out.println("Invalid");
			year=s.nextInt();
		}
		Leap obj = new Leap();
		
		if(obj.CheckLeap(year)){
			System.out.println("Leap Year");
		}
		else
		{
			System.out.println("Not a leap Year");
		}
		s.close();
	}
      

}