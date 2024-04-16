package Quiz_1;



class OverloadingCalculation{
	void sum(int a , int b) {
		System.out.println("int arg method invoked");
	}
	void sum(long a,long b) {
		System.out.println("long arg method invoked");
	}
}
public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OverloadingCalculation oc= new OverloadingCalculation();
		oc.sum(20, 20);
	}

}
