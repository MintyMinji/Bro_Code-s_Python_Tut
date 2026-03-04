import java.util.Scanner;

public class Main{
    public static void main (String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: "); 
        String name = scanner.nextLine(); //nextLine reads the entire text, if we remove "Line" from nextLine it only grabs the first word and not whats after

        System.out.println("Please enter your age: ");
        int age = scanner.nextInt();

        System.out.println("Please enter your GPA: ");
        double gpa = scanner.nextDouble();

        System.out.println("Are you a student? (True/False?) ");
        boolean isStudent = scanner.nextBoolean();

        System.out.println("Your name is: " + name + "!");
        System.out.println("You are " + age + " Years old.");
        System.out.println("Your GPA is: " + gpa);
        System.out.println("Student: " + isStudent);

        scanner.close();  // always have to close or it might read a file and do unexpected results
    }    
}
