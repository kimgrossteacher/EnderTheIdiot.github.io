// Simple horse class created by Kim Gross
// for CTE Software Development class 2022
// Slightly modified by Henry Smith

public class Horses {

    String name; // Current name of the Horse

    int birthYear; // Year the horse was born.

    String[] names; // Array of old names of the horse.

    int numberofNames=0; // How many old names are there.
    
    

    public Horses(String horseName, int year) { // Horse constructor needs its name and birth year

        name=horseName; // Assigns the name of the horse to the "horseName" variable, that was sent in the constuctor

        birthYear=year; // Assigns the year to the "birthYear" variable, that was sent in the constuctor
    } 

public class Main { // Acts as a starting point for a new set of code
    public static void main(String[] args) { 

        Horses Horse1 = new Horses("James", 2004); // Creates and object/horse named "James"
        System.out.println("The first horse is named " + Horse1.name);

        Horses Horse2 = new Horses("Baxter", 2012); // Creates and object/horse named "Baxter"
        System.out.println("The second horse is named " + Horse2.name);

        Horses Horse3 = new Horses("Smasher", 2002); // Creates and object/horse named "Smasher"
        System.out.println("The third horse is named " + Horse3.name);
    }
}

// Note: I temporarily removed this part of the code just so I could get a good view of the code being used, but I will add it back in the next assignment

    /*public void age (){
        // what should be in a age function?
    }
    // Changes the name, but saves the old name
    public void changeName (String newName){
        names[numberofNames]=name;
        numberofNames++;
        name=newName;
    }
    public String toString (){
        return name;*/

}
