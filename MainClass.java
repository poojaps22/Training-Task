package pt1;

public class MainClass {

	public static void main(String[] args) {
		
		//MainClass ob=new MainClass();
		
		ElectronicDevice ed=new Computer(100,5);
		System.out.println("Power consumed by Computer = "+ed.getPower());
		
		ElectronicDevice ed1=new Laptop(80,8);
		System.out.println("Power consumed by Laptop = "+ed1.getPower());
		
		ElectronicDevice ed2=new Camera(50,3);
		System.out.println("Power consumed by Camera = "+ed2.getPower());
		
		ElectronicDevice ed3=new Tv(200,8);
		System.out.println("Power consumed by Tv = "+ed3.getPower());
		
		ElectronicDevice ed4=new Ac(150,6);
		System.out.println("Power consumed by Ac = "+ed4.getPower());
		
		ElectronicDevice ed5=new WashingMachine(230,3);
		System.out.println("Power consumed by WashingMachine = "+ed5.getPower());
		
		ElectronicDevice ed6=new Bluetooth(100,6);
		System.out.println("Power consumed by Bluetooth = "+ed6.getPower());
		
		ElectronicDevice ed7=new MobilePhone(300,3);
		System.out.println("Power consumed by MobilePhone = "+ed7.getPower());
	}

}
