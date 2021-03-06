package Classes;

import java.util.ArrayList;
import java.time.LocalDate;

/**
 * Clas to initialize CovidStatsRegister with relevant methods.
 */

public class CovidStatsRegister {

    private ArrayList<CovidStats> covidStatsRegistered;

    /**
     * Simple constructor.
     * Initializes an empty registry for covid statistics.
     */
    public CovidStatsRegister() {
        this.covidStatsRegistered = new ArrayList<CovidStats>();
    }
    
    /**
     * Method to add new CovidStats to the registry.
     * @param newCovidStats the CovidStats that will be added to the registry.
     */
    public void addCovidRegistry(CovidStats newCovidStats) { 
        this.covidStatsRegistered.add(newCovidStats);
    }

    /**
     * Method to find a covid registry at a given date.
     * @param date date of the registry.
     * @return a list of registries at a given date.
     */
    public CovidStats getCovidStatsAtDate(LocalDate date) { 

        for (CovidStats statsDate : this.covidStatsRegistered) {
            if (date.equals(statsDate.getDate())) {
                return statsDate;
            }
        }
        
        return null;
    }

    /**
     * Method to print a list of covid registries after a given date.
     * @param date date of the registry.
     * @return a list of registries after a given date.
     */
    public ArrayList<CovidStats> getCovidStatsAfterDate(LocalDate date) {
        ArrayList<CovidStats> statsAfterDate = new ArrayList<CovidStats>();

        for (CovidStats stats : this.covidStatsRegistered) {
            if (date.isBefore(stats.getDate())) {
                statsAfterDate.add(stats);
            }
        }
        
        return statsAfterDate;
    }

    /**
     * Method to get all registered statistics.
     * @return a list of CovidStats.
     */
    public ArrayList<CovidStats> getStats() {
        return covidStatsRegistered;
    }

    /**
     * Method to check the number of registries in covidStatsRegister.
     * @return an integer that is the number of registries in covidStatsRegister.
     */
    public int numberOfRegistries() {
        return covidStatsRegistered.size();
    }

    /**
     * Method to get the number of infected people in a country.
     * @param country the country to view for number of infected people.
     * @return the number of infected people in the desired country.
     */
    public int numberOfInfectedInCountry(String country) {
        int sum = 0;
        
        for (CovidStats dataPoint : this.covidStatsRegistered) {
            if (dataPoint.getCountry().equals(country)) {
                sum += dataPoint.getInfected();
            }
        }

        return sum;
    }

    /**
     * Method to find the sum of deaths by covid in a given country.
     * @return an integer that is the sum of deaths in a given country.
     */
    public int numberOfDeathsInCountry(String country) {
        int sum = 0;
        
        for (CovidStats dataPoint : this.covidStatsRegistered) {
            if (dataPoint.getCountry().equals(country)) {
                sum += dataPoint.getDeaths();
            }
        }

        return sum;
    }

    /**
     * Method to see total number of deaths by covid.
     * @return an integer that is the total number of deaths.
     */
    public int totalNumberOfDeaths() {
        int sum = 0;

        for (CovidStats totalDeathsByCovid : this.covidStatsRegistered) {
            sum += totalDeathsByCovid.getDeaths();
        }

        return sum;
    }

    /**
     * ToString method for the CovidStatsRegister object.
     */
    public String toString() {
        String covidStatslist = "";
        
        for (CovidStats covidStatsToString : this. covidStatsRegistered) {
            covidStatslist = covidStatslist.concat(covidStatsToString.toString());
            covidStatslist = covidStatslist.concat("\n");
        }

        return covidStatslist;
    }
}
