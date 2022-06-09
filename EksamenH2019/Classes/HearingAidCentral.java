package Classes;

import java.util.ArrayList;

/**
 * Class for the hearing aid central (a register of the HearingAid objects).
 */

public class HearingAidCentral {

    private ArrayList<HearingAid> hearingAidRegister;

    /**
     * Simple constructor that initializes an empty register for the hearing aids.
     * @param hearingAidRegister an arraylist containing the registered hearing aids.
     */
    public HearingAidCentral() {
        this.hearingAidRegister = new ArrayList<HearingAid>();
    }

    /**
     * Method to add a new hearing aid if it doesn't already exist.
     * @param newHearingAid the new hearing aid that is added to the register.
     */
    public void addHearingAid(HearingAid newHearingAid) {
        for (HearingAid hearingAids : this.hearingAidRegister) {
            if (hearingAids.getId() == newHearingAid.getId()) {
                throw new IllegalArgumentException("This ID number already exists in the register.");
            }
        }
        this.hearingAidRegister.add(newHearingAid);
    }

    /**
     * Method to find a HearingAid by its ID.
     * @param id the ID of the HearingAid we're searching for.
     * @return the HearingAid with the matching ID or a string explaining that the HearingAid does not exist.
     */
    public HearingAid getAidByID(int id) {
        for (HearingAid aid : this.hearingAidRegister) {
            if (aid.getId() == id) {
                return aid;
            }
        }

        throw new IllegalArgumentException("There are no registered hearing aids with this ID.");
    }

    /**
     * Method to rent out a hearing aid, as long as it isn't already rented by someone else.
     * @param aidForRent the hearing aid we're renting out.
     */
    public void rentOutHearingAid(int id, String rentersName) {
        HearingAid aid = getAidByID(id);

        if (aid.getRentalStatus() == true) {
            throw new IllegalArgumentException("This hearing aid is already rented out.");
        }

        aid.setRentalStatus(true);
        aid.setRentersName(rentersName);
    }

    /**
     * Method to register a returned hearing aid.
     * @param aidReturned the returned hearing aid.
     */
    public void returnHearingAid(int id) {
        HearingAid aid = getAidByID(id);

        if (aid.getRentalStatus() == false) {
            throw new IllegalArgumentException("The hearing aid has not been rented out.");
        }

        aid.setRentalStatus(false);
        aid.setRentersName("");
    }

    /**
     * Method to see the entire register of hearing aids with current rental status.
     * @return an arraylist of all hearing aids in the register.
     */
    public ArrayList<HearingAid> getFullRegister() {
        return hearingAidRegister;
    }

    /**
     * Method to find hearing aids of a given type.
     * @return an arraylist of hearing aids of the given type.
     * @param type the type of the hearing aid.
     */
    public ArrayList<HearingAid> getHearingAidsOfType(String type) {
        ArrayList<HearingAid> hearingAidsOfType = new ArrayList<HearingAid>();

        for (HearingAid typeOfAid : this.hearingAidRegister) {
            if (typeOfAid.getType() == type) {
                hearingAidsOfType.add(typeOfAid);
            }
        }
        return hearingAidsOfType;
    }

    /**
     * toString method for the HearingAidCentral.
     */
    public String toString() {
        String hearingAidCentralList = "";
        for(HearingAid hearingAidToString : this.hearingAidRegister) {
            hearingAidCentralList = hearingAidCentralList.concat(hearingAidToString.toString());
            hearingAidCentralList = hearingAidCentralList.concat("\n");
        }

        return hearingAidCentralList;
    }
}
