package Classes;

/**
 * Class that initializes an employee object with relevant methods.
 */

public class Employee {
    private Person personalia;
    private final int employeeNumber;
    private final int employmentYear;
    private double monthlyPay;
    private double taxPercentage;

    /**
     * Simple constructor that initializes an employee object.
     * @param personalia the person object that represent the personalia.
     * @param employeeNumber the employee's employee number.
     * @param employmentYear the year of employment.
     * @param monthlyPay the employee's monthly salary.
     * @param taxPercentage the emplyee's monthly tax percentage.
     */
    public Employee(Person personalia, int employeeNumber, int employmentYear, double monthlyPay, double taxPercentage) {
        this.personalia = personalia;
        this.employeeNumber = employeeNumber;
        this.employmentYear = employmentYear;
        this.monthlyPay = monthlyPay;
        this.taxPercentage = taxPercentage;
    }

    /**
     * toString-method for the Employee object.
     */
    @Override
    public String toString() {
        String callMethods = "";
        callMethods = callMethods.concat("Employee name and age: " + getNames() + " " + getAge());
        callMethods = callMethods.concat("\nEmployee number: " + getEmployeeNumber() + "\nEmployed in year: " + getEmploymentYear());
        callMethods = callMethods.concat("\nBeen employed for " + getYearsEmployed() + " years.");
        callMethods = callMethods.concat("\nMonthly salary: " + getMonthlyPay() + "\nYearly salary: " + getYearlyPay());
        callMethods = callMethods.concat("\nMonthly taxes in percentage: " + getTaxPercentage() + "\nMonthly taxes paid: " + getMonthlyTax());
        callMethods = callMethods.concat("\nTaxes paid per year: " + getYearlyTax());
        
        return callMethods;
    }

    /**
     * Get-method for the employee's employee number.
     * @return the employee's employee number.
     */
    public int getEmployeeNumber() {
        return this.employeeNumber;
    }

    /**
     * Get-method for the employee's year of employment.
     * @return the employee's year of employment.
     */
    public int getEmploymentYear() {
        return this.employmentYear;
    }

    /**
     * Get-method for the employee's monthly salary.
     * @return the employee's monthly salary.
     */
    public double getMonthlyPay() {
        return this.monthlyPay;
    }

    /**
     * Get-method for the employee's personalia.
     * @return the employee's personalia.
     */
    public Person getPersonalia() {
        return this.personalia;
    }

    /**
     * Get-method for the employee's tax percentage.
     * @return the employee's tax percentage.
     */
    public double getTaxPercentage() {
        return this.taxPercentage;
    }

    /**
     * Set-method for the employee's monthly salary.
     * @param monthlyPay the new monthly salary.
     */
    public void setMonthlyPay(double monthlyPay) {
        this.monthlyPay = monthlyPay;
    }

    /**
     * Set-method for the employee's personalia.
     * @param personalia the new personalia information.
     */
    public void setPersonalia(Person personalia) {
        this.personalia = personalia;
    }

    /**
     * Set-method for the employee's tax percentage.
     * @param taxPercentage the new tax percentage.
     */
    public void setTaxPercentage(double taxPercentage) {
        this.taxPercentage = taxPercentage;
    }

    /**
     * Get-method for the employee's monthly tax.
     * @return the employee's monthly tax.
     */
    public double getMonthlyTax() {
        return this.monthlyPay * this.taxPercentage / 100; 
    }

    /**
     * Get-method for an employee's yearly salary.
     * @return an employee's yearly salary.
     */
    public double getYearlyPay() {
        return this.monthlyPay * 12; 
    }

    /**
     * Get-method for an employee's yearly tax (no tax in June, and half tax in December).
     * @return an employee's yearly tax.
     */
    public double getYearlyTax() {
        return 10.5 * this.getMonthlyTax();
    }

    /**
     * Get-method for the employee's names.
     * @return the employee's names.
     */
    public String getNames() {
        return this.personalia.getLastName() + ", " + this.personalia.getFirstName(); 
    }

    /**
     * Get-method for the employee's age.
     * @return the employee's name.
     */
    public int getAge() {
        java.util.GregorianCalendar calendar = new java.util.GregorianCalendar();
        int year = calendar.get(java.util.Calendar.YEAR);
        return year - this.personalia.getBirthYear();
    }

    /**
     * Get-method for the number of years an employee has been employed.
     * @return the number of years an employee has been employed.
     */
    public int getYearsEmployed() {
        java.util.GregorianCalendar calendar = new java.util.GregorianCalendar();
        int year = calendar.get(java.util.Calendar.YEAR);
        return year - this.employmentYear;
    }

    /**
     * Method to see if an employee has been employed for longer than a given amount of years.
     * @param numberOfYears the amount of years to compare to.
     * @return a boolean value, true if an employe has been employed for longer than the given amount of years, 
     *         false if not.
     */
    public boolean hiredLongerThan(int numberOfYears) {
        return this.getYearsEmployed() >= numberOfYears;
    }
}
