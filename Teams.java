import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Teams {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		ArrayList arr=new ArrayList();
		 arr.add(sc.nextLine());
		 arr.add(sc.nextLine());
		 arr.add(sc.nextLine());
		 arr.add(sc.nextLine());
		 arr.add(sc.nextLine());
		 for(int i=0;i<arr.size();i++)
		 {
			 System.out.println(arr.get(i));
		 }
		 System.out.println("Enter Swap Position");
		 int n=sc.nextInt();
		 int m=sc.nextInt();
		
		 for(int i=0;i<arr.size();i++)
		 {
			 Collections.swap(arr, n, m );
			 System.out.println(arr.get(i));
		 }
		 
		
	}

}
