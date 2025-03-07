package gmail.sklyaruk.rostislav1903;

public class Dragon {
    public String getName;
    private String name;
    private int age;
    private double weight;

    public Dragon() {
    }

    public Dragon(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
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
}

