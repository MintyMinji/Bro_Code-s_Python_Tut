import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        // circumference = 2 * Math.PI * radius;
        // area = Math.PI * Math.pow(radius, 2);
        // volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3)

        Scanner sc = new Scanner(System.in);

        double radius;
        double circumference;
        double area;
        double volume;

        System.out.print("Enter the radius: ");
        radius = sc.nextDouble();
        
        circumference = 2 * Math.PI * radius;
        area = Math.PI * Math.pow(radius, 2);
        volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

        System.out.println("the circumference is: " + circumference + " Cm"); //printf Statements... replace println as printf() - next part 
        System.out.println("The area of the circle is: " + area + " Cms²"); // to put something to the power of two do: ensure numlock is on and alt + 0178 (superscript)
        System.out.println("The volume of the circle is: " + volume + " Cm³"); // same thing for superscript just 0179

        sc.close(); 
    }
}
