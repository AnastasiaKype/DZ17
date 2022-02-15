package kype.nastya;


public class speedCheckMas3 {
    public static boolean isGreenLight = false;



    public static int[] speedCheckWin(int[] players) {
        int speedWin = 0;
        int sum = 0;

        for (int player : players) {
            if (player <= speedWin) {
                sum++;
            }

        }

        int[] speeds = new int[sum];
        int i = 0;
        for (int player : players) {
            if (player <= speedWin) {
                speeds[i] = player;
                i++;
            }

        } return speeds;
    }
}

