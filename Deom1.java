import java.util.Scanner;

public class Deom1 {
	int PerformSum(int a,int b,int c){
		if(a==1){
			return a+b;
		}
		else if(b==2){
			return a-b;
		}
		else if (c==3){
			return a*b;
		}
		else{
			return a/b;
		}
	}
	
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		Deom1 d=new Deom1();
		System.out.println(d.PerformSum(a,b,c)+" ");
		
	}

}
