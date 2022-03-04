import kype.nastya.SpeedCheck;


import java.util.Arrays;

import static kype.nastya.SpeedCheck.speedCheckMas;


public class Main {


    private static Object players;


    public static void main(String[] args) throws InterruptedException {


        int[] players = {5,0,2};
        int loserPlayers = SpeedCheck.speedCheckMas(players);
        System.out.println(loserPlayers);

        int[] loserPlayer2 = SpeedCheck.speedCheckLosers(players);
        System.out.println(Arrays.toString(loserPlayer2));

        int[] WinPlayer2 = SpeedCheck.speedCheckWin(players);
        System.out.println(Arrays.toString(WinPlayer2));

    }


}

