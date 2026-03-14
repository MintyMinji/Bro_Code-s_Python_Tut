import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        //Compound interest calculator

        Double principle;
        Double rate;
        int timesCompounded;
        int years;
        Double amount;

        System.out.println("Enter the principle amount: ");
        principle = sc.nextDouble();
        
        System.out.println("Please enter the interest rate: (in %): ");
        rate = sc.nextDouble() / 100;

        System.out.println("Please enter the # of times compounded per year: ");
        timesCompounded = sc.nextInt();

        System.out.println("Please the # of years: ");
        years = sc.nextInt();

        amount = principle * Math.pow((1 + (rate / timesCompounded)), timesCompounded * years);

        System.out.println("the amount after " + years + " years is " + amount);
        System.out.printf("The amount after %d years is %.2f", years, amount);
        sc.close();
    }
}
