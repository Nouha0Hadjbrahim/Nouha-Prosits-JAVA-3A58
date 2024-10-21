public class Main {
    public static void main(String[] args) {
        // Utilisation de guillemets doubles pour la chaîne de caractères "lion"
     Animal animal1=new Animal( "Felidae","lion", 4, true) ;
     Animal animal2=new Animal( "Felidae","chien", 3, false) ;
     Zoo zoo1=new Zoo("bahamas","New York");

        if(zoo1.addAnimal(animal1)==true){
            System.out.println("animal est ajouté avec succes");
        }
        if(zoo1.addAnimal(animal2)==true){
            System.out.println("animal est ajouté avec succes");
        }
        System.out.println("nombre des animaux :"+zoo1.getAnimalCount());
//11
        zoo1.displayAnimals();

        // search animal
        int indice=zoo1.searchAnimal(animal1);
        System.out.println("l'indice de l'animal :"+indice);

 //13
//        boolean test=zoo1.removeAnimal( animal1);
//        if(test)
//        {
//            System.out.println("Suppression avec succes!");
//            zoo1.displayAnimals();
//        }

//14
       boolean test2=zoo1.isZooFull();
       if(test2){
           System.out.println("Zoo est plein");
       }

//15
        Zoo zooCmp=new Zoo();
        Zoo zoo2=new Zoo("HINDI","Texax");
        zooCmp=zooCmp.comparerZoo(zoo1, zoo2);
        System.out.println("Le Zoo avec le plus d'animaux: "+zooCmp.getName());




    }
}
