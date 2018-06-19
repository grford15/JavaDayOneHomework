import junit.framework.TestCase;
import org.junit.Test;

public class TestWaterbottle {

    @Test
    public void waterbottleHasVolume(){
        Waterbottle waterbottle = new Waterbottle(100);
        TestCase.assertEquals(100, waterbottle.volume());
    }

    @Test
    public void waterbottleHasDrink(){
        Waterbottle waterbottle = new Waterbottle(100);
        TestCase.assertEquals(90, waterbottle.drink(10));
    }

    @Test
    public void waterbottleCanEmpty(){
        Waterbottle waterbottle = new Waterbottle(100);
        waterbottle.empty();
        TestCase.assertEquals(0, waterbottle.volume());
    }

    @Test
    public void waterbottleCanRefill(){
        Waterbottle waterbottle = new Waterbottle(0);
        waterbottle.refill();
        TestCase.assertEquals(100, waterbottle.volume());
    }
}
