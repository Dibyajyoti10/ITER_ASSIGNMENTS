// 3. Implement a custom NullPointerException class named
// CustomNullPointerException that mimics the behavior of the standard
// NullPointerException, but instead of using default error messages or null references, 
// it takes a String message as its constructor argument. Your task is to create this custom 
// exception class and demonstrate its usage in a Java program.


class CustomNullPointerException extends Exception{
    CustomNullPointerException(String msg){
        super(msg);
    }
}
public class Q3 {
    public static void main(String[] args) {
        String str=null;
        try{
            if(str==null){
                throw new CustomNullPointerException("Exception occur here");

            }
            else{
                System.out.println("the value is: "+str);
            }
        }
        catch(CustomNullPointerException e){
            System.out.println(e);
        }
    }
}

//output: CustomNullPointerException: Exception occur here
