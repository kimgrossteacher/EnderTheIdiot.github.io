// Math Exception Program
// By: Henry Smith
// Started: 11/10/2024
// Finshed: 11/10/2024


public class MathExceptionProgram {
    public static void main(String[] args) {

        // Prints out a bunch of math problems
        try {
            System.out.println("18 divided by 9 = "+ 18/9);
            System.out.println("12 divided by 4 = "+ 12/4);
            System.out.println("4 multiplied by 5 = "+ 4*5);
            System.out.println("10 divided by 0 = "+ 10/0);
            System.out.println("2 multiplied by 5 = "+ 2*5);
            System.out.println("15 divided by 5 = "+ 15/5);

            // Catches any errors in the code and prints out a response if it does   
            } catch (ArithmeticException e) {
                System.out.println("An error occured '[ " + e.getMessage() + " ]' and exception has been made");

            }
            finally {             
                System.out.println("2 multiplied by 5 = "+ 2*5);
                System.out.println("15 divided by 5 = "+ 15/5);
            }    

    }
}
