package pt1;

public class Computer extends ElectronicDevice{
	
	public Computer()
	{
		super();
	}
	public Computer(int units,int time) {
		super(units, time);
		power=time*units;
		//System.out.println("Power consumed by Computer = "+power);
	}
	/*public void calPower()
	{
		power=time*units;
		System.out.println("Power consumed by Computer = "+power);
	}*/
}
