//1. Implement a Java program to handle NullPointerException

public class Q1 {
    public static void main(String[] args) {
        try{
            String str=null;
            int length=str.length();
            System.out.println("Length of the String: "+length);

        }
        catch(NullPointerException e){
            System.out.println("NullPointerException occurred: "+e.getMessage());
        }
    }
}
