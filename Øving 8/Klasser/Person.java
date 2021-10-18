package Klasser;

public class Person {
    private final String firstName;
    private final String lastName;
    private final int birthYear;

    /**
     * Enkel kostruktør som lagrer parametrene i objektet.
     * @param firstName
     * @param lastName
     * @param birthYear
     */
    public Person(String firstName, String lastName, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
    }

    //Get-metoder
    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public int getBirthYear(){
        return this.birthYear;
    }
}
