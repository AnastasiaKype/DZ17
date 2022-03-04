import kype.nastya.SpeedCheck;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



public class speedCheckMasTest {

    @Test
    public void testingFirstMet() {
        int[] speeds = {5,0,2};

        int expected = 2;
        int actual = SpeedCheck.speedCheckMas(speeds);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testingTwoMet() {
        int[] speeds = {5,0,2};

        int[] expected = {5,2};
        int[] actual = SpeedCheck.speedCheckLosers(speeds);

        Assertions.assertArrayEquals(expected,actual);

    }

    @Test
    public void testingThreeMet() {
        int[] speeds = {5,0,2};

        int[] expected = {0};
        int[] actual = SpeedCheck.speedCheckWin(speeds);

        Assertions.assertArrayEquals(expected,actual);

    }

}
