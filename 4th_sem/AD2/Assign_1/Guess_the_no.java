package 4th_sem.AD2.Assign_1;


import java.util.Random;
import java.util.Scanner;

class Game2{
	int number;
	int nog;
	int ipNo;
	
	public int getnog() {
		return nog;
	}
	public void setnog(int n) {
		this.number=n;
	}
	Game2(){
		Random r =new Random();
		this.number=r.nextInt(50);
		
	}
	public void takeUserInput() {
		
		Scanner obj=new Scanner(System.in);
		
		 ipNo =obj.nextInt();//ipNo - input number
		
	}
	public boolean isCorrectNo(int num) {
		if(num == number) {
			System.out.println("Hurray !! You got the correct number");
		}
		else if(num>50) {
			System.out.println("Invalid number choosen");
		}
		else if(num<number) {
			System.out.println("choosen a less number, try for a "
					+ " big number !:) ");
		}
		else if(num>number) {
			System.out.println("choosen a bigger number,"
					+ " try for a small number !:( ");
		}
		return false;
		
	}
}
public class Guess_the_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Choose a number between 1 to 50");
		Game2 g=new Game2();
		boolean b=false;
		while(!b) {
		g.takeUserInput();
		 b=g.isCorrectNo(5);
		System.out.println(b);
		}
	}

}

