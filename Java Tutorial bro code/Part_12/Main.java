
public class Main {
    public static void main (String[] args){
        
        boolean isStudent = false;
        boolean isSenior = true;
        double price = 9.99;

        if (isStudent){
            if (isSenior){
                System.out.println("You get a Senior discount of 20%");
                System.out.println("You get a Stident discount of 10%");
                price *= 0.7;
            }
            else{
                System.out.println("You get a Stident discount of 10%");
                price *= 0.9;
            }
        }
        else{
            if (isSenior){
                System.out.println("You get a Senior discount of 20%");
                price *= 0.8;
            }
            else {
                price *= 1;
            }
        }
        System.out.printf("price of the ticket is now: $%.2f", price);
        
    }
}
