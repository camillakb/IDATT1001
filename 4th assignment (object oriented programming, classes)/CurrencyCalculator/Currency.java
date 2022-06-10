package CurrencyCalculator;

/**
 * Class containing information about the currency, and methods to convert to and from NOK.
 */

public class Currency {
    private double norwegianKroner; 
    private String currencyName;

    /**
     * Simple constructor that initializes the currency object.
     * @param currencyName the name of the currency.
     * @param norwegianKroner the currency's value in NOK.
     */
    public Currency(String currencyName, double norwegianKroner) {
        this.currencyName = currencyName;
        this.norwegianKroner = norwegianKroner;
    }

    /**
     * Method to convert an amount of NOK to another currency.
     * @param amountNOK the amount of NOK.
     * @return the amount of money in the new currency.
     */
    public double fromNOK(double amountNOK) {
        return amountNOK / this.norwegianKroner;
    }

    /**
     * Method to convert an amount of currency into NOK.
     * @param amountCurrency the amount of money in the currency that will be converted to NOK.
     * @return the value of NOK calculated from the currency.
     */
    public double toNOK(double amountCurrency) {
        return amountCurrency * this.norwegianKroner;
    }

    /**
     * Get-method for the currency's name.
     * @return the name of the currency.
     */
    public String getName() {
        return this.currencyName;
    }
}
