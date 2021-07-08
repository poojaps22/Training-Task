package pt1;

public class MobilePhone extends ElectronicDevice{

	private Camera cam;
	public MobilePhone()
	{
		super();
	}
	public MobilePhone(int units,int time) {
		super(units, time);
		power=time*units;
		
	}
	public Camera getCam() {
		return cam;
	}
	public void setCam(Camera cam) {
		this.cam = cam;
	}
	
}