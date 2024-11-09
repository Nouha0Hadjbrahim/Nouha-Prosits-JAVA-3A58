package entities;

public class Penguin extends Aquatic {
    private float swimmingDepth;

    public void setSwimmingDepth(float swimmingDepth) {
        this.swimmingDepth = swimmingDepth;
    }

    public float getSwimmingDepth() {
        return this.swimmingDepth;
    }

    public Penguin() {
    }

    public Penguin(String family, String name, int age, boolean isMammal, String habitat, float swimmingDepth) {
        super(family, name, age, isMammal, habitat);
        this.swimmingDepth = swimmingDepth;
    }

    @Override
    public String toString() {
        return "Family: " + this.family + "\nName: " + this.name + "\nAge: " + this.age + "\nIsMammal: " + this.isMammal + "\nHabitat: " + this.habitat + "\nSwimming Depth: " + this.swimmingDepth;
    }

    @Override
    public void swim() {  // Override the swim method
        System.out.println("This penguin is swimming at a depth of " + this.swimmingDepth + " meters.");
    }
}
