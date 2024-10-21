public class Zoo {
    private Animal[] animals;  // Tableau pour stocker les animaux
    private String name;
    private String city;
    private final int nbrCages=25;
    private int animalCount;  // Compteur pour suivre le nombre d'animaux
//get
public int getAnimalCount() {
    return animalCount;
}
    public String getName() {
        return name;
    }
    // Constructeur du Zoo
    public Zoo() {

    }

    public Zoo( String name, String city) {
        this.animals = new Animal[nbrCages];  // Le nombre de cages détermine la taille du tableau
        this.name = name;
        this.city = city;
        this.animalCount = 0;  // Initialement, il n'y a aucun animal
    }

    
    // Méthode pour ajouter un animal /10
    public boolean addAnimal(Animal animal) {
        // Vérifier si le zoo a encore de la place pour un nouvel animal
        if (isZooFull()) {
            System.out.println("Le zoo est plein, impossible d'ajouter un nouvel animal.");
            return false;
        } else {
            animals[animalCount] = animal;
            animalCount++;
            return true;
        }
    }

    // Méthode pour afficher les animaux du zoo /11
    public void displayAnimals() {
        for (int i = 0; i < animalCount; i++) {
            System.out.println(animals[i]);
        }
    }

    ///11
    public int searchAnimal(Animal animal){
        for(int i = 0; i < animalCount; i++){
            if(animals[i].getName().equals(animal.getName())) {
                return i;
            }
        }
        return -1;
    }
 /// supprimer un animal 13
    boolean removeAnimal(Animal animal){
        int indice=searchAnimal(animal);
        if (indice!=-1){
            animalCount-=1;
            for(int i = indice; i < animalCount; i++){
                animals[i]=animals[i+1];
            }
            return true;
        }
        return false;
    }

    //14
    boolean isZooFull(){
        if (animalCount==nbrCages){
            return true;
        }
        return false;
    }

    //15
    Zoo comparerZoo(Zoo z1, Zoo z2){
        if (z1.getAnimalCount()>z2.getAnimalCount()) {
            return z1;
        }
        else {
            return z2;
        }
    }

}
