//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package entities;

public class Terrestrial extends Animal {
    protected int nbrLegs;

    public Terrestrial() {
    }

    public Terrestrial(String family, String name, int age, boolean isMammal, int nbrLegs) {
        super(family, name, age, isMammal);
        this.nbrLegs = nbrLegs;
    }

    public String toString() {
        return "Family: " + this.family + "\nName: " + this.name + "\nAge: " + this.age + "\nIsMammal: " + this.isMammal + "\nbrLegs: " + this.nbrLegs;
    }
}
