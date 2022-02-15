package kype.nastya;


import static kype.nastya.speedCheckMas.speedCheckMas;


public class speedCheckMas2 {
    public static boolean isGreenLight = false;


    public static int[] speedCheckLosers(int[] players) {
        int speedWin = 0;
        int sum = 0;

        for (int player : players) {
            if (player != speedWin) {
                sum++;
            }

        }

        int[] speeds = new int[sum];
        int i = 0;
        for (int player : players) {
            if (player != speedWin) {
                speeds[i] = player;
                i++;
            }

        } return speeds;

    }
}

