public class SpeedsGames {

    public static boolean isGreenLight = false;


    public static int speedCheckMas (int[] players) {

        int[] speeds = new int[3];

        speeds[0] = 5;
        speeds[1] = 0;
        speeds[2] = 2;


        int i = 0;
        int numbersOfPlayers = 0;

        while (i <= 2) {
            if (speeds[i] > 0) {
                numbersOfPlayers = numbersOfPlayers + 1;
                i++;

            } else {
                numbersOfPlayers = numbersOfPlayers ;
            } i++;

        } return numbersOfPlayers;

        int[] players = new int[numbersOfPlayers];

    }


}


