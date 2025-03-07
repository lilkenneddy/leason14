package gmail.sklyaruk.rostislav;

public class Main {

    public static void main(String[] args) {
        Dragon dragon = new Dragon();
        dragon.setName("BigAngryMurzik");
        dragon.setAge(430);
        dragon.setWeight(3780);

        System.out.println(dragon.getName());
        System.out.println(dragon.getAge());
        System.out.println(dragon.getWeight());


    }
}

