package Classes;
import java.time.LocalDate;

public class CovidStats { 
    private String country;
    private int infected;
    private int deaths;
    private LocalDate date;
    LocalDate earliestDate = LocalDate.parse("2019-12-31");

/**
 * Simple constructor that checks if the registered date is valid (task 3b)
 * @param country - the country that is being registered
 * @param date - date of the day being registered
 * @param infected - number of people infected by covid at registered date
 * @param deaths - number of deaths caused by covid at registered day
 */

    public CovidStats(String country, LocalDate date, int infected, int deaths) {
        if (date.isBefore(earliestDate)) {
            throw new IllegalArgumentException("Invalid date, please enter a date after 2019-12-31");
        }

        if (date.isAfter(earliestDate)) {
            this.country = country;
            this.date = date;
            this.infected = infected;
            this.deaths = deaths;
        }
    }

    /**
     * @return returns a string containing the name of the country
     */
    public String getCountry() {
        return country;
    }

    /**
     * @return returns the date of the registration
     */
    public LocalDate getDate() {
        return date;
    }

    /**
     * @return returns a long which is the number of people infected by covid at a given date
     */
    public int getInfected() {
        return infected;
    }

    /**
     * @return returns number of deaths caused by covid at a given date
     */
    public int getDeaths() {
        return deaths;
    }

    /**
     * Set-method for deaths at a given date because it could be neccessary to edit later
     * @param deaths
     */
    public void setDeaths(int deaths) {
        this.deaths = deaths;
    }

    /**
     * Set-method for number of infected at a given date because it could be neccessary to edit later
     * @param infected
     */
    public void setInfected(int infected) {
        this.infected = infected;
    }

    public String toString() {
        String covidStatsToString = "";
        covidStatsToString = covidStatsToString.concat("\n\nCountry: " + getCountry() + "\nDate: " + getDate());
        covidStatsToString = covidStatsToString.concat("\nNumber of infected: " + getInfected() + "\nNumber of deaths: " + getDeaths());

        return covidStatsToString;
    }
}