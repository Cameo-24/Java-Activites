
public class Vehicle {
	private String make;
	private String vehicleNumber;
	private String fueltype;
	private int fuelCapacity;
	private int cc;
	public Vehicle(String make, String vehicleNumber, String fueltype, int fuelCapacity, int cc) {
		this.make = make;
		this.vehicleNumber = vehicleNumber;
		this.fueltype = fueltype;
		this.fuelCapacity = fuelCapacity;
		this.cc = cc;
	}
	
	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getVehicleNumber() {
		return vehicleNumber;
	}

	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

	public String getFueltype() {
		return fueltype;
	}

	public void setFueltype(String fueltype) {
		this.fueltype = fueltype;
	}

	public int getFuelCapacity() {
		return fuelCapacity;
	}

	public void setFuelCapacity(int fuelCapacity) {
		this.fuelCapacity = fuelCapacity;
	}

	public int getCc() {
		return cc;
	}

	public void setCc(int cc) {
		this.cc = cc;
	}

	public void displayMake(){
		System.out.println("Vehicle Name:"+make);
		
	}
	public void displayBasicInfo(){
		System.out.println("Vehicle Number:"+vehicleNumber+"\nFuelType:"+fueltype+"\nFuelCapacity:"+fuelCapacity+"\ncc:"+cc);
	}
	public void detailInfo(){
		
	}

	
}
