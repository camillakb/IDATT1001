package Klasser;

public class ArbTaker {
    private Person personalia;
    private final int employeeNumber;
    private final int employmentYear;
    private double monthlyPay;
    private double taxPercentage;

    /**
     * Enkel konstruktør
     * @param personalia        person-objekt som representerer arbeidstaker
     * @param employeeNumber    ansattnummer
     * @param employmentYear    året arbeidstakeren ble ansatt
     * @param monthlyPay        arbeidstakerens månedslønn
     * @param taxPercentage     månedlig skattetrekk i prosent
     */
    public ArbTaker(Person personalia, int employeeNumber, int employmentYear, double monthlyPay, double taxPercentage) {
        this.personalia = personalia;
        this.employeeNumber = employeeNumber;
        this.employmentYear = employmentYear;
        this.monthlyPay = monthlyPay;
        this.taxPercentage = taxPercentage;
    }


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

    //Get-metoder som henter ut informasjon om arbeidstakernummer, ansettelsesår, månedslønn, personalia og månedlig skattetrekk i prosent.
    public int getEmployeeNumber() {
        return this.employeeNumber;
    }

    public int getEmploymentYear() {
        return this.employmentYear;
    }

    public double getMonthlyPay() {
        return this.monthlyPay;
    }

    public Person getPersonalia() {
        return this.personalia;
    }

    public double getTaxPercentage() {
        return this.taxPercentage;
    }

    //Set-metoder som kan endre månedslønn, personalia og månedlig skattetrekk i prosent.
    public void setMonthlyPay(double monthlyPay) {
        this.monthlyPay = monthlyPay;
    }

    public void setPersonalia(Person personalia) {
        this.personalia = personalia;
    }

    public void setTaxPercentage(double taxPercentage) {
        this.taxPercentage = taxPercentage;
    }

    //Mer avanserte get-metoder:
    //Hvor mange kroner arbeidstakeren trekkes i skatt per måned.
    public double getMonthlyTax() {
        return this.monthlyPay * this.taxPercentage / 100; //Deler på hundre for å gjøre prosent-verdien om til desimaltall.
    }

    //Bruttolønn per år
    public double getYearlyPay() {
        return this.monthlyPay * 12; 
    }

    //Skattetrekk per år (juni er skattefri, desember er halv skatt)
    public double getYearlyTax() {
        return 10.5 * this.getMonthlyTax();
    }

    //Navn på formen: etternavn, fornavn
    public String getNames() {
        return this.personalia.getLastName() + ", " + this.personalia.getFirstName(); 
    }

    //Alder
    public int getAge() {
        java.util.GregorianCalendar kalender = new java.util.GregorianCalendar();
        int year = kalender.get(java.util.Calendar.YEAR);
        return year - this.personalia.getBirthYear();
    }

    //Antall år ansatt i bedriften
    public int getYearsEmployed() {
        java.util.GregorianCalendar kalender = new java.util.GregorianCalendar();
        int year = kalender.get(java.util.Calendar.YEAR);
        return year - this.employmentYear;
    }

    //Om personen har vært ansatt i mer enn et gitt antall år (parameter)
    public boolean hiredLongerThan(int numberOfYears) {
        return this.getYearsEmployed() >= numberOfYears;
    }
}
