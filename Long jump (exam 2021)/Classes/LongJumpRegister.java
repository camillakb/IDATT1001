package Classes;

import java.util.ArrayList;

/**
 * Class containing an ArrayList (a register) of LongJumpResult with relevant methods.
 */

public class LongJumpRegister {

    private ArrayList<LongJumpResult> listOfLongJumps;

    /**
     * Simple constructor that initializes an empty registry for the result of the long jumps.
     * @param listOfLongJumps register of long jump results.
     */
    public LongJumpRegister() {
        this.listOfLongJumps = new ArrayList<LongJumpResult>();
    }

    /**
     * Method that prints all registries in longJumpRegister.
     * @return all entries in longJumpRegister.
     */
    public ArrayList<LongJumpResult> getAllResults() {
        return this.listOfLongJumps;
    }

    /**
     * Method that shows the best registered result.
     * @return the LongJumpResult object with the best result.
     */
    public LongJumpResult getBestResult(){
        if (this.listOfLongJumps.size() == 0) {
            return null;
        }
        LongJumpResult bestResult = this.listOfLongJumps.get(0);

        for (LongJumpResult result : this.listOfLongJumps) {
            if (result.getResult() > bestResult.getResult()) {
                bestResult = result;
            }
        }
        return bestResult;
    }

    /**
     * Method that shows the best registered result that is valid.
     * @return the LongJumpResult object with the best valid result.
     */
    public LongJumpResult getBestValidResult() {
        LongJumpResult bestValidResult = null;

        for (LongJumpResult result : this.listOfLongJumps) {
            if (bestValidResult == null && !result.getFaul()){
                bestValidResult = result;
            }
            if (result.getResult() > bestValidResult.getResult() && !result.getFaul()) {
                bestValidResult = result;
            }
        }
        return bestValidResult;
    }

    /**
     * Search for registered jump results from a given athlete.
     * @param name the name of the athlete.
     * @return an arraylist of the registered jumps for the athlete.
     */
    public ArrayList<LongJumpResult> getResultsFromAthlete(String name) {
        ArrayList<LongJumpResult> listOfResultsFromAthlete = new ArrayList<LongJumpResult>();

        for (LongJumpResult result : this.listOfLongJumps) {
            if (result.getName().equals(name)) {
                listOfResultsFromAthlete.add(result);
            }
        }
        return listOfResultsFromAthlete;
    }

    /**
     * Method to calculate the average length of all registered results.
     * @return a double that is the average length of the results.
     */
    public double getAverageResult() {
        double sum = 0;

        for (LongJumpResult result : this.listOfLongJumps) {
            sum += result.getResult();
        }

        return sum / this.listOfLongJumps.size();
    }

    /**
     * Method to add a new long jump result to the registry.
     */
    public void addLongJump(LongJumpResult newLongJumpResult) {
        this.listOfLongJumps.add(newLongJumpResult);
    }
    

    /**
     * toString method for LongJumpRegister.
     */
    @Override
    public String toString() {
        String longJumpRegisterToString = "";
        
        for (LongJumpResult longJumpToString : this.listOfLongJumps) {
            longJumpRegisterToString = longJumpRegisterToString.concat(longJumpToString.toString());
            longJumpRegisterToString = longJumpRegisterToString.concat("\n");
        }

        return longJumpRegisterToString;
    }
}
