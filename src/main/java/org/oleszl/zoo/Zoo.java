package org.oleszl.zoo;

import org.oleszl.animals.*;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zoo {
    private final List<Animal> animals = new ArrayList<>();
    private final Scanner scanner = new Scanner(System.in);

    public void addAnimal() {
        System.out.println("What kind of animal would you like to add?");
        System.out.println("1. Bison");
        System.out.println("2. Elephant");
        System.out.println("3. Horse");
        System.out.println("4. Monkey");
        System.out.println("5. Tiger");

        int animalNumber = scanner.nextInt();
        switch (animalNumber) {
            case 1:
                createAnimal(Bison.class);
                break;
            case 2:
                createAnimal(Elephant.class);
                break;
            case 3:
                createAnimal(Horse.class);
                break;
            case 4:
                createAnimal(Monkey.class);
                break;
            case 5:
                createAnimal(Tiger.class);
                break;
            default:
                throw new RuntimeException("Sorry, you provide incorrect option");
        }
    }

    public void getAnimals() {

        if (!this.animals.isEmpty()) {
            int i = 1;
            for (Animal animal : animals) {
                System.out.println("[" + (i++) + "] " + animal);
            }
        } else {
            System.out.println("Zoo is empty!");
        }
    }

    public void getAnimal() {
        System.out.println("What animal would you like to get (provide index from List Animal)?");
        int number = scanner.nextInt();
        if (!this.animals.isEmpty()) {
            if (number >= 1 && number < this.animals.size() + 1) {
                System.out.println(animals.get(--number));
            } else {
                System.out.println("Animal with selected number does not exist!");
            }
        } else {
            System.out.println("Zoo is empty!");
        }
    }

    public void removeAnimal() {
        System.out.println("What animal would you like to remove (provide index from List Animal)?");
        int animalNumber = scanner.nextInt();
        if (!animals.isEmpty()) {
            if (animalNumber >= 1 && animalNumber < this.animals.size() + 1) {
                System.out.println("Animal: " + animals.get(--animalNumber).getAnimalName() + " has been removed from zoo.");
                System.out.println("VOICE:" + animals.get(animalNumber).voice());
                animals.remove(animalNumber);
            } else {
                System.out.println("Animal with selected number does not exist!");
            }
        } else {
            System.out.println("Zoo is empty!");
        }
    }

    public void showAnimalsNumber() {
        System.out.printf("There are %d animals in Zoo\n", animals.size());
    }

    private void createAnimal(Class<? extends Animal> clazz) {
        scanner.nextLine();
        System.out.println("Please, provide animal name:");
        String animalName = scanner.nextLine();
        System.out.println("Please, provide animal age:");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Please, provide animal gender:");
        String gender = scanner.nextLine();
        try {
            Animal animal = clazz.getDeclaredConstructor(String.class, int.class, String.class)
                    .newInstance(animalName, age, gender);
            animals.add(animal);
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException |
                 NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
