//Write a program to create MobleApp to display what is the sim used in the mobile.
//Note: Tell the student to solve this question using the process of Q1.
//• Explain the constructors.
//• Explain types of constructors with suitable examples (parameterized and non-parameterized).

    
package Assign_1;

class MobileApp {
    private String sim;
    public MobileApp(String sim) {
        this.sim = sim;
    }
    public void setSim(String sim) {
        this.sim = sim;
    }
    public String getSim() {
        return sim;
    }
}
public class Q3 {
    public static void main(String[] args) {
        MobileApp mobile1 = new MobileApp("Vodafone");
        System.out.println("SIM used in mobile2: " + mobile1.getSim());
        mobile1.setSim("Airtel");
        System.out.println("SIM used in mobile1 after change: " + mobile1.getSim());
    }
}

//output:
//SIM used in mobile2: Vodafone
//SIM used in mobile1 after change: Airtel
