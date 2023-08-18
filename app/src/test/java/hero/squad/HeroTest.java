import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class HeroTest {
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {

    }
   @Test
   public void NewHeroObjectGetsCorrectlyCreated_true() throws Exception{
       ArrayList<String> powers = new ArrayList<String>();
       ArrayList<String> weaknesses = new ArrayList<String>();
       powers.add("fly");
       powers.add("super strength");
       weaknesses.add("Impatience");
       weaknesses.add("Lazy");

       Hero hero = new Hero("Nick",25,powers,weaknesses,1);
       assertEquals(true, hero instanceof Hero);
   }
    public Hero setupNewHero() throws Exception{
        ArrayList<String> powers = new ArrayList<String>();
        ArrayList<String> weaknesses = new ArrayList<String>();
        powers.add("Fly");
        powers.add("super strength");
        weaknesses.add("Impatience");
        weaknesses.add("Lazy");

        Hero hero = new Hero("Nick",25,powers,weaknesses,1);
        return  hero;
    }

    public Hero setupAnotherHero() throws Exception{
        ArrayList<String> powers = new ArrayList<String>();
        ArrayList<String> weaknesses = new ArrayList<String>();
        powers.add("Fly");
        powers.add("super strength");
        weaknesses.add("Impatience");
        weaknesses.add("Lazy");

        Hero anotherHero = new Hero("Spider",30,powers,weaknesses,1);

        return  anotherHero;
    }

   @Test
   public void HeroInstanceWithPowers_true() throws Exception{
       Hero hero = setupNewHero();
       assertTrue(hero.getPowers().contains("Fly"));
   }
    @Test
    public void HeroInstanceWithName_true() throws Exception{
        Hero hero = setupNewHero();
        assertEquals("Nick",hero.getName());
    }

    @Test
    public void HeroInstanceWithAge_true() throws Exception{
        Hero hero = setupNewHero();
        assertEquals(25,hero.getAge());
    }
    @Test
    public void HeroInstanceWithWeaknesses_true() throws Exception{
        Hero hero = setupNewHero();
        assertTrue(hero.getWeaknesses().contains("Lazy"));
    }

}
