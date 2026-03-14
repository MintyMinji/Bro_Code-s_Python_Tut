// calculate Hypotenuse, c = Math.sqrt(a^2 + b^2)
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double valueA;
        double valueB;
        double c;
    
        System.out.println("Please input value of a: ");
        valueA = sc.nextDouble();

        System.out.println("Please input value of b: "); 
        valueB = sc.nextDouble();

        System.out.println(valueA);
        System.out.println(valueB);

        c = Math.sqrt(Math.pow(valueA, 2) + Math.pow(valueB, 2));

        System.out.println("The hypotenuse (side c) is: " + c);

        sc.close();
    }
}