

public class Main
{
    public static void main (String[] args) {
    
        // ❎ variable = a reusable container for a value 
        //               a variable behaves as if it was the value it contains 

        // 🟥 Primitive = simple value stored directly in memory  (stack)
        // 🟦 Reference = memory address (stack) that points to the (heap)

        // 🟥 Primitive vs 🟦 Reference
        //    ----------      ----------
        //    int             string
        //    double          array
        //    char            object
        //    boolean

        // 2 Steps to creating a variable
        // ------------------------------
        // 1. declaration
        // 2. assignment 

        int age = 21; 
        int year = 2025;
        int quantity = 1;
        
        double price = 19.99;
        double gpa = 5.0;
        double temperature = -32.9;

        char grade = 'A';
        char symbol = '!';
        char currency = '$';

        boolean isStudent = true;
        boolean forSale = false;
        boolean Online = true;

        String name = "Bro Code";
        String food = "pizza";
        String email = "fake123@gmail.com";
        String car = "lambo"; 
        String colour = "red";


        System.out.println("Hello " + name); 
        System.out.println("Your favourite food is " + food);
        System.out.println("your email is " + email);

        System.out.println(isStudent);

        if(isStudent){
            System.out.println("You are a student!");
        }
        else{
            System.out.println("You are not a student.");
        }
  
    }
}