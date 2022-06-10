import Classes.Student;
import Classes.TaskOversight;
import java.util.Scanner;

/**
 * Client for the TaskOversight class.
 */

public class StudentTaskClient {
    public static void main(String[] args) {

        //Creating a TaskOversight object and adding students
        TaskOversight tasksForStudents = new TaskOversight(); 
        tasksForStudents.addNewStudent(new Student("Student One", 4));
        tasksForStudents.addNewStudent(new Student("Student Two", 6));
        tasksForStudents.addNewStudent(new Student("Student Three", 8));
        tasksForStudents.addNewStudent(new Student("Student Four", 2));

        String newStudentName;
        Scanner input = new Scanner(System.in);
        int userInputNumber;
        int chooseStudent;
        int newStudentTasks;

        //Do-while loop to allow the user to make multiple choices when running the client.
        do {
            System.out.println("What would you like to do?");
            System.out.println("1. Show list of students. \n2. Register a new student.");
            System.out.println("3. Check how many tasks a specific student has solved. \n4. Approve an assignment for a student.");
            System.out.println("5. Quit");
            System.out.print("\nEnter your choice: ");

            userInputNumber = input.nextInt();
            System.out.println();

            switch(userInputNumber) {
                case 1:
                    System.out.println(tasksForStudents);
                    break;
                
                case 2:
                    System.out.println("Enter the students name.");
                    input.nextLine(); //This line consumes the \n character.
                    newStudentName = input.nextLine();
                    System.out.println("Enter the number of approved tasks for the new student.");
                    newStudentTasks = input.nextInt();
                    tasksForStudents.addNewStudent(new Student(newStudentName, newStudentTasks));
                    break;
                
                case 3: 
                    System.out.println("Which student would you like to see?");
                    System.out.println(tasksForStudents);
                    chooseStudent = input.nextInt();
                    System.out.println(tasksForStudents.getStudent(chooseStudent));
                    break;

                case 4:
                    System.out.println("Which student would you like to approve an assignment for?");
                    System.out.println(tasksForStudents);
                    chooseStudent = input.nextInt();
                    tasksForStudents.addNumberOfTasksForStudent(chooseStudent);
                    System.out.println("Assignment approved.");
            
            }
        } while(userInputNumber != 5);   
        input.close();
    }
}
