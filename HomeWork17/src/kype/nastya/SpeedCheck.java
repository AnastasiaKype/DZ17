package kype.nastya;

public class SpeedCheck {
    public static boolean isGreenLight = false;


    public static int speedCheckMas(int[] players) {

        int speedWin = 0;
        int sum = 0;

        if (isGreenLight == false) {
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
        int sum = speedCheckMas(players);
        int[] speeds = new int[sum];
        int i = 0;
        for (int player : players) {

            if (isGreenLight) {
                continue;
            } else {
                if (player != speedWin) {

                    speeds[i] = player;
                    i++;
                }
            }

        } return speeds;
    }


        public static int[] speedCheckWin ( int[] players) {
            int speedWin = 0;
            int sum = 0;
            for (int player : players) {
                if (isGreenLight) {
                    if (player >= speedWin) {
                        sum++;
                    }
                } else {
                    if (player > 0) {
                        continue;
                    } else {
                        if (player == 0) {
                            sum++;
                        }
                    }

                }
            }
            int[] speeds = new int[sum];
            int i = 0;
            for (int player : players) {
                if (isGreenLight) {
                    if (player >= speedWin) {
                        speeds[i] = player;
                        i++;
                    }
                } else {
                    if (player > 0) {
                        continue;
                    } else {
                        if (player == 0) {
                            speeds[i] = player;
                            i++;
                        }
                    }

                }
            } return speeds;
        }
    }


