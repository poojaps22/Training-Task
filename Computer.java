package pt1;

public class Computer extends ElectronicDevice{
	
	int cid;
	public Computer()
	{
		super();
	}
	public Computer(int units,int time) {
		super(units, time);
		power=time*units;
		//System.out.println("Power consumed by Computer = "+power);
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	
	/*public void calPower()
	{
		power=time*units;
		System.out.println("Power consumed by Computer = "+power);
	}*/
}
