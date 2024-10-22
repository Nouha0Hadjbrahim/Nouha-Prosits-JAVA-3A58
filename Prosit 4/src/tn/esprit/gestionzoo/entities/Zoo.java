package tn.esprit.gestionzoo.entities;

public class Zoo {
    Animal [] animals;
    private String name;
    private String city;
    private final int nbrCages =25;
    public Zoo() {}
    public Zoo(String name, String city, int nbrCages) {
        animals = new Animal[nbrCages];
        if(name == null || name.isEmpty()){
            System.out.println("Name is empty!");
            name="";
        }
        this.name = name;
        this.city = city;
    }

    public int getNbrCages() {
        return nbrCages;
    }
    public String getName() {
        return name;
    }
    public String getCity() {
        return city;
    }
    public void setName(String Name) {
        this.name=Name;
    }
    public void setCity(String City) {
        this.city=City;
    }

    public void displayZoo(){
        System.out.println("---------Zoo---------");
        System.out.println("Name: " + name);
        System.out.println("City: " + city);
        System.out.println("Nbr Cages: " + nbrCages);
    }
    public int nbrAnimals() {
        int num=0;
        while(num<nbrCages && animals[num]!=null){
            num++;
        }
        return num;
    }
    public boolean addAnimal(Animal animal){
        if(searchAnimal(animal)!=-1){
            System.out.println("Animal already exists");
            return false;
        }
        int num=0;
        while(num<nbrCages && animals[num]!=null){
            num++;
        }
        if(isZooFull()){
            System.out.println("Aucune cage vide!!");
            return false;
        }
        else{
            animals[num] = animal;
            return true;
        }
    }
    public int searchAnimal(Animal animal){
        int i=0;
        while(i<nbrAnimals() && !animals[i].getName().equals(animal.getName())){
            i++;
        }
        if(i==nbrAnimals()){
            i=-1;
        }
        return i;
    }
    public void afficherAnimals(){
        System.out.println("-----------------------------");
        for(int i=0;i<nbrAnimals();i++){
            System.out.println("- Name: " + animals[i].getName());
            System.out.println("Family: " + animals[i].getFamily());
            System.out.println("Age: " + animals[i].getAge());
            System.out.println("isMammal: " + animals[i].isMammal());
            System.out.println("       ----------------------");
        }
    }
    public boolean removeAnimal(Animal animal){
        if(searchAnimal(animal)==-1){
            System.out.println("Animal introuvable");
            return false;
        }
        else{
            Animal[] animals1=new Animal[nbrCages-1];
            int i=0,j=0;
            while(i<nbrAnimals()){
                if(!animals[i].getName().equals(animal.getName())){
                    animals1[j]=animals[i];
                    j++;
                }
                i++;
            }
            animals=animals1;
            return true;
        }
    }
    public boolean isZooFull(){
        return nbrCages==nbrAnimals();
    }
    public static Zoo comparerZoo(Zoo z1, Zoo z2){
        if(z1.nbrAnimals()>=z2.nbrAnimals()){
            return z1;
        }
        else{
            return z2;
        }
    }
    @Override
    public String toString() {
        return ("Name: " + name + "\nCity: " + city + "\nNbr Cages: " + nbrCages);
    }

}
