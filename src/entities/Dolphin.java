package entities;

public class Dolphin extends Aquatic {
    private float swimmingSpeed;

    public void setSwimmingSpeed(float swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }

    public float getSwimmingSpeed() {
        return this.swimmingSpeed;
    }

    public Dolphin() {
    }

    public Dolphin(String family, String name, int age, boolean isMammal, String habitat, float swimmingSpeed) {
        super(family, name, age, isMammal, habitat);
        this.swimmingSpeed = swimmingSpeed;
    }

    @Override
    public String toString() {
        return "Family: " + this.family + "\nName: " + this.name + "\nAge: " + this.age + "\nIsMammal: " + this.isMammal + "\nHabitat: " + this.habitat + "\nSwimming Speed: " + this.swimmingSpeed;
    }

    @Override
    public void swim() {  // Override the swim method
        System.out.println("This dolphin is swimming at a speed of " + this.swimmingSpeed + " km/h.");
    }
}
