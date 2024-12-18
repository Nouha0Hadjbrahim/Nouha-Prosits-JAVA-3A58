package tn.esprit.gestionzoo.entities;

public class Penguin extends Aquatic{
    private float swimmingDepth;

    public void setSwimmingDepth(float swimmingDepth) {
        this.swimmingDepth = swimmingDepth;
    }
    public float getSwimmingDepth() {
        return swimmingDepth;
    }

    public Penguin(){}
    public Penguin(String family, String name, int age, boolean isMammal,String habitat,float swimmingDepth){
        super(family, name, age, isMammal, habitat);
        this.swimmingDepth = swimmingDepth;
    }
    @Override
    public String toString() {
        return ("Family: "+family+"\nName: "+ name + "\nAge: "+age + "\nIsMammal: "+isMammal +"\nHabitat: "+habitat+"\nSwimmingSpeed: "+swimmingDepth);
    }
}
