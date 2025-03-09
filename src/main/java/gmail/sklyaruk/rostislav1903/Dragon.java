package gmail.sklyaruk.rostislav1903;

public class Dragon {
    private String name;
    private int age;
    private double weight;
    private String voice; //додаємо поля
    private String fire;

    public Dragon() {
    }

    @Override
    public String toString() {
        return "Dragon{" +
                "name='"+ name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", voice='" + voice + '\'' +
                ", fire='" + fire + '\'' +
                '}';
    }

    public Dragon(String name, int age, double weight, String voice, String fire) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.voice = voice;
        this.fire = fire;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }
    public String getVoice() { // Getter для фрази
        return this.voice;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getFire() {
        return fire;
    }

    public void setFire(String fire) {
        System.out.println("Дракон пускає вогонь: " + fire);
    }

}






