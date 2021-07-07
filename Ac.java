package pt1;

public class Ac extends ElectronicDevice{

	public Ac()
	{
		super();
	}
	public Ac(int units,int time) {
		super(units, time);
		power=time*units;
		
	}
}