package pt1;

public class Camera extends ElectronicDevice{

	public Camera()
	{
		super();
	}
	public Camera(int units,int time) {
		super(units, time);
		power=time*units;
		
	}
}
