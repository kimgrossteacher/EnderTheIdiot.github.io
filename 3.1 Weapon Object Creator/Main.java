// Weapon Object Creator: Main Program
// Made By: Henry Smith
// Started: 10/10/2024
// Finished: 10/10/2024
// Modified: 10/28/2024


// Creates a program starting point that will later be used to create a sword object with the class that was just created
public class Main {
    public static void main(String[] args) {

        // Creates a new sword called "Sword1" using the CustomSwordObject converter
            CustomSwordObject Sword1 = new CustomSwordObject("Yes", 1, "No");
        
            //Prints out the start of the program output to look a little cleaner (Not Actually Necessary)
            System.out.println("CUSTOM WEAPON PROGRAM OUTPUT");
            System.out.println("-----------------------------------------------");

            // Prints out the attributes of Sword 1
            System.out.println("Sword 1 Attributes:");
            System.out.println("Is Curved = " + Sword1.CurvedBlade);
            System.out.println("Edges = " + Sword1.NumberOfEdges);
            System.out.println("Is Serrated = " + Sword1.Serrated);
            System.out.println("-----------------------------------------------");

        // Creates a new sword called "Dagger 1" using the SpearObject subclass converter
            DaggerObject Dagger = new DaggerObject("No", 2, "Yes", 9);

            // Prints out the attributes of Dagger 1
            System.out.println("Dagger 1 Attributes:");
            System.out.println("Is Curved = " + Dagger.CurvedBlade);
            System.out.println("Edges = " + Dagger.NumberOfEdges);
            System.out.println("Is Serrated = " + Dagger.Serrated);
            System.out.println("Blade Length = " + Dagger.BladeLength + " Inches");        
            System.out.println("-----------------------------------------------");           
            
        // Creates a new sword called "Spear 1" using the SpearObject subclass converter, but is modifiable with the behavior
            SpearObject Spear = new SpearObject("No", 2, "No", 6);            

            // Prints out the attributes of Spear
            System.out.println("Spear 1 Attributes:");
            System.out.println("Is Curved = " + Spear.getCurved());
            System.out.println("Edges = " + Spear.getEdges());
            System.out.println("Is Serrated = " + Spear.getSerrated());
            System.out.println("Handle Length = " + Spear.getHandle() + " Feet");
            System.out.println("-----------------------------------------------");

                // Uses the behavior method to change Spear 1's attributes
                Spear.setCurved("No");
                Spear.setEdges(2);
                Spear.setSerrated("Yes");
                Spear.setHandle(7);

            // Prints out the attributes of Spear Version 2.0
            System.out.println("Spear 1 Version 2.0 (Modified) Attributes:");
            System.out.println("Is Curved = " + Spear.getCurved());
            System.out.println("Edges = " + Spear.getEdges());
            System.out.println("Is Serrated = " + Spear.getSerrated());
            System.out.println("Handle Length = " + Spear.getHandle() + " Feet");
            System.out.println("-----------------------------------------------");
    
    }
}

/* Note: I know the lines 64,65,72,82,etc aren't necessary, I only added them for a cleaner output.

- Henry Smith :)                                                                                                  */