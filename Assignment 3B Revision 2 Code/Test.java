// Simple 1 through 100 Counting System + Even/Odd System + Addition System
// Made by Henry Smith
// Date 9/18/2024

// Base Class
public class Test {

    public static void main(String[] args){
    
    // Counting System + Addition System
    int t = 0;
       for (int x = 0; x <= 100; x++) {
        t += x;

    // Even/Odd System
            if (x%2!=0){
                System.out.println(x+" is Odd"); 
             } else { System.out.println(x+" is Even");
           
             if (x >= 100)
            System.out.println("Total = " + t); 
                
            }
        }
    }
}

