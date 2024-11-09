//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package entities;

public class Animal {
    protected String family;
    protected String name;
    protected int age;
    protected boolean isMammal;

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFamily() {
        return this.family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isMammal() {
        return this.isMammal;
    }

    public void setMammal(boolean mammal) {
        this.isMammal = mammal;
    }

    public Animal() {
    }

    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        if (age <= 0) {
            System.out.println("Invalid Age for the " + name + "(Must be positive)");
            age = 0;
        }

        this.age = age;
        this.isMammal = isMammal;
    }

    public void displayAnimal() {
        System.out.println("-----------------------------");
        System.out.println("- Name: " + this.name);
        System.out.println("Family: " + this.family);
        System.out.println("Age: " + this.age);
        System.out.println("isMammal: " + this.isMammal);
    }
}
