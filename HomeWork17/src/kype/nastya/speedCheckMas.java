package kype.nastya;


public class speedCheckMas {
    public static boolean isGreenLight = false;


    public static int speedCheckMas(int[] players) {

        int speedWin = 0;
        int sum = 0;

        for (int player : players) {
            if (player != speedWin) {
                sum++;
            }



        } return sum;
    }
}


