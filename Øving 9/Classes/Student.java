package Classes;

/**
 * Class to initialize a Student object with related methods.
 */

public class Student {

    private String name;
    private int numberOfTasks;

    /**
     * Simple constructor to initialize a Student object.
     * @param name the name of the student.
     * @param numberOfTasks the number of tasks a student has completed.
     */
    public Student(String name, int numberOfTasks) { 
        this.name = name;
        this.numberOfTasks = numberOfTasks;
    }

    /**
     * Get-method for the student's name.
     * @return the student's name.
     */
    public String getName() {
        return this.name;
    } 

    /**
     * Get-method for the number of completed tasks for a student.
     * @return the number of completed tasks for a student.
     */
    public int getNumberOfTasks() {
        return this.numberOfTasks;
    }

    /**
     * Method to add a new completed task for a student.
     */
    public void addNumberOfTasks() {
        this.numberOfTasks++;
    }

    /**
     * ToString method for the Student object.
     */
    public String toString() {
        String callMethods = "";
        callMethods = callMethods.concat("Student name: " + this.getName());
        callMethods = callMethods.concat("\nNumber of approved tasks: " + this.getNumberOfTasks());

        return callMethods;
    
    }

    //Testing the methods.
    public static void main(String[] args) { 
        Student thisStudent = new Student("Test Student", 8);

        System.out.println(thisStudent.getName());
        System.out.println(thisStudent.getNumberOfTasks());
        System.out.println("toString method: \n" + thisStudent);
        System.out.println("Adding number of approved tasks...");
        thisStudent.addNumberOfTasks();
        System.out.println(thisStudent);
    }
}