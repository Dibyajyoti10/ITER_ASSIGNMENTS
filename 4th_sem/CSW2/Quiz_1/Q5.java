package Quiz_1;

class Adder{
	static int add(int a, int b) {
		return a+b;
	}
	static double add(int a, int b) {   // <--- Error occur here
		return a+b;
	}
}
public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Adder.add(11, 11));
	}

}

//output: duplicate values -  Two add are there 
//To fix - int add ; double add1 or any other name
