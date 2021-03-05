import java.util.Scanner;
public class VehicleMain {
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		System.out.println("1 for TwoWheeler");
		System.out.println("2 for FourWheeler");
		int value=s.nextInt();
		if(value==1){
			System.out.println("Vehicle Name");
			String m=s.next();
			System.out.println("\nVehicle Number");
			String n=s.next();
			System.out.println("Fuel type");
			int v=s.nextInt();
			String f=" ";
			if(v==1){
				f="Petrol";
				
			}
			else if(v==2){
				f="Diesel";
			}
			else{
				System.out.println("Invalid");
			}
			System.out.println("Fuel Capacity:");
			int c=s.nextInt();
			System.out.println("CC:");
			int cc=s.nextInt();
			System.out.println("KickStart Avaliable:");
			String k=s.next();
			boolean b=true;
			if(k=="yes"){
				b=true;
			}
			else{
				b=false;
			
			}
			
			TwoWheeler t=new TwoWheeler(m, n, f, c, cc, b);	
			t.displayMake();
			t.displayBasicInfo();
			t. displayDetailInfo1();
			
			
		}
		else if(value==2){
			System.out.println("Vehicle Name");
			String m=s.next();
			System.out.println("\nVehicle Number");
			String n=s.next();
			System.out.println("Fuel type");
			int v=s.nextInt();
			String f=" ";
			if(v==1){
				f="Petrol";
				
			}
			else if(v==2){
				f="Diesel";
			}
			else{
				System.out.println("Invalid");
			}
			System.out.println("Fuel Capacity:");
			int c=s.nextInt();
			System.out.println("CC:");
			int cc=s.nextInt();
			System.out.println("Audio type:");
			String a=s.next();
			System.out.println("No of Doors:");
			int d=s.nextInt();
			
			FourWheeler w = new FourWheeler(m, n, f, c, cc, a, d);
			w.displayMake();
			w.displayBasicInfo();
			w.displayDetailInfo();
			
			
		}

		else{
			System.out.print("invalid");
		}
		
	}

}
