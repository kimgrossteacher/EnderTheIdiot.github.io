// Simple horse class created by Kim Gross
// for CTE Software Development class 2022
// Slightly modified by Henry Smith

public class HorseObjectTemplate {

    String name; //Current name of the Horse

    int birthYear; //Year the horse was born.

    String[] names; //Array of old names of the horse.

    int numberofNames=0; //How many old names are there.
    
    public HorseObjectTemplate(String horseName, int year){ //Horse constructor needs its name and birth year

        name=horseName; // Assigns the name of the horse to the "horseName" variable, that was sent in the constuctor

        birthYear=year; // Assigns the year to the "birthYear" variable, that was sent in the constuctor
    }

    public void age (){
        // what should be in a age function?
    }
    // Changes the name, but saves the old name
    public void changeName (String newName){
        names[numberofNames]=name;
        numberofNames++;
        name=newName;
    }
    public String toString (){
        return name;
    }
}