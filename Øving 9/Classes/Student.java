package Classes;
public class Student {

    private String name;
    private int numberOfTasks;

    public Student(String name, int numberOfTasks) { //Constructor
        this.name = name;
        this.numberOfTasks = numberOfTasks;
    }

    public String getName() {
        return this.name;
    } 

    public int getNumberOfTasks() {
        return this.numberOfTasks;
    }

    public void addNumberOfTasks() {
        this.numberOfTasks++;
    }

    public String toString() {
        String callMethods = "";
        callMethods = callMethods.concat("Student name: " + this.getName());
        callMethods = callMethods.concat("\nNumber of approved tasks: " + this.getNumberOfTasks());

        return callMethods;
    
    }

    //Test program
    public static void main(String[] args) { 
        Student thisStudent = new Student("Camilla Birkelund", 8);

        System.out.println(thisStudent.getName());
        System.out.println(thisStudent.getNumberOfTasks());
        System.out.println("toString method: \n" + thisStudent);
        System.out.println("Adding number of approved tasks...");
        thisStudent.addNumberOfTasks();
        System.out.println(thisStudent);
    }

}