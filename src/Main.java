import entities.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        // Create a zoo
        System.out.println("Donner le nom du zoo : ");
        String name = obj.nextLine();
        entities.Zoo MyZoo = new entities.Zoo(name, "Tunis");

        // Create and add aquatic animals
        Dolphin dolphin = new Dolphin("Dolphin Family", "Dolphin", 5, true, "Ocean", 15.0f);
        Penguin penguin = new Penguin("Penguin Family", "Penguin", 3, false, "Antarctic", 30.0f);

        MyZoo.addAquaticAnimal(dolphin);
        MyZoo.addAquaticAnimal(penguin);

        // Display swimming behavior using the new method
        MyZoo.displayAquaticAnimals();

        // Display number of aquatic animals by type
        MyZoo.displayNumberOfAquaticsByType();

        // Display max swimming depth of penguins
        System.out.println("Max swimming depth of penguins: " + MyZoo.maxPenguinSwimmingDepth());
    }
}
