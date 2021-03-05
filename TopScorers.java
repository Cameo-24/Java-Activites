import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class TopScorers {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		ArrayList arr=new ArrayList();
		System.out.println("Enter the top 5 Scorers of IPL Season 13");
		 arr.add(sc.nextLine());
		 arr.add(sc.nextLine());
		 arr.add(sc.nextLine());
		 arr.add(sc.nextLine());
		 arr.add(sc.nextLine());
		 ArrayList arr1=new ArrayList();
		 System.out.println("Enter the top 5 Scorers of IPL Season 13");
		 arr1.add(sc.nextLine());
		 arr1.add(sc.nextLine());
		 arr1.add(sc.nextLine());
		 arr1.add(sc.nextLine());
		 arr1.add(sc.nextLine());
		 for(int i=0;i<arr1.size();i++){
			 if(arr1.contains(arr.get(i))){
				 System.out.println(arr.get(i));
			 }
				 
			 }
		 }
		 
}
