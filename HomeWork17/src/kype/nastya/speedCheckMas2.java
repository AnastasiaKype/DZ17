package kype.nastya;

import static kype.nastya.speedCheckMas.speedCheckMas;

public class speedCheckMas2 {
    public static boolean isGreenLight = false;


    public static int[] speedCheckLosers(int[] players) {
        int[] speeds = new int[3];


        speeds[0] = 5;
        speeds[1] = 0;
        speeds[2] = 2;

        int sum = 0;
        int i = 0;


        for (i = 0; i < 3; i++) {
            if (speeds[i] != 0) {
                sum++;

                int[] cnt = new int[sum];
                int x = 0;
                if (speeds[i] != 0) {
                    sum++;
                    cnt = players;
                    x++;
                }
            }
        }

        return players;
    }
}