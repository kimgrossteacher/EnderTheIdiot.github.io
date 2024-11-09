// Weapon Object Creator
// Made By: Henry Smith
// Started: 10/1/2024
// Finished: 10/1/2024
// Version 1 Modified: 10/28/2024
// Version 2 Modified: 11/8/2024

// MAIN IDEA: 
// The idea for this program is to create a custom sword object, and determine the certain attributes of the blade


// Creates a class as a blueprint for a sword
public class SwordObject implements Comparable<SwordObject> {


    // Determines the attributes of the sword, such as wether or not is has a curved blade, how many edges it has, etc. 
    String SwordName; // Sets the name/type of the sword
    String CurvedBlade; // Wether or not the blade is curved
    int NumberOfEdges; // The amount of sharp edges the sword has (1 or 2)
    String Serrated; // Wether or not the blade is serrated (has metal teeth somewhere on the blade)



        // Combines the required attributes of a custom sword
        public SwordObject(String name, String curved, int edges, String serrated) {
            // Attaches the previous variables to the "CustomSwordObject" as attributes
            SwordName = name;
            CurvedBlade = curved;
            NumberOfEdges = edges; 
            Serrated = serrated;
        }

        // Sets a second variable to the attributes of an object
        public String getName() {
            return SwordName;
            }

        public String getCurved() {
            return CurvedBlade;
            }

        public int getEdges() {
            return NumberOfEdges;
            }

        public String getSerrated() {
            return Serrated;
            }

            // Creates a behavior method that allows you to change the attributes of an object using the "SwordObject" constructor
            public void setName(String name) {
                SwordName = name;
            }

            public void setCurved(String curved) {
                CurvedBlade = curved;
            }

            public void setEdges(int edges) {
                NumberOfEdges = edges;
            }
                
            public void setSerrated(String serrated) {
                Serrated = serrated;
            }  
            
                @Override
                public int compareTo(SwordObject other) {
                    // Sets the method that sorts the objects made with this class and its subclasses
                    return this.SwordName.compareTo(other.SwordName);
            }   
        }