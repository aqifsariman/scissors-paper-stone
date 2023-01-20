package ibf.sdf;

import java.util.Random;
import java.util.Scanner;

public final class App {
    public static void main(String[] args) {
        int player;
        String message = "";
        Game game = new Game();
        int computer = game.generateComputerChoice();

        Scanner scanner = new Scanner(System.in);
        System.out.println("------ Scissors Paper Stone ------");
        System.out.println("Choose wisely. 1) Scissors 2) Paper 3) Stone");
        System.out.println("Press 0 to quit.");
        while (message.equals("")) {
            System.out.print("> ");
            player = scanner.nextInt();
            message = game.checkWinner(player, computer);
            System.out.println(message);
        }

    }
}
