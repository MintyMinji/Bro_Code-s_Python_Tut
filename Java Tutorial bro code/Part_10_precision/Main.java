

public class Main {
    public static void main(String[] args) {
         // [.precision]

        //double price1 = 9.99;
        //double price2 = 100.15;
        //double price3 = -54.01;

        //System.out.printf("%.1f\n", price1);
        //System.out.printf("%.2f\n", price2);
        //System.out.printf("%.3f\n", price3);

        // [flags]

        // + = output pos

        // , = comma grouping seperator (good to display prices)

        // ( = negative numbers enclosed by ()

        // space = display minus if neg, space if pos - useful for aligning numbers

        // [width]

        // 0 = zero padding
        // number = right justfied padding
        // negative number = left justified padding 

        int id1 = 1;
        int id2 = 23;
        int id3 = 456;
        int id4 = 7890;

        System.out.printf("%04d\n",id1);
        System.out.printf("%4d\n",id2);
        System.out.printf("%-4d\n",id3);
        System.out.printf("%d\n",id4);

    }
}