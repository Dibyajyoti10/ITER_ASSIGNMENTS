package Quiz_1;

interface calculate{
	void cal(int item);
}
class display implements calculate{
	int x;

	@Override
	public void cal(int item) {
		// TODO Auto-generated method stub
		x=item*item;
	}
}
public class Q12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		display arr=new display();
		arr.x=0;
		arr.cal(2);
		System.out.print(arr.x);
	}

}

//output:
//4