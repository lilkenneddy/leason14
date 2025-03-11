package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Dragon dragon = new Dragon();

        dragon.setName("BigAngryMurzik");
        System.out.println(dragon.getName());

        dragon.setAge(430);
        System.out.println(dragon.getAge());

        dragon.setWeight(3780);
        System.out.println(dragon.getWeight());

        dragon.setVoice("Я дракон!");
        System.out.println(dragon.getVoice());

        dragon.setFire("РРРР");
        System.out.println(dragon.getFire());

        System.out.println("Now you can create a dragon");

        System.out.println("Please enter the name of your dragon");
        String name = scanner.nextLine();

        System.out.println("Please enter the age of your dragon");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Please enter the weight of your dragon");
        int weight = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Please enter the voice of your dragon");
        String voice = scanner.nextLine();

        System.out.println("Please enter the fire of your dragon");
        String fire = scanner.nextLine();

        System.out.println("Please enter the breed of your dragon: DOBRYAK, NOBREED, NORMALNIY, ELEGAN");
        String breedString = scanner.nextLine();
        Breed breed = Breed.valueOf(breedString);

        System.out.println("імя: " + name);
        System.out.println("Вiк: " + age);
        System.out.println("Вага: " + weight);
        System.out.println("Порода: " + breed);
        System.out.println("Голос: " + voice);
        System.out.println("Вогонь: " + fire);

    }
}