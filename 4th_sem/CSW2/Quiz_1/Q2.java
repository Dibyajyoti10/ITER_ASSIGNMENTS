package Quiz_1;

class OverloadingCalculation{
	void sum(int a , long b) {
		System.out.println("a method invoked");
	}
	void sum(long a,int b) {
		System.out.println("b method invoked");
	}
}
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OverloadingCalculation oc= new OverloadingCalculation();
		oc.sum(20, 20);   //<-- Error occurred here
	}

}

//output:
//error:The method sum(int, long) is ambiguous for the type OverloadingCalculation
