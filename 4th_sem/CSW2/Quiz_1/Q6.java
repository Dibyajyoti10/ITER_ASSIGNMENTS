package Quiz_1;

class Bank{
	int getRateOfInterest() {
		return 0;
	}
}
class SBI extends Bank{
	int getRateOfInteresrt() {
		return 8;
	}
}
class ICICI extends Bank{
	int getRateOfInterest() {
		return 7;
	}
}
class AXIS extends Bank{
	int getRateOfInterest() {
		return 9;
	}
}
public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SBI s =new SBI();
		ICICI i=new ICICI();
		AXIS a=new AXIS();
		System.out.println("SBI Rate of Interest: "+s.getRateOfInteresrt());
		System.out.println("ICICI Rate of Interest: "+i.getRateOfInterest());
		System.out.println("AXIS Rate of Interest: "+a.getRateOfInterest());
	}

}

//output:
//SBI Rate of Interest: 8
//ICICI Rate of Interest: 7
//AXIS Rate of Interest: 9