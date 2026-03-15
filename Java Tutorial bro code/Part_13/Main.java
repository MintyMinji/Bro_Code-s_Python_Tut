public class Main {
    public static void main (String[] args){
        String name = "Password";
        //int length = name.length(); //get the length of a variable
        //char letter = name.charAt(0); //get the char of a specific string
        //int index = name.indexOf(" "); // get the int of a specific index
        //int lastIndex = name.lastIndexOf("n"); //get the int of the last index of a specific letter

        //System.out.println(length);
        //System.out.println(letter);
        //System.out.println(index);
        //System.out.println(lastIndex); 

        //name = name.toUpperCase(); // everything becomes upper case
        //name = name.toLowerCase(); // everything becomes lower case
        //name = name.trim(); // removes spaces on the outside and inside of the stirng
        //name = name.replace("M", "A"); //replaces any letters with another

        /*
        if(name.isEmpty()){
            System.out.println("Your name is empty");
        }
        else{
            System.out.println("Hello " + name);
        }
        */
    
        /* 
        if(name.contains(" ")){
            System.out.println("Your name contains a space ");
        }
        else{
            System.out.println("Your name DOESN'T contain any spaces");
        }
        */

        // if(name.equals("password")){
        if(name.equalsIgnoreCase("password")){
            System.out.println("Your name can't be password ");
        }
        else{
            System.out.println("Hello " + name);
        }
    }
}
