package kype.nastya;

public class SpeedCheck {
    public static boolean isGreenLight = false;


    public static int speedCheckMas(int[] players) {
        int sum = 0;

            for (int i = 0; i != players.length; i++) {
                if (loserOrWinner(players[i])) {
                    sum++;
                }

            }
        return sum;

    }

    public static boolean loserOrWinner (int players) {
        if (isGreenLight == false) {
            if (players != 0) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }

    }

    public static int[] speedCheckLosers(int[] players) {

        int sum = speedCheckMas(players);
        int[] speeds = new int[sum];
        int cnt = 0;
        for (int i = 0; i != players.length; i++) {
            if (loserOrWinner(players[i])) {
                speeds[cnt] = players[i];
                cnt++;
            }
        }
        return speeds;
    }


    public static int[] speedCheckWin(int[] players) {
        int cnt = 0;
        int length = players.length - speedCheckMas(players);
        int[] speeds = new int[length];
        for (int i = 0; i != players.length; i++) {
            if (loserOrWinner(players[i]) == false) {
                speeds[cnt] = players[i];
                cnt++;
            }

        }
        return speeds;
    }
}


