package Quiz_1;

class Animal{
	String color="white";
}
class Dog extends Animal{
	String color="Black";

void printColor() {
	System.out.println(color);
	System.out.println(super.color);
}
}
public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog d=new Dog();
		d.printColor();
	}

}
 
//output:
//Black
//White