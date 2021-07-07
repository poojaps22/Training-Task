package pt1;

public class WashingMachine extends ElectronicDevice{

	public WashingMachine()
	{
		super();
	}
	public WashingMachine(int units,int time) {
		super(units, time);
		power=time*units;
		
	}
}