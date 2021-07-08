package pt1;

public class Ac extends ElectronicDevice{

	private Bluetooth b;
	
	public Bluetooth getB() {
		return b;
	}
	public void setB(Bluetooth b) {
		this.b = b;
	}
	public Ac()
	{
		super();
	}
	public Ac(int units,int time) {
		super(units, time);
		power=time*units;
		
	}
}