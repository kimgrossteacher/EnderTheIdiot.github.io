// Custom Sword Object Creator
// Made By: Henry Smith
// Started: 10/10/2024
// Finished: 10/10/2024

// Creates a program starting point that will later be used to create a sword object with the class that was just created
public class Main {
    public static void main(String[] args) {

        // Creates a new sword called "Sword1" using the CustomSwordObject converter
            CustomSwordObject Sword1 = new CustomSwordObject("Yes", 1, "No");
        
            //Prints out the start of the program output to look a little cleaner (Not Actually Necessary)
            System.out.println("3 CUSTOM SWORDS AND THEIR ATTRIBUTES");
            System.out.println("-----------------------------------------------");

            // Prints out the attributes of Sword 1
            System.out.println("Sword 1 Attributes:");
            System.out.println("Is Curved = " + Sword1.CurvedBlade);
            System.out.println("Edges = " + Sword1.NumberOfEdges);
            System.out.println("Is Serrated = " + Sword1.Serrated);
            System.out.println("-----------------------------------------------");

        // Creates a new sword called "Sword2" using the CustomSwordObject converter
            CustomSwordObject Sword2 = new CustomSwordObject("Yes", 2, "Yes");

            // Prints out the attributes of Sword 2
            System.out.println("Sword 2 Attributes:");
            System.out.println("Is Curved = " + Sword2.CurvedBlade);
            System.out.println("Edges = " + Sword2.NumberOfEdges);
            System.out.println("Is Serrated = " + Sword2.Serrated);       
            System.out.println("-----------------------------------------------");           
            
        // Creates a new sword called "Sword3" using the CustomSwordObject converter, but is modifiable with the behavior
            CustomSwordObject Sword3 = new CustomSwordObject("Yes", 1, "No");            

            // Prints out the attributes of Sword 3
            System.out.println("Sword 3 Attributes:");
            System.out.println("Is Curved = " + Sword3.getCurved());
            System.out.println("Edges = " + Sword3.getEdges());
            System.out.println("Is Serrated = " + Sword3.getSerrated());
            System.out.println("-----------------------------------------------");

                // Uses the behavior method to change Sword 3's attributes
                Sword3.setCurved("No");
                Sword3.setEdges(2);
                Sword3.setSerrated("Yes");


            // Prints out the attributes of Sword 3
            System.out.println("Sword 3 Ver 2.0 (Modified) Attributes:");
            System.out.println("Is Curved = " + Sword3.getCurved());
            System.out.println("Edges = " + Sword3.getEdges());
            System.out.println("Is Serrated = " + Sword3.getSerrated());
            System.out.println("-----------------------------------------------");
    
    }
}

/* Note: I know the lines 64,65,72,82,etc aren't necessary, I only added them for a cleaner output.

- Henry Smith :)                                                                                                  */