import java.util.Scanner;

public class Sample1 {
	 public static void findId(int n,int arr[],int sc){
		for(int i=1;i<n;i=i+2){
				if(arr[i]>sc){
					System.out.println(arr[i-1]);
				}
			}
		
	}
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=s.nextInt();
		}
		
		int sc=s.nextInt();
		findId(n,arr,sc);
		
	}

}
