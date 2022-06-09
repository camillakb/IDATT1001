package Classes;

import java.time.LocalTime;

/**
 * Class containing the long jump results.
 */

public class LongJumpResult {

    private int startNumber;
    private String name;
    private double result; 
    private boolean faul;
    private LocalTime time;

    /**
     * Simple constructor that checks if the start number is valid (has to be an integer of three digits similar to the other athletes start numbers).
     * @param startNumber the athlete's start number.
     * @param name the name of the athlete.
     * @param result the result of the jump in metres.
     * @param faul the validity of the jump (true means faul jump, false means valid jump).
     * @param time the time of the jump in the format hours:minutes.
     */
    public LongJumpResult(int startNumber, String name, double result, boolean faul, LocalTime time) {
        if (startNumber < 100 || startNumber > 999) {
            throw new IllegalArgumentException("This start number is not valid, please enter a three digit number.");
        }

        this.startNumber = startNumber;
        this.name = name;
        this.result = result;
        this.faul = faul;
        this.time = time;
    }

    /**
     * Get-method for the athletes start number.
     * @return an integer that is the start number of the athlete.
     */
    public int getStartNumber() {
        return startNumber;
    }

    /**
     * Get-method for the athletes name.
     * @return a String that is the athletes name.
     */
    public String getName() {
        return name;
    }

    /**
     * Get-method for the result (length) of the jump in metres.
     * @return a double that is the result of the jump in metres.
     */
    public double getResult() {
        return result;
    }

    /**
     * Get-method for the time of the jump on the format HH:mm
     * @return the time of the jump.
     */
    public LocalTime getTime() {
        return time;
    }

    /**
     * Get-method to see if the jump is faul or not.
     * @return a boolean value; true if the jump is faul, false if its valid.
     */
    public boolean getFaul() {
        return faul;
    }

    /**
     * Set-method for the result so that it's possible to change the result in case of a new measurement.
     * @param result a double that is the result of the jump in metres.
     */
    public void setResult(double result) {
        this.result = result;
    }

    /**
     * Set-method for the validity of the jump in case of a new measurement that changes the current validity.
     * @param faul the faultiness of the jump.
     */
    public void setFaul(boolean faul) {
        this.faul = faul;
    }

    /**
     * toString method for LongJumpResult.
     */
    @Override
    public String toString() {
        String longJumpToString = "";
        String validity = faul ? "No" : "Yes";
        longJumpToString = longJumpToString.concat("\nStart number: " + getStartNumber() + "\nName of the athlete: " + getName());
        longJumpToString = longJumpToString.concat("\nResult (in metres): " + getResult() + "\nValid jump: " + validity);
        longJumpToString = longJumpToString.concat("\nTime of the jump: " + getTime());

        return longJumpToString;
    }
}