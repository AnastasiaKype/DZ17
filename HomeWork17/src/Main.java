import kype.nastya.speedCheckMas;

public class Main {


    private static int[] numbersOfPlayers;

    public static void main(String[] args) {

        int losePlayers = speedCheckMas.speedCheckMas(numbersOfPlayers);
        System.out.println("Выбывших " + losePlayers);


    }
}

