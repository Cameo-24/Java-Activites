import java.util.ArrayList;
import java.util.Scanner;
public class FiftyAndH {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> arr=new ArrayList<Integer>();
		int n=sc.nextInt();
		int f=0;
		int h=0;
		for(int i=0;i<n;i++){
			arr.add(sc.nextInt());
			if(arr.get(i)>50 && arr.get(i)<=100){
				f++;
			}
			if(arr.get(i)>100){
				h++;
			}
		}
		System.out.println(f);
		System.out.println(h);
		
		
	}

}
