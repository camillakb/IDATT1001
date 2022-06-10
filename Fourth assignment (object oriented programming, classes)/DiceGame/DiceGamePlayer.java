package DiceGame;
import java.util.Random;

/**
 * Class containing information and relevant methods for the DiceGamePlayer object.
 */

public class DiceGamePlayer {
    private int points;
    private Random dice;
    
    /**
     * Simple constructor to initialize a DiceGamePlayer object.
     */
    public DiceGamePlayer() {
        this.points = 0;
        this.dice = new Random();
    }

    /**
     * Get-method for a player's points.
     * @return the player's points.
     */
    public int getPoints() {
        return this.points;
    }
    
    /**
     * Method to simulate a dice roll. The value of the dice roll is added to the player's points as long as the value of points is less 
     * than 100, and subtracts if the value is above 100. 
     */
    public void rollDice() {
        int diceRoll = this.dice.nextInt(6) + 1;

        if (diceRoll == 1) {
            this.points = 0;
        
        } else if (this.points > 100) {
            this.points -= diceRoll;
        
        } else {
            this.points += diceRoll;
        }
    }
    
    /**
     * Method to check if the player is finished. A player is finished if the sum of points is exactly 100.
     * @return a boolean value, true if the player is finished, false if not.
     */
    public boolean isFinished() {
        return this.points == 100;
    }
}
