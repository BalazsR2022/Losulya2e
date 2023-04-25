import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import controllers.MainController;

public class TestWeight {
    MainController mc;// minden egyes metódusból látható lesz

    @BeforeEach // amit ebbe írok, az minden egyes teszt előtt le fog futni
    public void initEach() {
        mc = new MainController();// ez minden egyes metódus előtt végrehajtódik
    }

    // Első teszt
    @Test
    public void testcalcWeight01() {
        // egy teszt, nem teszt... több bemenő értékre is kell tesztet írni
        double actual = mc.calcWeight(30, 35);
        double expected = 2.6521848951755493;
        assertEquals(expected, actual);

    }

    @Test
    public void testCalcWeight02() {

        double actual = mc.calcWeight(130, 135);// kiszámoljuk előre több adattal, után megírjuk a tesztet kijavítva a számolt értékeket
        double expected = 192.0939631220005;
        assertEquals(expected, actual);
    }

    @Test
    public void testCalcWeight03() {

        double actual = mc.calcWeight(150, 160);// még egy teszt
        double expected = 303.1068451629199;
        assertEquals(expected, actual);
    }
}
