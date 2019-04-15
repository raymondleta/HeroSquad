package HeroesSquad;
import org.junit.*;
import static org.junit.Assert.*;

public class HeroTest {
    @Test
    public void Hero_instantiatesCorrectly_true() {
        Hero myHero = new Hero("Superman",50, "Flight","Kryptonite", "Male");
        assertEquals(true, myHero instanceof Hero);
    }
    @Test
    public void Hero_instantiatesWithName_String() {
        Hero myHero = new Hero("Batman", 50,"Running", "Everything", "Male");
        assertEquals("Batman", myHero.getName());
    }
    @Test
    public void Hero_instantiatesWithAge_Int() {
        Hero myHero = new Hero("Batman", 50,"Running", "Everything", "Male");
        assertEquals(50, myHero.getAge());
    }
    @Test
    public void Hero_instantiatesWithSpecialPower_String() {
        Hero myHero = new Hero("Batman", 50,"Running", "Everything", "Male");
        assertEquals("Running", myHero.getSpecialPower());
    }
    @Test
    public void Hero_instantiatesWithWeakness_String() {
        Hero myHero = new Hero("Batman", 50,"Running", "Everything", "Male");
        assertEquals("Eberything", myHero.getWeakness());
    }
    @Test
    public void Hero_instantiatesWithGender_String() {
        Hero myHero = new Hero("Batman", 50,"Running", "Everything", "Male");
        assertEquals("Male", myHero.getGender());
    }

    @Test
    public void all_returnsAllInstancesOfHero_true() {
        Hero firstHero = new Hero("Superman", 99, "Strength", "Kryptonite", "Martian");
        Hero secondHero = new Hero("Wonderwoman",50, "SuperStrength","Superman", "Female");
        assertEquals(true, Hero.all().contains(firstHero));
        assertEquals(true, Hero.all().contains(secondHero));
    }
    @Test
    public void clear_emptiesAllHeroesFromArrayList_0() {
        Hero myHero = new Hero("Flash",20, "Superspeed", "Zoom","Male");
        Hero.clear();
        assertEquals(Hero.all().size(), 0);
    }


}
