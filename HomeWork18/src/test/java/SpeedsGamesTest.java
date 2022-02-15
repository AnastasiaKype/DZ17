import org.junit.jupiter.api.Test;

public class SpeedsGamesTest {
    public void speedCheck1() {
        SpeedsGames.isGreenLight = false;

        int expected = 2;
        int actual = SpeedsGames.speedCheckMas({5,0,2});


    }


}
