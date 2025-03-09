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

        System.out.print("Введіть ім'я дракона: ");
        String name = scanner.nextLine();
        String age = scanner.nextLine();
        String weight = scanner.nextLine();
        String voice = scanner.nextLine();
        String fire = scanner.nextLine();
        System.out.println("імя " + name);
        System.out.println(age);
        System.out.println(weight);
        System.out.println(voice);

        scanner.close();
    }
}

