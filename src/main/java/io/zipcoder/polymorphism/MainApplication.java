package io.zipcoder.polymorphism;

import java.util.ArrayList;
import java.util.Scanner;

public class MainApplication {

    public static void main(String[] args) {

        // Fields to save user input
        String petAnimal;
        String petName;
        int totalPets;

        // ArrayList to store user input
        ArrayList<Pet> petList = new ArrayList<>();

        // Import Scanner utility to read user input
        Scanner scanner = new Scanner(System.in);

        // Obtain pet count to create new arraylist
        System.out.println("How many pets do you have?");
        totalPets = scanner.nextInt();

        // Scanner for next line
        scanner.nextLine();

        // For loop to cycle based on number of Pets
        for (int i = 1; i < totalPets + 1; i++) {
            System.out.println(i + ". What kind of pet is it? (Dragon, Dog, Cat)");
            petAnimal = scanner.nextLine().toLowerCase();

            boolean input = true;

            // Checks for correct input
            while (input) {
                if (petAnimal.equalsIgnoreCase("dragon") || petAnimal.equalsIgnoreCase("dog") || petAnimal.equalsIgnoreCase("cat")) {
                    input = false;
                } else {
                    System.out.println("That doesn't look right, try again: Dragon, Dog, or Cat?");
                    petAnimal = scanner.nextLine().toLowerCase();
                }
            }

            // Asks for name
            System.out.println("What is their name?");
            petName = scanner.nextLine();

            //Switch case will add a pet and name based on what type of pet the user inputs
            switch (petAnimal) {
                case "dragon":
                    petList.add(new Dragon(petName));
                    break;
                case "cat":
                    petList.add(new Cat(petName));
                    break;
                case "dog":
                    petList.add(new Dog(petName));
                    break;
            }
        }

        // For each object(pet) that the user has, print pet name and speech
        for (Pet animal : petList){
            System.out.println(animal.getName() + " says " + animal.speak());
        }

    }
}
