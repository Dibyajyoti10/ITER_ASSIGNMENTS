package Quiz_1;

class OverloadingCalculation2{
	void sum(int a , long b) {
		System.out.println(a+b);
	}
	void sum (int a, int b, int c) {
		System.out.println(a+b+c);
	}
}
public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OverloadingCalculation2 ob=new OverloadingCalculation2();
		ob.sum(20, 20);
		ob.sum(20, 20, 20);
	}

}