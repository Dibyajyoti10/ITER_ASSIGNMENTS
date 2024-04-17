package Quiz_1;

interface calculate2{
	int VAR=0;
	void cal(int item);
	
}
class display2 implements calculate2{
	int x;

	@Override
	public void cal(int item) {
		// TODO Auto-generated method stub
		if(item<2)
			x=VAR;
		else
			x=item*item;
	}
}
public class Q13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		display2[] arr=new display2[3];
		for(int i=0;i<3;i++)
			arr[i]=new display2();
		    arr[0].cal(0);
		    arr[1].cal(1);
		    arr[2].cal(2);
		    System.out.print(arr[0].x+" "+arr[1].x+" "+arr[2].x);
	}

}

//output: 0 0 4