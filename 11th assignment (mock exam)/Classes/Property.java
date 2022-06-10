package Classes;

/**
 * Class to initialize a Property object with relevant methods.
 */

public class Property {
    
    String municipalityName;
    String name;
    String nameOfOwner;
    int municipalitynr;
    int lotNumber;
    int sectionNumber;
    double area;
   
    /**
     * Simple constructor that checks if the municipality number, lot number and section number is valid.
     * @param municipalitynr municipality number for the municipality the property is in.
     * @param municipalityName name of the municipality that the property is in.
     * @param lotNumber the property's lot number.
     * @param sectionNumber the property's section number.
     * @param name name of the property (the property doesn't always have a name).
     * @param area area of the property.
     * @param nameOfOwner name of the property's owner.
     */
    public Property(int municipalitynr, String municipalityName, int lotNumber, int sectionNumber, String name, double area, String nameOfOwner) {
        if (municipalitynr < 101 || municipalitynr > 5054) {
            throw new IllegalArgumentException("Municipality number must be between 101 and 5054.");
        }

        if (lotNumber < 0) {
            throw new IllegalArgumentException("Lot number must be a positive integer.");
        }

        if (sectionNumber < 0) {
            throw new IllegalArgumentException("Section number must be a positive integer.");
        }
        
        this.municipalitynr = municipalitynr;
        this.municipalityName = municipalityName;
        this.lotNumber = lotNumber;
        this.sectionNumber = sectionNumber;
        this.name = name;
        this.area = area;
        this.nameOfOwner = nameOfOwner;
    }

    /**
     * Get-method for the property's municipality number.
     * @return an integer that is the municipality number.
     */
    public int getMunicipalitynr() {
        return municipalitynr;
    }

    /**
     * Get-method for the municipality name the property is in.
     * @return a String that is the name of the municipality that the property is in.
     */
    public String getMunicipalityName() {
        return municipalityName;
    }

    /**
     * Get-method for the property's lot number.
     * @return an integer that is the lot number of the property.
     */
    public int getLotNumber() {
        return lotNumber;
    }

    /**
     * Get-method for the property's section number.
     * @return an integer that is the section number of the property.
     */
    public int getSectionNumber() {
        return sectionNumber;
    }

    /**
     * Get-method for the property's name.
     * @return a String that is the name of the property.
     */
    public String getName() {
        return name;
    }

    /**
     * Get-method for the property's area.
     * @return a double that is the area of the property.
     */
    public double getArea() {
        return area;
    }

    /**
     * Get-method for the name of the property's owner.
     * @return a String that is the name of the property's owner.
     */
    public String getNameOfOwner() {
        return nameOfOwner;
    }


    /**
     * Set-methods for only the property name and name of the property's owner.
     * Chosen because these are the most likely to be changed.
     */

    /**
     * Set-method that changes the name of the property.
     * @param name name of the property.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Set-method that changes the name of the property's owner.
     * @param nameOfOwner name of the property's owner.
     */
    public void setNameOfOwner(String nameOfOwner) {
        this.nameOfOwner = nameOfOwner;
    }

    /**
     * Method to return property ID in the format: muncipalitynr-lotNumber/sectionNumber.
     * @return the property's ID.
     */
    public String getID() {
        String propertyID = "";
        propertyID = propertyID.concat(getMunicipalitynr() + "-" + getLotNumber() + "/" + getSectionNumber());

        return propertyID;
    }

    /**
     * ToString method for the property object.
     */
    public String toString() {
        String propertyToString = "";
        propertyToString = propertyToString.concat("Municipality number and name: " + getMunicipalitynr() + " " + getMunicipalityName());
        propertyToString = propertyToString.concat("\nLot number: " + getLotNumber() + ". \nSection number: " + getSectionNumber());
        propertyToString = propertyToString.concat("\nProperty name: " + getName() + ". \nArea: " + getArea());
        propertyToString = propertyToString.concat("\nOwner of the property: " + getNameOfOwner() + "\n");

        return propertyToString;
    }
}