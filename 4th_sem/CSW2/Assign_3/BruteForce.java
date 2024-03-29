import java.util.Scanner;

public class BruteForce {

	public static int bruteforce(String text, String tobeMatched) {
		int length=text.length();
		int plength=tobeMatched.length();
		
		for(int i=0;i<length-plength;i++) {
			int j=0;
			while((j<plength) && (text.charAt(i+j)==tobeMatched.charAt(j))) {
				j++;
			}
			if(j==plength) {
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BruteForce bf =new BruteForce();
		Scanner obj=new Scanner(System.in);
		String text="I love Programming and i do programming";
		String tobeMatched="progming";
		int position = bf.bruteforce(text, tobeMatched);
		if(position ==1)
			System.out.println("Pattern is not matched in text");
		else {
			System.out.println("Found at position: "+(position+1));
		}
	}

}
