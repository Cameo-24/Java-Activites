import java.util.Scanner;
public class Str1 {
	 public static void main(String args[]){
		 Scanner s=new Scanner(System.in);
		 String a=s.nextLine();
		 String b=s.nextLine();
		 String c=a.substring(5);
		 String d=b.substring(5);
		 if(c==d){
			 System.out.println("Yes");
		 }
		 else{
			 System.out.println("No");
		 }
	 }

}
