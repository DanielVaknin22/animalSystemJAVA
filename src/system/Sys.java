package system;
import animals.*;
import mobility.Point;
import Olympics.Medal;
import java.util.Scanner;
public class Sys {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many animals you want?");
        int numOfAnimals = sc.nextInt();
        Animal[] animals = new Animal[numOfAnimals];
        for(int i = 0; i < numOfAnimals; i++){
            System.out.println("Animal " + (i + 1) + ":");
            System.out.println("Choose animal type:");
            System.out.println("1. Water Animal");
            System.out.println("2. Terrestrial Animal");
            System.out.println("3. Air Animal");
            int animalType = scanner.nextInt();
            scanner.nextLine();

            switch (animalType) {
                case 1:
                    animals[i] = createWaterAnimal(scanner);
                    break;
                case 2:
                    animals[i] = createTerrestrialAnimal(scanner);
                    break;
                case 3:
                    animals[i] = createAirAnimal(scanner);
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        }
        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1. Print animal information");
            System.out.println("2. Make animal sound");
            System.out.println("3. Exit");

            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    printAnimalInformation(animals);
                    break;
                case 2:
                    makeAnimalSound(animals);
                    break;
                case 3:
                    System.out.println("Exiting the system...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please choose again.");
                    break;
            }
        }
    }
    private static WaterAnimal createWaterAnimal(Scanner scanner) {
        System.out.println("Choose specific water animal:");
        System.out.println("1. Alligator");
        System.out.println("2. Whale");
        System.out.println("3. Dolphin");
        int choice = scanner.nextInt();
        scanner.nextLine(); // consume newline

        System.out.print("Enter animal name: ");
        String name = scanner.nextLine();

        System.out.print("Enter animal gender (Male/Female/Hermaphrodite): ");
        String genderStr = scanner.nextLine();
        Gender gender = Gender.valueOf(genderStr.toUpperCase());

        System.out.print("Enter animal weight: ");
        double weight = scanner.nextDouble();

        System.out.print("Enter animal speed: ");
        double speed = scanner.nextDouble();
        scanner.nextLine(); // consume newline

        Medal[] medals = new Medal[0]; // Initialize empty array for medals

        System.out.print("Enter dive depth: ");
        double diveDepth = scanner.nextDouble();
        scanner.nextLine(); // consume newline

        switch (choice) {
            case 1:
                System.out.print("Enter area of living: ");
                String areaOfLiving = scanner.nextLine();
                return new Alligator(new Point(50, 0), name, gender, weight, speed, medals, areaOfLiving);
            case 2:
                System.out.print("Enter food type: ");
                String foodType = scanner.nextLine();
                return new Whale(new Point(50, 0), name, gender, weight, speed, medals, foodType);
            case 3:
                System.out.print("Enter water type (Sea/Sweet): ");
                String waterTypeStr = scanner.nextLine();
                Dolphin.WaterType waterType = Dolphin.WaterType.valueOf(waterTypeStr.toUpperCase());
                return new Dolphin(new Point(50, 0), name, gender, weight, speed, medals, waterType);
            default:
                System.out.println("Invalid choice. Defaulting to Alligator.");
                return new Alligator(new Point(50, 0), name, gender, weight, speed, medals, "Default Area");
        }
    }

    private static TerrestrialAnimal createTerrestrialAnimal(Scanner scanner) {
        System.out.println("Choose specific terrestrial animal:");
        System.out.println("1. Dog");
        System.out.println("2. Cat");
        System.out.println("3. Snake");
        int choice = scanner.nextInt();
        scanner.nextLine(); // consume newline

        System.out.print("Enter animal name: ");
        String name = scanner.nextLine();

        System.out.print("Enter animal gender (Male/Female/Hermaphrodite): ");
        String genderStr = scanner.nextLine();
        Gender gender = Gender.valueOf(genderStr.toUpperCase());

        System.out.print("Enter animal weight: ");
        double weight = scanner.nextDouble();

        System.out.print("Enter animal speed: ");
        double speed = scanner.nextDouble();
        scanner.nextLine(); // consume newline

        Medal[] medals = new Medal[0]; // Initialize empty array for medals

        System.out.print("Enter number of legs: ");
        int noLegs = scanner.nextInt();
        scanner.nextLine(); // consume newline

        switch (choice) {
            case 1:
                System.out.print("Enter breed: ");
                String breed = scanner.nextLine();
                return new Dog(new Point(0, 20), name, gender, weight, speed, medals, noLegs, breed);
            case 2:
                System.out.print("Is the cat castrated (true/false): ");
                boolean castrated = scanner.nextBoolean();
                scanner.nextLine(); // consume newline
                return new Cat(new Point(0, 20), name, gender, weight, speed, medals, noLegs, castrated);
            case 3:
                System.out.print("Enter poison level: ");
                String poisonStr = scanner.nextLine();
                Poisonous poisonLevel = Poisonous.valueOf(poisonStr.toUpperCase());

                System.out.print("Enter length: ");
                double length = scanner.nextDouble();
                scanner.nextLine(); // consume newline

                return new Snake(new Point(0, 20), name, gender, weight, speed, medals, noLegs, poisonLevel, length);
            default:
                System.out.println("Invalid choice. Defaulting to Dog.");
                return new Dog(new Point(0, 20), name, gender, weight, speed, medals, noLegs, "Unknown Breed");
        }
    }

    private static AirAnimal createAirAnimal(Scanner scanner) {
        System.out.println("Choose specific air animal:");
        System.out.println("1. Eagle");
        System.out.println("2. Pigeon");
        int choice = scanner.nextInt();
        scanner.nextLine(); // consume newline

        System.out.print("Enter animal name: ");
        String name = scanner.nextLine();

        System.out.print("Enter animal gender (Male/Female/Hermaphrodite): ");
        String genderStr = scanner.nextLine();
        Gender gender = Gender.valueOf(genderStr.toUpperCase());

        System.out.print("Enter animal weight: ");
        double weight = scanner.nextDouble();

        System.out.print("Enter animal speed: ");
        double speed = scanner.nextDouble();
        scanner.nextLine(); // consume newline

        Medal[] medals = new Medal[0]; // Initialize empty array for medals

        switch (choice) {
            case 1:
                System.out.print("Enter altitude of flight: ");
                double altitudeOfFlight = scanner.nextDouble();
                scanner.nextLine(); // consume newline
                return new Eagle(new Point(0, 100), name, gender, weight, speed, medals, altitudeOfFlight);
            case 2:
                System.out.print("Enter family: ");
                String family = scanner.nextLine();
                return new Pigeon(new Point(0, 100), name, gender, weight, speed, medals, family);
            default:
                System.out.println("Invalid choice. Defaulting to Eagle.");
                return new Eagle(new Point(0, 100), name, gender, weight, speed, medals, 0);
        }
    }

    private static void printAnimalInformation(Animal[] animals) {
        for (Animal animal : animals) {
            System.out.println(animal.toString());
        }
    }

    private static void makeAnimalSound(Animal[] animals) {
        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}