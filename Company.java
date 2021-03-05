import java.util.Scanner;
public class Company {
	private String name;
	private String employess;
	private String teamlead;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmployess() {
		return employess;
	}
	public void setEmployess(String employess) {
		this.employess = employess;
	}
	public String getTeamlead() {
		return teamlead;
	}
	public void setTeamlead(String teamlead) {
		this.teamlead = teamlead;
	}
	public void display() {
		System.out.println("Company Name:"+name);
		System.out.println("Employess:"+employess);
		System.out.println("TeamLead:"+teamlead);
	}
	
	
}
