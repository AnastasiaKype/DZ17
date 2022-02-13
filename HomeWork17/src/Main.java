import kype.nastya.speedCheckMas2;
import kype.nastya.speedCheckMas3;

import java.util.Arrays;

import static kype.nastya.speedCheckMas.speedCheckMas;


public class Main {


    private static Object players;

    public static void main(String[] args) throws InterruptedException {


        int loserPlayers = speedCheckMas(new int[]{5, 0, 2});
        System.out.println(loserPlayers);

        int[] loserPlayer2 = speedCheckMas2.speedCheckLosers(new int[]{5, 0, 2});
        System.out.println(Arrays.toString(loserPlayer2));

        int[] WinPlayer2 = speedCheckMas3.speedCheckWin(new int[]{5, 0, 2});
        System.out.println(Arrays.toString(WinPlayer2));

    }





}

