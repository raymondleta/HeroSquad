package HeroesSquad;
import java.util.List;
import java.util.ArrayList;

public class Squad {
    private String Name;
    private static List<Squad> instances = new ArrayList<Squad>();
    private int Id;
    private List<Hero> heroes;

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
    public int getId() {
        return Id;
    }
    public static Squad find(int id) {
        return instances.get(id - 1);
    }
    public List<Hero> getHeroes() {
        return heroes;
    }
    public void addHero(Hero hero) {
        heroes.add(hero);
    }
}
