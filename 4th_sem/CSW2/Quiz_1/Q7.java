package Quiz_1;

class Vehicle{
	void run() {
		System.out.println("Vehicle is running");
	}
}
class Bike extends Vehicle{
	void run() {
		System.out.println("Bike is running safely");
	}
}
public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bike b =new Bike();
		b.run();
	}

}

//output: Bike is running safely