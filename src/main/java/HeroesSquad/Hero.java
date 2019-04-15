package HeroesSquad;

public class Hero {
    private String name;
    private int age;
    private String specialPower;
    private String weakness;
    public String gender;

    public Hero(String name, int age, String specialPower, String weakness, String gender) {
        this.name = name;
        this.age = age;
        this.specialPower = specialPower;
        this.weakness = weakness;
        this.gender = gender;
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
}
