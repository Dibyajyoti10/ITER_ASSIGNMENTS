package Quiz_1;

abstract class bike3{
	void Bike(){
		System.out.println("Bike is created");
	}
	abstract void run();
	void changeGear() {
		System.out.println("Gear changed");
	}
}
class Honda extends bike3{

	@Override
	void run() {
		// TODO Auto-generated method stub
		System.out.println("Running safely...");
	}
	
}
public class Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		bike3 b=new Honda();
		b.run();
		b.changeGear();
}
}

//output:
//Running safely...
//Gear changed