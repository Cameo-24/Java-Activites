import java.util.*;
public class TwoWheeler extends Vehicle  {
	private boolean kickStartAvailable;

	
	public boolean isKickStartAvailable() {
		return kickStartAvailable;
	}

	public void setKickStartAvailable(boolean kickStartAvailable) {
		this.kickStartAvailable = kickStartAvailable;
	}
	public TwoWheeler(String make, String vehicleNumber, String fueltype, int fuelCapacity, int cc,
			boolean kickStartAvailable) {
		super(make, vehicleNumber, fueltype, fuelCapacity, cc);
		this.kickStartAvailable = kickStartAvailable;
	}

	public void displayDetailInfo1(){
		System.out.println("Kick Start Available(Yes/no):\n"+kickStartAvailable);
	}
	
	

}
