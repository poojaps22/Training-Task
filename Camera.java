package pt1;

public class Camera extends ElectronicDevice{

	String modelName;
	String color;
	public Camera()
	{
		super();
	}
	public Camera(int units,int time) {
		super(units, time);
		power=time*units;
		
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
}
