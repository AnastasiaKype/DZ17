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
        int[] players = {5,0,2};
        SpeedCheck.isGreenLight = false;

        int[] expected = {5,2};
        int[] actual = SpeedCheck.speedCheckLosers(players);

        Assertions.assertArrayEquals(expected,actual);

    }

    @Test
    public void testingThreeMet() {
        int[] players = {5,0,2};
        SpeedCheck.isGreenLight = false;

        int[] expected = {0};
        int[] actual = SpeedCheck.speedCheckWin(players);

        Assertions.assertArrayEquals(expected,actual);

    }

}
