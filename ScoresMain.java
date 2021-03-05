import java.util.Scanner;
public class ScoresMain {
	public static void main(String args[]){
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Match");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		Scores obj= new Scores(a,b);
		try
		{
		Thread th = new Thread(obj);
		obj.start();
		obj.join();
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
		
	
}

}
