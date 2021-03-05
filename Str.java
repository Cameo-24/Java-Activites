import java.util.Scanner;
public class Str {
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		String a=s.nextLine();
		String b=s.nextLine();
		char ch=a.charAt(0);
		String c=b.toUpperCase();
		String r=a+c;
		System.out.println(r);
	}

}
