import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class SquadTest {
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    public Squad setupSquad(){
        return new Squad(2, "Vybo", "Fight cybercrime");
    }

    @Test
    public void NewSquadObjectGetsCorrectlyCreated_true() throws Exception{
        Squad squad = new Squad(2, "Vybo", "Fight cybercrime");
        assertEquals(true, squad instanceof Squad);
    }
    @Test
    public void SquadInstantiatesWithMaxSize_true() {
        Squad squad = setupSquad();
        assertEquals(2, squad.getMaxSize());
    }

    @Test
    public void SquadInstantiatesWithName_true() {
        Squad squad = setupSquad();
        assertEquals("Vybo", squad.getName());
    }

}