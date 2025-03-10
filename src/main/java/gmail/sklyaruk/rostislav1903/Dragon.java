package gmail.sklyaruk.rostislav1903;

public class Dragon {
    private String name;
    private int age;
    private int weight;
    private String voice; //додаємо поля
    private String fire;
    private String breed;

    public Dragon() {
    }

    public Dragon(String name, int age, int weight, String voice, String fire, String breed) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.voice = voice;
        this.fire = fire;
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Dragon{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", voice='" + voice + '\'' +
                ", fire='" + fire + '\'' +
                ", breed='" + breed + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getVoice() {
        return voice;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    public String getFire() {
        return fire;
    }

    public void setFire(String fire) {
        this.fire = fire;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}