import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        int age;
        String name;
        boolean isStudent;

        System.out.println("What's your name?");
        name = sc.nextLine();

        System.out.println("How old are you?");
        age = sc.nextInt();

        System.out.println("Are you a student? (true/false)");
        isStudent = sc.nextBoolean();

        //group 1 
        if(name.isEmpty()){
            System.out.println("You didn't enter your name. 😒" ); // use windows + ; to open bar for emojis
        }
        else
            System.out.println("Hello " + name);

        //group 2
        if(age >= 65){
            System.out.println("You're a Senior!");
        }
        else if (age >= 18){
            System.out.println("You're an Adult!");
        }
        else if (age < 0){
            System.out.println("You haven't been born yet!");
        }
        else if (age == 0){
            System.out.println("You're a baby!");
        }
        else{
            System.out.println("You are a child!");

        //group 3
        if(isStudent){
            System.out.println("You are a student! ");
        }
        else{
            System.out.println("You are not a student.");
        }
        sc.close();
        }
    }
}
