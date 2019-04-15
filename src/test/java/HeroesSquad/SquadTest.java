package HeroesSquad;
import org.junit.*;
import static org.junit.Assert.*;

public class SquadTest {
    @Test
    public void squad_instantiatesCorrectly_true() {
        Squad testCategory = new Squad("Avengers");
        assertEquals(true, testCategory instanceof Squad);
    }
}
