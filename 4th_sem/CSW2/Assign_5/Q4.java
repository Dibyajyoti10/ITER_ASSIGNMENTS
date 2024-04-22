// 4. Implement a Java program that reads a file path from the command line argument and 
// attempts to read the contents of the file. If the file path is null or points to a non-existent 
// file, throw a custom FileNotFoundException. If the file exists but cannot be read due 
// to permission issues, throw a custom FileReadPermissionException. Your task is to 
// create these custom exception classes and handle them appropriately in your program.


class FileNotFoundException extends Exception{
    FileNotFoundException(String s){
        System.out.println(s);
    }
}
class FileReadPermissionException extends Exception{
    FileReadPermissionException (String s){
        System.out.println(s);
    }
}
public class Q4 {
    public static void main(String[] args) {
        if(args.length==0){
            System.err.println("Usage: java FileContentReader");
            return;
        }
        String fileData=args[0];
        try{
            if(fileData==null){
                throw new FileNotFoundException("File is not found");

            }
        }
        catch(FileNotFoundException e){
            System.out.println(e);
        }
        try{
            if(fileData==" "){
                throw new FileNotFoundException("Permission denied");
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}


//output:Usage: java FileContentReader
