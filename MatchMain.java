import java.util.Scanner;
public class MatchMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Match Format: ");
		System.out.println("1.ODI");
		System.out.println("2.TEST");
		System.out.println("3.T20");
		int choice = sc.nextInt();
		System.out.println("Enter Current Score:");
		int currentScore = sc.nextInt();
		System.out.println("Enter Current Over: ");
		int currentOver = sc.nextInt();
		System.out.println("Enter Target: ");
		int target = sc.nextInt();
		if(choice==1)
		{
			ODIMatch obj = new ODIMatch();
			obj.setCurrentOver(currentOver);
			obj.setCurrentScore(currentScore);
			obj.setTarget(target);
			int balls = obj.calculateBalls();
			float runrate = obj.calculateRunRate();
			obj.display((double)runrate, balls);
			
		}
		else if(choice==2)
		{
			Test obj = new Test();
			obj.setCurrentOver(currentOver);
			obj.setCurrentScore(currentScore);
			obj.setTarget(target);
			int balls = obj.calculateBalls();
			float runrate = obj.calculateRunRate();
			obj.display((double)runrate, balls);
			
		}
		else
		{
			IPL obj = new IPL();
			obj.setCurrentOver(currentOver);
			obj.setCurrentScore(currentScore);
			obj.setTarget(target);
			int balls = obj.calculateBalls();
			float runrate = obj.calculateRunRate();
			obj.display((double)runrate, balls);
			
		}
		
		sc.close();

	}
		

	}


