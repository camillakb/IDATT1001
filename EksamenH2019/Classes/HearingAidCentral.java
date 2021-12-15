package Classes;

import java.util.ArrayList;

public class HearingAidCentral {

    private ArrayList<HearingAid> hearingAidRegister;

    /**
     * Simple constructor that initializes an empty register for the hearing aids.
     * @param hearingAidRegister - an arraylist containing the registered hearing aids.
     */
    public HearingAidCentral() {
        this.hearingAidRegister = new ArrayList<HearingAid>();
    }

    /**
     * Method to add a new hearing aid if it doesn't already exist.
     * @param newHearingAid - the new hearing aid that is added to the register.
     */
    public void addHearingAid(HearingAid newHearingAid) {
        for (HearingAid hearingAids : this.hearingAidRegister) {
            if (hearingAids.getId() == newHearingAid.getId()) {
                throw new IllegalArgumentException("ID-nummeret finnes allerede i registeret.");
            }
        }
        this.hearingAidRegister.add(newHearingAid);
    }

    public HearingAid getAidByID(int id) {
        for (HearingAid aid : this.hearingAidRegister) {
            if (aid.getId() == id) {
                return aid;
            }
        }

        throw new IllegalArgumentException("Hjelpemiddelet med dette ID-nummeret eksisterer ikke.");
    }

    /**
     * Method to rent out a hearing aid, as long as it isn't already rented by someone else.
     * @param aidForRent - the hearing aid we're renting out.
     */
    public void rentOutHearingAid(int id, String rentersName) {
        HearingAid aid = getAidByID(id);

        if (aid.getRentalStatus() == true) {
            throw new IllegalArgumentException("Hjelpemiddelet er allerede utleid.");
        }

        aid.setRentalStatus(true);
        aid.setRentersName(rentersName);
    }

    /**
     * Method to register a returned hearing aid.
     * @param aidReturned - the returned hearing aid.
     */
    public void returnHearingAid(int id) {
        HearingAid aid = getAidByID(id);

        if (aid.getRentalStatus() == false) {
            throw new IllegalArgumentException("Hjelpemiddelet har ikke vært utleid.");
        }

        aid.setRentalStatus(false);
        aid.setRentersName("");
    }

    /**
     * Method to see the entire register of hearing aids with current rental status.
     * @return - returns an arraylist of all hearing aids in the register.
     */
    public ArrayList<HearingAid> getFullRegister() {
        return hearingAidRegister;
    }

    /**
     * Method to find hearing aids of a given type.
     * @return - returns an arraylist of hearing aids of the given type.
     * @param type - the type of the hearing aid.
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

    public String toString() {
        String hearingAidCentralList = "";
        for(HearingAid hearingAidToString : this.hearingAidRegister) {
            hearingAidCentralList = hearingAidCentralList.concat(hearingAidToString.toString());
            hearingAidCentralList = hearingAidCentralList.concat("\n");
        }

        return hearingAidCentralList;
    }



    
}
