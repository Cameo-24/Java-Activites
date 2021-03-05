import java.util.HashSet;
import java.util.Scanner;
public class HashSet1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		HashSet<String>  s=new HashSet<>();
		int size = sc.nextInt();
		for(int i=0;i<size;i++)
		{
			s.add(sc.next());
		}
		for(String i:s)
		{
			System.out.println(i);
		}
		

	}

		// TODO Auto-generated method stub

	

}
