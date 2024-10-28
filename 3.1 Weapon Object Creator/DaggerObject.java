// Dagger Object Subclass for "CustomSwordObject" class
// Made By: Henry Smith
// Started: 10/26/2024
// Finished: 10/28/2024


// Creates a subclass with the "CustomSwordObject" as the superclass
public class DaggerObject extends CustomSwordObject {

    // Determines the extra attributes for the "DaggerObject" subclass
    int BladeLength; //Records the length of the handle

        // Makes a new constructor with attributes from the superclass
        public DaggerObject(String curved, int edges, String serrated, int bladesize) {

            super(curved, edges, serrated);
            BladeLength = bladesize;
        }

    // Sets a second variable to the extra attribute of the object
    public int getBlade() {
        return BladeLength;
        }

        // Sets a second variable to the extra attribute of the object
        public void setBlade(int Blade) {
            BladeLength = Blade;
        }
}

