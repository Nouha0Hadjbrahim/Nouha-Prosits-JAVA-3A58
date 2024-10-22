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
        tn.esprit.gestionzoo.entities.Animal lion = new tn.esprit.gestionzoo.entities.Animal("Female","Lion",age,true);
        tn.esprit.gestionzoo.entities.Animal cat = new tn.esprit.gestionzoo.entities.Animal("Female","cat",10,true);
        tn.esprit.gestionzoo.entities.Animal dog = new tn.esprit.gestionzoo.entities.Animal("Female","dog",10,true);
        tn.esprit.gestionzoo.entities.Animal cow = new tn.esprit.gestionzoo.entities.Animal("Female","cow",10,true);
        tn.esprit.gestionzoo.entities.Animal cow2 = new tn.esprit.gestionzoo.entities.Animal("Female","cow",10,true);

        String name = "";
        Scanner obj1 = new Scanner(System.in);
        while(name.isEmpty()){
            System.out.println("Donner le nom du zoo : ");
            name = obj1.nextLine();
            if(name.isEmpty()){
                System.out.println("Le nom du zoo ne peut pas etre vide!!");
            }
        }

        tn.esprit.gestionzoo.entities.Zoo MyZoo = new tn.esprit.gestionzoo.entities.Zoo(name,"Tunis",10);
        tn.esprit.gestionzoo.entities.Zoo MyZoo2 = new tn.esprit.gestionzoo.entities.Zoo("My Zoo2","Tunis",10);

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

        tn.esprit.gestionzoo.entities.Zoo.comparerZoo(MyZoo,MyZoo2).displayZoo();
        tn.esprit.gestionzoo.entities.Zoo.comparerZoo(MyZoo,MyZoo2).afficherAnimals();

        System.out.println("-------------- Overriding 'toString'---------------");
        System.out.println(MyZoo);



        Terrestrial Terra = new Terrestrial();
        Aquatic Aqua = new Aquatic();
        Dolphin Doph = new Dolphin();
        Penguin Peng = new Penguin();

        System.out.println("--------------New classes---------------");
        System.out.println(Terra);
        System.out.println(Doph);
        System.out.println(Peng);
        System.out.println(Aqua);

        System.out.println("--------------Swim---------------");
        Aqua.swim();
        Doph.swim();
        Peng.swim();


    }
}