package Quiz_1;

interface A{
	void a();
	void b();
	void c();
	void d();
}
abstract class B implements A{
	public void  c() {
		System.out.println("I am C");
	}
}
class M extends B{

	@Override
	public void a() {
		// TODO Auto-generated method stub
		System.out.println("I am A");
	}

	@Override
	public void b() {
		// TODO Auto-generated method stub
		System.out.println("I am B");
	}

	@Override
	public void d() {
		// TODO Auto-generated method stub
		System.out.println("I am D");
	}
	
}
public class Q11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A a=new M();
		a.a();
		a.b();
		a.c();
		a.d();
	}

}

//output:
//I am A
//I am B
//I am C
//I am D
