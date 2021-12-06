package Classes;

import java.util.ArrayList;
import java.time.LocalDate;

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
     * Method to add an entry to the covid registry.
     */
    public void addCovidRegistry(CovidStats newCovidStats) { //Legg inn for å sjekke om dato allerede er tatt?
        this.covidStatsRegistered.add(newCovidStats);
    }


    /**
     * Method to find a covid registry at a given date.
     * @param date - date of the registry.
     * @return returns a list of registries at a given date.
     */
    public CovidStats getCovidStatsAtDate(LocalDate date) { //Dobbeltsjekk.  

        for (CovidStats statsDate : this.covidStatsRegistered) {
            if (date.equals(statsDate.getDate())) {
                return statsDate;
            }
        }
        
        return null;
    }


    /**
     * Method to print a list of covid registries after a given date.
     * @param date - date of the registry.
     * @return returns a list of registries after a given date.
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


    public ArrayList<CovidStats> getStats() {
        return covidStatsRegistered;
    }


    /**
     * Method to check the number of registries in covidStatsRegister.
     * @return returns an integer that is the number of registries in covidStatsRegister.
     */
    public int numberOfRegistries() {
        return covidStatsRegistered.size();
    }


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
     * @return returns an integer that is the sum of deaths in a given country.
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
     * @return returns an integer that is the total number of deaths.
     */
    public int totalNumberOfDeaths() {
        int sum = 0;

        for (CovidStats totalDeathsByCovid : this.covidStatsRegistered) {
            sum += totalDeathsByCovid.getDeaths();
        }

        return sum;
    }


    public String toString() {
        String covidStatslist = "";
        for (CovidStats covidStatsToString : this. covidStatsRegistered) {
            covidStatslist = covidStatslist.concat(covidStatsToString.toString());
            covidStatslist = covidStatslist.concat("\n");
        }

        return covidStatslist;
    }

}
