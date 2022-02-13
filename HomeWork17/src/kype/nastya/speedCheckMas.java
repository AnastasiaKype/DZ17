package kype.nastya;


public class speedCheckMas {
    public static boolean isGreenLight = false;


    public static int speedCheckMas(int[] players) {

        int[] speeds = new int[3];


        speeds[0] = 5;
        speeds[1] = 0;
        speeds[2] = 2;


        int i = 0;
        int numbersOfPlayers = 0;

        if (isGreenLight == true) {

            System.out.println("Выбывших:" + numbersOfPlayers);
        } else {
            while (i <= 2) {
                if (speeds[i] > 0) {
                    numbersOfPlayers = numbersOfPlayers + 1;
                    i++;

                } else {
                    numbersOfPlayers = numbersOfPlayers ;
                } i++;

            }

        }
        return numbersOfPlayers;

    }

}