package HeroesSquad;
import java.util.List;
import java.util.ArrayList;

public class Squad {
    private String Name;
    private static List<Squad> instances = new ArrayList<Squad>();
    private List<Hero> heroes;
    private int Id;

    public Squad(String name) {
        Name = name;
        instances.add(this);
        Id = instances.size();
        heroes = new ArrayList<Hero>();
    }

    public String getName() {
        return Name;
    }
    public static List<Squad> all() {
        return instances;
    }
    public static void clear() {
        instances.clear();
    }
    public static Squad find(int id) {
        try {
            return instances.get(id - 1);
        } catch (IndexOutOfBoundsException exception) {
            return null;
        }
    }
    public int getId() {
        return Id;
    }
    public List<Hero> getHeroes() {
        return heroes;
    }
    public void addHero(Hero hero) {
        heroes.add(hero);
    }

}
