public class SuiteACRoom extends HotelRoom 
{
	private int ratePerSqFeet;
	public int getRatePerSqFeet() {
		return ratePerSqFeet;
	}
	public void setRatePerSqFeet(int ratePerSqFeet) {
		this.ratePerSqFeet = ratePerSqFeet;
	}
	public int ratePerSqFeet()
	{
		ratePerSqFeet=ratePerSqFeet+2;
		return ratePerSqFeet;
	}
	
	public SuiteACRoom(String hotelName, int numberOfSqFeets, Boolean hasTV, Boolean hasWifi) {
		super(hotelName,numberOfSqFeets, hasTV, hasWifi);
		ratePerSqFeet=10;
		if(hasWifi==true)
		{
			ratePerSqFeet();
		}
		int sum=calculateTariff();
		System.out.println("Room tariff per day is: "+sum);
	}
	public int calculateTariff()
	{
		return numberOfSqFeets*ratePerSqFeet;
	}
}