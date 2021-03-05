import java.util.Scanner;
public class CustomerMain 
{
	public static void main(String arggs[]){
		Scanner s=new Scanner(System.in);
		Customer m=new Customer();
		String a=s.nextLine();
		String arr[]=a.split(",");
		m.setName(arr[0]);
		m.setAddress(arr[1]);
		m.setMobile(arr[2]);
	System.out.println(m);
		
	}

}
