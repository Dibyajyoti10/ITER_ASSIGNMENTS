package Quiz_1;

public class Q4 {
    public static void main(String[]args) {
        System.out.println("main with string[]");
    }
    public static void main(String args) {
        System.out.println("main with string");
    }
    public static void main() {
        System.out.println("main without strings");
    }
    }

//output: main with string[]
// But if we will comment out the first psvm method above then in output it will show error
// and show to give psvm(String[]args) as main method
