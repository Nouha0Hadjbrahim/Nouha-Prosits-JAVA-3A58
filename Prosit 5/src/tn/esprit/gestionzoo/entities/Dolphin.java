package tn.esprit.gestionzoo.entities;

public class Dolphin extends Aquatic{
    private float swimmingSpeed;

    public void setSwimmingSpeed(float swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }
    public float getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public Dolphin(){}
    public Dolphin(String family, String name, int age, boolean isMammal,String habitat,float swimmingSpeed){
        super(family, name, age, isMammal, habitat);
        this.swimmingSpeed = swimmingSpeed;
    }
    @Override
    public String toString() {
        return ("Family: "+family+"\nName: "+ name + "\nAge: "+age + "\nIsMammal: "+isMammal +"\nHabitat: "+habitat+"\nSwimmingSpeed: "+swimmingSpeed);
    }
    public void swim(){
        System.out.println("This dolphin is swimming");
    }
}
