// 6. Write a program to create a TreeSet of Integer type and perform the
// below 
// operation on it.
// (a.) Display the TreeSet
// (b.) Ask the user to enter a number and search that number is it present in 
// the 
// list or not.
// (c.) Remove an element from tree.


import java.util.*;
public class Q6 {
    public static void main(String[] args) {
        TreeSet<Integer> ts=new TreeSet<>();
        Scanner obj=new Scanner(System.in);
         
        //adding elements to the tree set
        ts.add(10);
        ts.add(20);
        ts.add(30);
        ts.add(40);
        ts.add(50);
        ts.add(60);

        //a. Display the TreeSet
        System.out.println("The elements of the treeSet are: "+ts);

        //b. Ask the user to enter a number and search that number is it present in the list or not.
        System.out.println("Enter an element:");
        int a= obj.nextInt();
        if(ts.contains(a)){
            System.out.println("The element "+a+" is found");
        }
        else{
            System.out.println("Element "+a+" not found");
        }

        //c.Remove an element from tree.
        System.out.println("Enter an element to remove:");
        int b=obj.nextInt();
        if(ts.contains(b)){
            ts.remove(b);
                System.out.println("Element "+b+" is removed");
            
        }
        else{
            System.out.println("Element "+b+" not removed");
        }

        //updated treeSet
        System.out.println("Updated elements are: "+ts);
    }
}


// output:
// The elements of the treeSet are: [10, 20, 30, 40, 50, 60]
// Enter an element:
// 40
// The element 40 is found
// Enter an element to remove:
// 30
// Element 30 is removed
// Updated elements are: [10, 20, 40, 50, 60]