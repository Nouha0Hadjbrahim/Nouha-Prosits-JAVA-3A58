package tn.esprit.gestionzoo.main;
import tn.esprit.gestionzoo.entities.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int age = 0;
        while(age<=0){
            System.out.println("Donner l'age : ");
            age = obj.nextInt();
            if(age <= 0 ){
                System.out.println("Age ne peut pas etre negatif!!");
            }
        }
        Animal lion = new Animal("Female","Lion",age,true);
        Animal cat = new Animal("Female","cat",10,true);
        Animal dog = new Animal("Female","dog",10,true);
        Animal cow = new Animal("Female","cow",10,true);
        Animal cow2 = new Animal("Female","cow",10,true);

        String name = "";
        Scanner obj1 = new Scanner(System.in);
        while(name.isEmpty()){
            System.out.println("Donner le nom du zoo : ");
            name = obj1.nextLine();
            if(name.isEmpty()){
                System.out.println("Le nom du zoo ne peut pas etre vide!!");
            }
        }

        Zoo MyZoo = new Zoo(name,"Tunis",10);
        Zoo MyZoo2 = new Zoo("My Zoo2","Tunis",10);

        MyZoo.addAnimal(lion);
        MyZoo.addAnimal(cat);
        MyZoo.addAnimal(dog);
        MyZoo.addAnimal(cow);


        MyZoo2.addAnimal(dog);
        MyZoo2.addAnimal(cow);

        System.out.println("-----------------------------------------------------");


        MyZoo.displayZoo();

        MyZoo.afficherAnimals();

        System.out.println("------------- Zoo without the lion -------------");


        MyZoo.removeAnimal(lion);

        MyZoo.afficherAnimals();

        System.out.println("-----------------------------------------------------");

        System.out.println( "Position de cet animal: " + MyZoo.searchAnimal(cow));
        System.out.println( "Position de cet animal (copy): " + MyZoo.searchAnimal(cow2));

        System.out.println("-----------------------------------------------------");

        System.out.println("Nombre de cages: " + MyZoo.getNbrCages());

        System.out.println("Nombre des animaux: " + MyZoo.nbrAnimals());

        System.out.println("Zoo full: " + MyZoo.isZooFull());

        System.out.println("-----------------------------------------------------");

        System.out.println("------------------ Zoo with most animals ------------------");

        Zoo.comparerZoo(MyZoo,MyZoo2).displayZoo();
        Zoo.comparerZoo(MyZoo,MyZoo2).afficherAnimals();

        System.out.println("-------------- Overriding 'toString'---------------");
        System.out.println(MyZoo);

    }
}