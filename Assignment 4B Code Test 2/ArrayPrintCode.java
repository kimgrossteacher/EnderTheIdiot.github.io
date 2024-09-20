// Simple array of Even/Odd numbers
// Made by Henry Smith
// Started : Date 9/18/2024
// Finished : Date 9/20/2024

// Base Class
public class ArrayPrintCode {
    public static void main(String[] args) {


// This line is used to set the base of the variable that will determine the total of all the numbers combined.
int t = 0; 

    // This section creates an array of the interger type called "Numbers", and line 16 fills the array with numbers 1 through 100.
    int Numbers [] = new int[100];
    for (int v = 0; v < Numbers.length; v++) {
         Numbers[v] = v + 1;
    }

    // This line determines that the variable "value" will always be equal to the array "Numbers".
    for (int value : Numbers) {

// This line adds all of the numbers in the variable "value" and adds them to the variable "t", which will be used to determine the total.
t += value;

// This section determines wether or not the current number is odd or even.
    if (value%2!=0) {    
     System.out.println(value+" is Odd"); 
    } else { System.out.println(value+" is Even"); 
    
// This line is used to find the length of the array "Numbers".   
if (value >= 100)
System.out.println("The size of the array Numbers[] is " + Numbers.length);

// This line prints out the total of all the numbers printed and combines them.
if (value >= 100)
System.out.println("Total = " + t);
                }
            }
        }   
    }

// Note: Yes, this whole code took me 2 days to figure out, mainly due to forgetting to add a "}" after line 17 :/








