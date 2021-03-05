import java.util.*;
public class FourWheeler extends Vehicle {
	private String audioSystem;
	private int noOfDoors;
	public String getAudioSystem() {
		return audioSystem;
	}
	public void setAudioSystem(String audioSystem) {
		this.audioSystem = audioSystem;
	}
	public int getNoOfDoors() {
		return noOfDoors;
	}
	public void setNoOfDoors(int noOfDoors) {
		this.noOfDoors = noOfDoors;
	}
	public FourWheeler(String make, String vehicleNumber, String fueltype, int fuelCapacity, int cc, String audioSystem,
			int noOfDoors) {
		super(make, vehicleNumber, fueltype, fuelCapacity, cc);
		this.audioSystem = audioSystem;
		this.noOfDoors = noOfDoors;
	}
	public void displayDetailInfo(){
		System.out.println("Audio System:"+audioSystem+"\nNumber of Doors:"+noOfDoors);
	}

}
