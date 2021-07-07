package pt1;

public class Bluetooth extends ElectronicDevice{

	public Bluetooth()
	{
		super();
	}
	public Bluetooth(int units,int time) {
		super(units, time);
		power=time*units;
		
	}
}