package HeroesSquad;
import java.util.ArrayList;
import java.util.List;

public class Hero {
    private String name;
    private int age;
    private String specialPower;
    private String weakness;
    public String gender;
    private static List<Hero> instances = new ArrayList<Hero>();
    private int Id;

    public Hero(String name, int age, String specialPower, String weakness, String gender) {
        this.name = name;
        this.age = age;
        this.specialPower = specialPower;
        this.weakness = weakness;
        this.gender = gender;
        instances.add(this);
        Id = instances.size();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSpecialPower() {
        return specialPower;
    }

    public String getWeakness() {
        return weakness;
    }

    public String getGender() {
        return gender;
    }
    public static List<Hero> all() {
        return instances;
    }
    public static void clear() {
        instances.clear();
    }
    public int getId() {
        return Id;
    }
}
