package HeroesSquad;
import org.junit.*;
import static org.junit.Assert.*;

public class SquadTest {
    @Test
    public void squad_instantiatesCorrectly_true() {
        Squad testCategory = new Squad("Avengers");
        assertEquals(true, testCategory instanceof Squad);
    }

    @Test
    public void getName_squadInstantiatesWithName_Home() {
        Squad testCategory = new Squad("Defenders");
        assertEquals("Defenders", testCategory.getName());
    }

    @Test
    public void all_returnsAllInstancesOfSquad_true() {
        Squad firstCategory = new Squad("Avengers");
        Squad secondCategory = new Squad("Defenders");
        assertEquals(true, Squad.all().contains(firstCategory));
        assertEquals(true, Squad.all().contains(secondCategory));
    }

    @Test
    public void clear_emptiesAllSquadsFromList_0() {
        Squad testCategory = new Squad("Avengers");
        Squad.clear();
        assertEquals(Squad.all().size(), 0);
}

    @Test
    public void getId_squadsInstantiateWithAnId_1() {
        Squad testCategory = new Squad("Home");
        assertEquals(1, testCategory.getId());
    }
    @Test
    public void find_returnsSquadWithSameId_secondSquad() {
        Squad.clear();
        Squad firstCategory = new Squad("Avengers");
        Squad secondCategory = new Squad("Defenders");
        assertEquals(Squad.find(secondCategory.getId()), secondCategory);
    }
    @Test
    public void getSquads_initiallyReturnsEmptyList_ArrayList() {
        Squad.clear();
        Squad testCategory = new Squad("Avengers");
        assertEquals(0, testCategory.getHeroes().size());
    }
    @Test
    public void addHero_addsHeroToList_true() {
        Squad testSquad = new Squad("Avengers");
        Hero testHero = new Hero("Superman",50,"Flight","Kryptonite", "Male");
        testSquad.addHero(testHero);
        assertTrue(testSquad.getHeroes().contains(testHero));
    }

    @Test
    public void find_returnsNullWhenNoHeroFound_null() {
        assertTrue(Squad.find(999) == null);
    }



}
