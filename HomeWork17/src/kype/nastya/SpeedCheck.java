package kype.nastya;

public class SpeedCheck {
    public static boolean isGreenLight = false;


    public static int speedCheckMas(int[] players) {

        int speedWin = 0;
        int sum = 0;

        if (isGreenLight = true) {
            for (int player : players) {
                if (player != speedWin) {
                    sum++;
                }

            }
            return sum;
        } else {
            for (int player : players) {
                sum++;
            }
        }
        return sum;

    }

    public static int[] speedCheckLosers(int[] players) {
        int speedWin = 0;
        int sum = 0;

        if (isGreenLight = true) {
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

            }
            return speeds;
        } else {
            for (int player : players) {
                sum++;
            }
        }
        return new int[]{sum};
    }


    public static int[] speedCheckWin(int[] players) {
        int speedWin = 0;
        int sum = 0;

        if (isGreenLight = true) {
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

            }
            return speeds;
        } else {
            for (int player : players) {
                sum++;
            }
        }
        return new int[]{sum};

    }

}


