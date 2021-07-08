package pt1;

public class Tv extends ElectronicDevice{

	private Bluetooth b;
	int modelno;
	String color;
	public Bluetooth getB() {
		return b;
	}
	public void setB(Bluetooth b) {
		this.b = b;
	}
	public Tv()
	{
		super();
	}
	public Tv(int units,int time) {
		super(units, time);
		power=time*units;
		
	}
	public int getModelno() {
		return modelno;
	}
	public void setModelno(int modelno) {
		this.modelno = modelno;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
}