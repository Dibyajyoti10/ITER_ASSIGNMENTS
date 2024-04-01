package 4th_sem.AD2.Assign_1;

// write a java program to calculate the percentage

import java.util.Scanner;
public class Marks{
	public static void main(String []args) {
		
		Scanner obj=new Scanner(System.in);
		System.out.println("English:");
		int e = obj.nextInt();
		System.out.println("Hindi:");
		int h = obj.nextInt();
		System.out.println("Maths:");
		int m = obj.nextInt();
		System.out.println("Science:");
		int s = obj.nextInt();
		System.out.println("Computer:");
		int c = obj.nextInt();
		int sum=e+h+m+s+c;
		System.out.println("The sum of the marks is:"+ sum);
		System.out.println("Final:"+ sum/5+"%");
		System.out.println();
	
		if(sum>450) {
			System.out.println("Outstanding");
			
		}
		else if (sum>350 &&sum<=450) {
			System.out.println("Excellent");
		}
		else if(sum>250 && sum<=350) {
			System.out.println("Good !! try to improve more");
			
		}
		else {
			System.out.println("Need to WORK More HARD !!!!!!!");
		}
	}
}