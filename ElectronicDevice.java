package pt1;

public class ElectronicDevice {

	int power;
	int units;
	int time;
	public ElectronicDevice() {
		super();
	}
	
	public ElectronicDevice(int units, int time) {
		super();
		this.units = units;
		this.time = time;
	}
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
	public int getUnits() {
		return units;
	}
	public void setUnits(int units) {
		this.units = units;
	}
	/*public void calculatePower()
	{
		power+=(power*units);
		System.out.println("Electronic Device : "+);
	}*/
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	
	
}
