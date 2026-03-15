import java.util.Scanner;


public class Main {
    public static void main(String[] args){

        //.substring() = method used to extract portion of string
        // to use -> .substring(start, end);

        //String username = email.substring(0, 5);    

        //String domain = email.substring(6, 15); // domain doesnt include @
        //String domain = email.substring(6); // can also do this to get every character after
        Scanner sc = new Scanner(System.in);
        String email;
        String username;
        String domain;

        System.out.println("Enter your email: ");
        email = sc.nextLine();

        if(email.contains("@")){ 
            username = email.substring(0, email.indexOf("@"));   
            domain = email.substring(email.indexOf("@") + 1); // what +1 does is remove the @

            System.out.printf("Your username is: %s\n", username);
            System.out.printf("Your domain name is: %s", domain);

            sc.close();
        } 
        else{
            System.out.println("Your username must contain a @");
        }
    }
}

