package tn.esprit.gestionzoo.entities;

public class Animal {
    protected String family;
    protected String name;
    protected int age;
    protected boolean isMammal;

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getFamily() {
        return family;
    }
    public void setFamily(String family) {
        this.family = family;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public boolean isMammal() {
        return isMammal;
    }
    public void setMammal(boolean mammal) {
        isMammal = mammal;
    }


    public Animal() {}
    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        if(age <= 0){
            System.out.println("Invalid Age for the "+name+"(Must be positive)");
            age = 0;
        }
        this.age = age;
        this.isMammal = isMammal;
    }
    public void displayAnimal() {
        System.out.println("-----------------------------");
        System.out.println("- Name: " + name);
        System.out.println("Family: " + family);
        System.out.println("Age: " + age);
        System.out.println("isMammal: " + isMammal);
    }
}
