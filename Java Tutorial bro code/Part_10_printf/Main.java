public class Main {
    public static void main (String[] args){
        
        //printf = method used to format output

        // %[flags][width][.precision][specifier-character]

        String name = "Spongebob";
        char firstChar = 'S'; // use '' for characters and "" for strings
        int age = 30;
        double height = 60.5 ;
        boolean isEmployed = true; 
        
        System.out.printf("Hello %s\n", name); //% is a placeholder
        System.out.printf("Your name starts with a %c\n", firstChar);
        System.out.printf("Your age is %d years old\n", age); //i have no idea why the fuck d is for int
        System.out.printf("You are %f inches tall \n", height); //f is for floating point so idk
        System.out.printf("Employed: %b\n", isEmployed);

        System.out.printf("%s is %d years old", name, age); 

    }
}
