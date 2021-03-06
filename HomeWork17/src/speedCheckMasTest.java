import kype.nastya.speedCheckMas2;
import kype.nastya.speedCheckMas3;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static kype.nastya.speedCheckMas.speedCheckMas;

public class speedCheckMasTest {

    @Test
    public void testingFirstMet() {
        int[] speeds = {5,0,2};

        int expected = 2;
        int actual = speedCheckMas(new int[]{5,0,2});

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testingTwoMet() {
        int[] speeds = {5,0,2};

        int[] expected = {5,2};
        int[] actual = speedCheckMas2.speedCheckLosers(new int[]{5, 0, 2});

        Assertions.assertArrayEquals(expected,actual);

    }

    @Test
    public void testingThreeMet() {
        int[] speeds = {5,0,2};

        int[] expected = {0};
        int[] actual = speedCheckMas3.speedCheckWin(new int[]{5, 0, 2});

        Assertions.assertArrayEquals(expected,actual);

    }

}
