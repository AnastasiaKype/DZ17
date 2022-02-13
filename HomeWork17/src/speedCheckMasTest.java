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

}
