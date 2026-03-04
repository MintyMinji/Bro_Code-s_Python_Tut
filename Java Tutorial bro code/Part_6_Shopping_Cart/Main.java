import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        
        //shopping cart program
        Scanner sc = new Scanner(System.in);

        String item = "pizza";
        double price;
        int quantity; 
        char currency = '$';
        double total;

        System.out.println("What item would you like to buy? ");
        item = sc.nextLine();
        System.out.println("How much would this cost? ");
        price = sc.nextDouble();
        System.out.println("How many would you like? ");
        quantity = sc.nextInt();

        total = price * quantity;
        
        System.out.println("\nYou have bought " + quantity + " " + item + "/s");
        System.out.println("Your total is " + currency + total);

        sc.close();
    }
}
