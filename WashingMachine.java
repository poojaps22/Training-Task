package pt1;

public class WashingMachine extends ElectronicDevice{

	private Bluetooth b;
	
	public Bluetooth getB() {
		return b;
	}
	public void setB(Bluetooth b) {
		this.b = b;
	}
	public WashingMachine()
	{
		super();
	}
	public WashingMachine(int units,int time) {
		super(units, time);
		power=time*units;
		
	}
}