// Exception Program
// By: Henry Smith
// Started: 11/10/2024
// Finshed: 11/10/2024

public class ExceptionProgram {
    public static void main(String[] args) {

        // Creates and array/string of car brands
        String[] CarArray = {"Toyota", "Ford", "Chevrolet"};

        // Prints out a list of car from the string/array "CarArray", and also sets up an exception system for any errors made.
        try {    
            System.out.println(CarArray[0]);
            System.out.println(CarArray[1]);
            System.out.println(CarArray[2]);
            System.out.println(CarArray[3]);
        
            // Catches any errors in the code and prints out a response if it does   
            } catch (Exception e) {
                System.out.println("An error occured '[ " + e.getMessage() + " ]' and exception has been made");
            }     

    }
}