



public class Employee {
	private  String Name;
	private String Address;
	private String Mobile;
	public String getName(){
		return Name;
	}
	public void setName(String Name){
		this.Name=Name;
	}
	public String getAddress(){
		return Address;
	}
	public void setAddress(String Address){
		this.Address=Address;
	}
	public String getMobile(){
		return Mobile;
	}
	public void setMobile(String Mobile){
		this.Mobile=Mobile;
	}
	 public static void main(String args[]){
		 Employee e=new Employee();
		 e.setName("Ravi");
		 e.setAddress("Pune");
		 e.setMobile("9998887771");
		 System.out.println("Employee Details\nName:"+e.getName()+"\nAddress:"+e.getAddress()+"\nMobile Number:"+e.getMobile());
	 }
}
