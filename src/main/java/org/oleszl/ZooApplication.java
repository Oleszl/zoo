package org.oleszl;

import org.oleszl.zoo.Zoo;

import java.util.Scanner;

/**
 * Hello world!
 */
public class ZooApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        run();
    }

    private static void run() {
        Scanner scanner = new Scanner(System.in);
        Zoo zoo = new Zoo();

        boolean running = true;
        while (running) {
            System.out.println("Welcome to the Zoo Application!");
            System.out.println("1. Add Animal");
            System.out.println("2. List Animals");
            System.out.println("3. View Animal");
            System.out.println("4. Remove Animal");
            System.out.println("5. Animals number in Zoo");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    zoo.addAnimal();
                    break;
                case 2:
                zoo.getAnimals();
                    break;
                case 3:
                    zoo.getAnimal();
                    break;
                case 4:
                    zoo.removeAnimal();
                    break;
                case 5:
                    zoo.showAnimalsNumber();
                    break;
                case 6:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
