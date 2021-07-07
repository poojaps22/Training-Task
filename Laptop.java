package pt1;

public class Laptop extends ElectronicDevice {

	public Laptop()
	{
		super();
	}
	public Laptop(int units,int time) {
		super(units, time);
		power=time*units;
		//System.out.println("Power consumed by Laptop = "+power);
	}
	
}
