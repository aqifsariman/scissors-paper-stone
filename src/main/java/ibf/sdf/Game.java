package ibf.sdf;

import java.util.Random;

public class Game {
    public Game() {
    }

    public int generateComputerChoice() {
        int minRange = 1;
        int maxRange = 4;
        Random random = new Random();
        return random.nextInt(minRange, maxRange);
    }

    public String checkWinner(int player, int computer) {
        String message = "";
        switch (player) {
            case 1:
                if (computer != player) {
                    if (computer == 2) {
                        message = "You've won!";
                    } else if (computer == 3) {
                        message = "You've lost!";
                    }
                } else
                    message = "It's a draw";
            case 2:
                if (computer != player) {
                    if (computer == 3) {
                        message = "You've won!";
                    } else if (computer == 1) {
                        message = "You've lost!";
                    }
                } else
                    message = "It's a draw";
            case 3:
                if (computer != player) {
                    if (computer == 1) {
                        message = "You've won!";
                    } else if (computer == 2) {
                        message = "You've lost!";
                    }
                } else
                    message = "It's a draw";
        }
        return message;
    }

}
