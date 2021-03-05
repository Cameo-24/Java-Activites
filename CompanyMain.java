import java.util.Scanner;
public class CompanyMain 
{
	public static void main(String arggs[]){
		Scanner s=new Scanner(System.in);
		Company m=new Company();
		String a=s.nextLine();
		String b=s.nextLine();
		String c=s.nextLine();
		
		m.setName(a);
		m.setEmployess(b);
		m.setTeamlead(c);
		if(m.getTeamlead().equals(c)){
			
			m.display();
			
		}
		else{
			System.out.println("Invalid");
		}
		s.close();
		
	}
}
