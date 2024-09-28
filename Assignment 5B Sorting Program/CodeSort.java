// Simple Bubble Sorting Program
// By Henry Smith
// Started : 9/22/2024
// Finished : 9/27/2024


public class CodeSort {

// Creates an empty array of the interger type
public static void ProgramBubbleSort(int[] arrayToSort) {
// Used to make variable "length" equal to the length of the array (for convience)
int length = arrayToSort.length;
// The loops that determine when the next number in the array is larger then the current number, and when it is it swaps the two numbers
    for (int i = 0; i < length - 1; i ++) {
    for (int ToSwap = 0; ToSwap < length - i - 1; ToSwap++) {
        if (arrayToSort[ToSwap] > arrayToSort[ToSwap + 1]) {
            int temp = arrayToSort[ToSwap];
            arrayToSort[ToSwap] = arrayToSort[ToSwap + 1];
            arrayToSort[ToSwap + 1] = temp;
                }
            }
        }
    }

//Prints the array "arrayToSort" on a single line
public static void printArray(int[] array) {
        for (int n : array) {
            System.out.print(n + " ");
        }
        System.out.println();
    }


public static void main(String[] args) {
    // Adds the number inside the "{}" to the array called ArrayToSort
    int[] arrayToSort={1,3,2,4,7,5,8,6,10,9};   

    //Extra: Makes the output look a little cleaner
    System.out.println("Bubble Sort Program Output"); 
    System.out.println("-------------------------------------"); 
        //Prints out the unsorted array
        System.out.println("The Unsorted array:");
        printArray(arrayToSort);
            //Runs the Bubble Sort program on the array "arrayToSort"
            ProgramBubbleSort(arrayToSort);
                //Prints out the newly sorted array
                System.out.println("The Sorted array:");
                printArray(arrayToSort);
                System.out.println("-------------------------------------"); 
    }
}

// Note: I acknowledge that lines 39, 40, and 49 are unnecessary, and I only added them to make the output look a little cleaner
// Extra Note: If it looks slightly weird for the "}" to be stacked at the bottem, I only do that just so I can keep track of where they are.
// EXTRA Extra Note: Yes... this code took me a week to figure out... :(