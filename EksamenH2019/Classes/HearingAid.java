package Classes;

/**
 * Class for hearing aids containing relevant attributes and methods.
 */

public class HearingAid {
    private int id;
    private String type;
    private boolean rentalStatus;
    private String rentersName;

    /**
     * A simple constructor with the appropriate values for the class.
     * @param id the hearing aid's ID.
     * @param type the hearing aid's type.
     * @param rentalStatus the hearing aid's rental status.
     * @param rentersName the name of the person renting the hearing aid.
     */
    public HearingAid(int id, String type, boolean rentalStatus, String rentersName) {
        this.id = id;
        this.type = type;
        this.rentalStatus = rentalStatus;
        this.rentersName = rentersName;
    }

    /**
     * Get method for the ID of the hearing aid.
     * @return an integer which is the ID of the hearing aid.
     */
    public int getId() {
        return id;
    }

    /**
     * Get method for the type of the hearing aid.
     * @return a string of the type of the hearing aid.
     */
    public String getType() {
        return type;
    }

    /**
     * Get method for the rental status of the hearing aid.
     * @return a boolean of the rental status of the hearing aid.
     */
    public boolean getRentalStatus() {
        return rentalStatus;
    }

    /**
     * Get method for the renters name.
     * @return a string of the renters name.
     */
    public String getRentersName() {
        return rentersName;
    }

    /**
     * Set method to change the rental status of the hearing aid.
     * @param rentalStatus rental status of the hearing aid.
     */
    public void setRentalStatus(boolean rentalStatus) {
        this.rentalStatus = rentalStatus;
    }

    /**
     * Set method to set the name of the person renting the hearing aid.
     * @param rentersName name of the person renting the hearing aid.
     */
    public void setRentersName(String rentersName) {
        this.rentersName = rentersName;
    }


    /**
     * Method that compares two objects of the type HearingAid. The objects are equal if their ID is the same.
     * @param other the object to compare.
     * @return a boolean, true if the objects are equal, false if not.
     */
    boolean compare(HearingAid other) {
        if (this == other) {
            return true;
        }

        if (other == null || getClass() != other.getClass()) {
            return false;
        }

        HearingAid that = (HearingAid) other;
        return getId() == that.getId();
    }

    /**
     * A toString method that returns the information in the format given in the task, with information
     * about the hearing aid's rental status.
     * @return a string with information about hearing aid.
     */
    public String toString() {
        String hearingAidToString = "";
        String currentStatus = rentalStatus ? "Rented out" : "Available";
        hearingAidToString = hearingAidToString.concat(getId() + " " + getType() + " " + currentStatus);
            
            if(rentalStatus) {
                hearingAidToString += " til " + getRentersName();
            }

        return hearingAidToString;
    }
}
    