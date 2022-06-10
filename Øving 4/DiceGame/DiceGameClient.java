package DiceGame;

/**
 * Client that simulates a dice game. The goal of the game is to reach exactly 100 points by rolling a dice and adding or subtracting 
 * the values on the dice.
 */

public class DiceGameClient {
    public static void main(String[] args){
        DiceGamePlayer playerOne = new DiceGamePlayer();
        DiceGamePlayer playerTwo = new DiceGamePlayer();

        int round = 1;

        while (!playerOne.isFinished() && !playerTwo.isFinished()) {
            playerOne.rollDice();
            playerTwo.rollDice();
            System.out.printf("%d. round: \nPlayer 1: %d \nPlayer 2: %d\n\n", round, playerOne.getPoints(), playerTwo.getPoints());
            round++;
        }
    }
}
