package pt1;

public class Tv extends ElectronicDevice{

	public Tv()
	{
		super();
	}
	public Tv(int units,int time) {
		super(units, time);
		power=time*units;
		
	}
}