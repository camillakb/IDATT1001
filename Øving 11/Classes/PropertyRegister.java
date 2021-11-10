package Classes;

import java.util.ArrayList;

public class PropertyRegister {

    private ArrayList<Property> properties;
    
    /**
     * Simple constructor.
     * Initializes an empty registry for properties.
     */
    public PropertyRegister() {
        this.properties = new ArrayList<Property>();
    }

    /**
     * Method to add a new property that checks if the property ID already exists before adding it.
     * @param newProperty - new property that is added to the property register.
     */
    public void addProperty(Property newProperty) {
        if (findProperty(newProperty.getMunicipalitynr(), newProperty.getLotNumber(), newProperty.getSectionNumber()) != null) {
            throw new IllegalArgumentException("Property ID already exists.");
        }
        this.properties.add(newProperty);
    }

    /**
     * Method to remove property.
     * @param property - property that is being removed.
     */
    public void removeProperty(Property property) {
        properties.remove(property);
    }

    /**
     * Method to check the number of properties in the register. 
     * @return returns an integer that is the amount of properties in the register.
     */
    public int numberOfProperties() {
        return properties.size();
    }

    /**
     * Method to find property by property ID number.
     * @param municipalityNumber - the municipality number of the property.
     * @param lotNumber - the lot number of the property.
     * @param sectionNumber - the section number of the property.
     * @return returns the property that matches the ID number.
     */
    public Property findProperty(int municipalityNumber, int lotNumber, int sectionNumber) {
        String searchProperty = String.format("%d-%d/%d", municipalityNumber, lotNumber, sectionNumber);
        for (Property property : this.properties) {
            if (searchProperty.equals(property.getID())) {
                return property;
            }
        }

        return null;
    }

    /**
     * Task 3b). Method to get average area for all properties in the register.
     * @return returns a double that is the average area of all the properties in the register in square metres.
     */
    public double getAverageArea() {
        double sum = 0;

        for (Property property : this.properties) {
            sum += property.getArea();
        }

        return sum / numberOfProperties();
    }

    /**
     * Task 3c). Method to find property by lot number.
     * @param lotNr - lot number of the property.
     * @return returns a list of properties that has a certain lot number.
     */
    public ArrayList<Property> getPropertiesWithLotNr(int lotNr) {
        ArrayList<Property> listOfProperties = new ArrayList<Property>();

        for (Property property : this.properties) {
            if (property.getLotNumber() == lotNr) {
                listOfProperties.add(property);
            }
        }

        return listOfProperties;
    }

    public String toString() {
        String propertylist = "";
        for (Property property : this.properties) {
            propertylist = propertylist.concat(property.toString());
            propertylist = propertylist.concat("\n");
        }

        return propertylist;
    }


    
}
