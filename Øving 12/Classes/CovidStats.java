package Classes;
import java.time.LocalDate;

/**
 * Class to initialize CovidStats with relevant methods.
 */

public class CovidStats { 

    private String country;
    private int infected;
    private int deaths;
    private LocalDate date;
    LocalDate earliestDate = LocalDate.parse("2019-12-31");

    /**
     * Simple constructor that checks if the registered date is valid.
     * @param country the country that is being registered.
     * @param date date of the day being registered.
     * @param infected number of people infected by covid at registered date.
     * @param deaths number of deaths caused by covid at registered day.
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
     * Get-method for the name of the country.
     * @return a string containing the name of the country.
     */
    public String getCountry() {
        return country;
    }

    /**
     * Get-method for the date of the registration.
     * @return the date of the registration.
     */
    public LocalDate getDate() {
        return date;
    }

    /**
     * Get-method for the amount of infected at a given date.
     * @return a long which is the number of people infected by covid at a given date.
     */
    public int getInfected() {
        return infected;
    }

    /**
     * Get-method for the amount of deaths cause by covid on a given date.
     * @return the number of deaths caused by covid at a given date.
     */
    public int getDeaths() {
        return deaths;
    }

    /**
     * Set-method to edit number of deaths at a given date.
     * @param deaths the new amount of registered deaths.
     */
    public void setDeaths(int deaths) {
        this.deaths = deaths;
    }

    /**
     * Set-method for number of infected at a given date.
     * @param infected the new amount of infected people.
     */
    public void setInfected(int infected) {
        this.infected = infected;
    }

    /**
     * ToString method for the CovidStats object.
     */
    public String toString() {
        String covidStatsToString = "";
        covidStatsToString = covidStatsToString.concat("\n\nCountry: " + getCountry() + "\nDate: " + getDate());
        covidStatsToString = covidStatsToString.concat("\nNumber of infected: " + getInfected() + "\nNumber of deaths: " + getDeaths());

        return covidStatsToString;
    }
}