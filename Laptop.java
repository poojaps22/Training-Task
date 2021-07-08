package pt1;

public class Laptop extends ElectronicDevice {

	private Camera cam;
	
	public Camera getCam() {
		return cam;
	}
	public void setCam(Camera cam) {
		this.cam = cam;
	}
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
