package entities;

public class Zoo {
    // Existing attributes...
    private Animal[] animals;
    private String name;
    private String city;
    private final int nbrCages = 25;
    private Aquatic[] aquaticAnimals;  // New array for aquatic animals

    public Zoo() {
        this.aquaticAnimals = new Aquatic[10]; // Initialize aquaticAnimals array
    }

    public Zoo(String name, String city) {
        this.name = name;
        this.city = city;
        this.animals = new Animal[nbrCages];
        this.aquaticAnimals = new Aquatic[10]; // Initialize aquaticAnimals array
    }

    public void displayAquaticAnimals() {
        System.out.println("Aquatic Animals in the Zoo:");
        for (Aquatic aquatic : aquaticAnimals) {
            if (aquatic != null) {
                System.out.println(aquatic.toString()); // Use toString or any other method to display details
            }
        }
    }
    // Method to add an aquatic animal
    public boolean addAquaticAnimal(Aquatic aquatic) {
        for (int i = 0; i < aquaticAnimals.length; i++) {
            if (aquaticAnimals[i] == null) {
                aquaticAnimals[i] = aquatic;
                return true;
            }
        }
        System.out.println("No space for more aquatic animals!");
        return false;
    }

    // Method to get the maximum swimming depth of penguins
    public float maxPenguinSwimmingDepth() {
        float maxDepth = 0;
        for (Aquatic aquatic : aquaticAnimals) {
            if (aquatic instanceof Penguin) {
                maxDepth = Math.max(maxDepth, ((Penguin) aquatic).getSwimmingDepth());
            }
        }
        return maxDepth;
    }

    // Method to display the number of aquatic animals by type
    public void displayNumberOfAquaticsByType() {
        int dolphinCount = 0;
        int penguinCount = 0;

        for (Aquatic aquatic : aquaticAnimals) {
            if (aquatic instanceof Dolphin) {
                dolphinCount++;
            } else if (aquatic instanceof Penguin) {
                penguinCount++;
            }
        }

        System.out.println("Number of Dolphins: " + dolphinCount);
        System.out.println("Number of Penguins: " + penguinCount);
    }
}
