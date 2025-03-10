package gmail.sklyaruk.rostislav1903;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Dragon dragon = new Dragon();
        dragon.setName("BigAngryMurzik");
        dragon.setAge(430);
        dragon.setWeight(3780);
        dragon.setVoice("Я дракон!");
        dragon.setFire("РРРР");


        System.out.println(dragon.getName());
        System.out.println(dragon.getAge());
        System.out.println(dragon.getWeight());
        System.out.println(dragon.getVoice());
        System.out.println(dragon.getFire());

        Scanner scanner = new Scanner(System.in);

        System.out.println("Now you can create a dragon");
        System.out.println("Please enter the name of your dragon");

        String name = scanner.nextLine();
        System.out.println("Please enter the age of your dragon");
        int age = scanner.nextInt();
        System.out.println("Please enter the weight of your dragon");
        double weight = scanner.nextDouble();

        System.out.println("імя " + name);
        System.out.println(age);
        System.out.println(weight);
        System.out.println();
        boolean fire;
        System.out.println();
        scanner.close();
    }
}

