// Custom Sword Object Creator Program
// Made By: Henry Smith
// Started: 10/1/2024
// Finished: 10/1/2024

// MAIN IDEA: 
// The idea for this program is to create a custom sword object, and determine the certain attributes of the blade


// Creates a class as a blueprint for a sword
public class CustomSwordObject {

    // Determines the attributes of the sword, such as wether or not is has a curved blade, how many edges it has, etc. 

    String CurvedBlade; // Wether or not the blade is curved
    int NumberOfEdges; // The amount of sharp edges the sword has (1 or 2)
    String Serrated; // Wether or not the blade is serrated (has metal teeth somewhere on the blade)

        // Combines the required attributes of a custom sword
        public CustomSwordObject(String curved, int edges, String serrated) {

            // Attaches the previous variables to the "CustomSwordObject" as attributes
            CurvedBlade = curved;
            NumberOfEdges = edges;
            Serrated = serrated;
        }

                // Sets a second variable to the attributes of an object
                    public String getCurved() {
                        return CurvedBlade;
                    }

                        public int getEdges() {
                            return NumberOfEdges;
                        }

                            public String getSerrated() {
                                return Serrated;
                            }

                    // Creates a behavior method that allows you to change the attributes of the "CustomSwordObject"
                        public void setCurved(String curved) {
                        CurvedBlade = curved;
                        }

                            public void setEdges(int edges) {
                                NumberOfEdges = edges;
                            }
                
                                public void setSerrated(String serrated) {
                                    Serrated = serrated;
                                }



// Creates a starting point for the program
public class Main {
    public static void main(String[] args) {

        // Creates a new sword called "Sword1" using the CustomSwordObject converter
        CustomSwordObject Sword1 = new CustomSwordObject("Yes", 1, "No");
        
        //Prints out the start of the program output to look a little cleaner (Not Actualy Necessary)
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
                            System.out.println("Sword 2 Ver 2.0 (Modified) Attributes:");
                            System.out.println("Is Curved = " + Sword3.getCurved());
                            System.out.println("Edges = " + Sword3.getEdges());
                            System.out.println("Is Serrated = " + Sword3.getSerrated());
                            System.out.println("-----------------------------------------------");
        }
    }
}

/* Note: I didn't relize that all I had to do for 2.3 was create the class, but hopefully this counts! I also have no 
idea how I finished this whole code in a day. It was like my brain just... understood java for a second. I also tried
to format everything with tabs, so hopefully this counts as good formatting. Also yes, I know the line 64,65,72,82,etc
aren't necessary, I only added them for a cleaner output. Let me know if I need to remove them!

- Henry Smith :)                                                                                                  */