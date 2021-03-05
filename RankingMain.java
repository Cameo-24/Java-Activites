import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class RankingMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Ranking> arr=new ArrayList<Ranking>();
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
			System.out.println("Enter the name of the Player:"+(i+1));
			String s=sc.next();
				System.out.println("Enter the Score of the Player:"+(i+1));
				int m=sc.nextInt();
				arr.add(new Ranking(s,m));
}
				
			

		Collections.sort(arr);
		for(Ranking r:arr){
			System.out.println(r.getName()+" "+r. getScore()+" ");
		}

		
		// TODO Auto-generated method stub

	}

}
