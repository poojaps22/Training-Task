package pt1;

public class MobilePhone extends ElectronicDevice{

	public MobilePhone()
	{
		super();
	}
	public MobilePhone(int units,int time) {
		super(units, time);
		power=time*units;
		
	}
}