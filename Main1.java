import java.util.Scanner;
public class Main1 {
	public static void main(String args[]){
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter the Match");
			String match = sc.next();
			System.out.println("Enter the Scores: ");
			String score = sc.next();
			
			System.out.println("Enter the Match");
			String match1 = sc.next();
			System.out.println("Enter the Scores: ");
			String score1 = sc.next();
			System.out.println("Enter the Match");
			String Score1 = sc.next();
			
	
			System.out.println("Enter the Scores: ");
			String score2 = sc.next();
			
			Score1 obj = new Score1(match,score);
			Score1 obj1 = new Score1(match1,score1);
			Score1 obj2 = new Score1(Score1,score2);
			try
			{
			Thread th = new Thread(obj);
			obj.start();
			obj.join();
			Thread th1 = new Thread(obj1);
			obj1.start();
			obj1.join();
			Thread th2 = new Thread(obj2);
			obj2.start();
			obj2.join();
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
			
		
	}

}
