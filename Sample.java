import java.util.Scanner;
public class Sample {
int findCount(int n,int arr[],int a){
	int count=0;
	for(int i=0;i<n;i++){
		if(arr[i]==a){
			count++;
		}
	}
	return count;
}
public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
	        arr[i]=s.nextInt();
		}
		Sample c=new Sample();
		int a=s.nextInt();
		System.out.println(c.findCount(n,arr,a)+" ");
		
	}

}
