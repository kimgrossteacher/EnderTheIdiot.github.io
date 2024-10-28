// Spear Object Subclass for "CustomSwordObject" class
// Made By: Henry Smith
// Started: 10/26/2024
// Finished: 10/28/2024


// Creates a subclass with the "CustomSwordObject" as the superclass
public class SpearObject extends CustomSwordObject {

    // Determines the extra attributes for the "DaggerObject" subclass
    int HandleLength; // Records the length of the handle

        // Makes a new constructor with attributes from the superclass
        public SpearObject(String curved, int edges, String serrated, int handle) {

            super(curved, edges, serrated);
            HandleLength=handle;
        }  

    // Sets a second variable to the extra attribute of the object
    public int getHandle() {
        return HandleLength;
        }

        // Sets a second variable to the extra attribute of the object
        public void setHandle(int handle) {
            HandleLength = handle;
        }
}