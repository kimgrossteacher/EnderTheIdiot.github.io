// Weapon Object Creator: Main Program
// Made By: Henry Smith
// Started: 10/10/2024
// Finished: 10/10/2024
// Modified: 10/28/2024


// Creates a program starting point that will later be used to create a sword object with the class that was just created

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Adds some extra lines to make the output easier to see
        System.out.println(" ");
        System.out.println("CUSTOM WEAPON PROGRAM OUTPUT");
        System.out.println("-----------------------------------------------");

            // Makes 4 diffirent objects with the "SwordObject" constructor, and makes an unsorted array list out of the created objects
            List<SwordObject> weapons = new ArrayList<>();  
            weapons.add(new SwordObject("Cutlass", "Yes", 1, "No"));
            weapons.add(new SwordObject("Sword", "No", 2, "No"));
            weapons.add(new SwordObject("Serrated Sword", "Yes", 2, "Yes"));
            weapons.add(new SwordObject("Falchion", "Yes", 1, "No"));

            // Sorts the unsorted array of objects
            Collections.sort(weapons);

        // Sets a second variable to the objects in the array
        for (SwordObject weapon : weapons) {

            System.out.println(weapon.SwordName + " Attributes:");
            System.out.println("Is Curved = " + weapon.CurvedBlade);
            System.out.println("Edges = " + weapon.NumberOfEdges);
            System.out.println("Is Serrated = " + weapon.Serrated);     
            System.out.println("-----------------------------------------------");   
        }
    }
}