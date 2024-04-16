package Quiz_1;

class Animal2{
	void eat() {
		System.out.println("eating ....");
	}
}
class Doggy extends Animal2{
	void eat() {
		System.out.println("eating bread...");
	}

void bark() {
	System.out.println("barking...");
}
void work() {
	super.eat();
	bark();
}
}

public class Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Doggy d =new Doggy();
		d.work();
	}

}

//output:
//eating...
//barking...