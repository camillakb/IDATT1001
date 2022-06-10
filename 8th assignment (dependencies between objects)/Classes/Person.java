package Classes;

/**
 * Clas that initializes a Person object with relevant methods.
 */

public class Person {
    private final String firstName;
    private final String lastName;
    private final int birthYear;

    /**
     * Simple constructor that initializes the Person object.
     * @param firstName the person's first name.
     * @param lastName the person's last name.
     * @param birthYear the person's birth year.
     */
    public Person(String firstName, String lastName, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
    }

    /**
     * Get-method for the person's first name.
     * @return the person's first name.
     */
    public String getFirstName(){
        return this.firstName;
    }

    /**
     * Get-method for the person's last name.
     * @return the person's last name.
     */
    public String getLastName(){
        return this.lastName;
    }

    /**
     * Get-method for the person's birth year.
     * @return the person's birth year.
     */
    public int getBirthYear(){
        return this.birthYear;
    }
}
