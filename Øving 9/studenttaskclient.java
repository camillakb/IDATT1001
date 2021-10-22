import Classes.Student;
import Classes.TaskOversight;
import java.util.Scanner;

public class studenttaskclient {
    public static void main(String[] args) {

        TaskOversight tasksForStudents = new TaskOversight();
        tasksForStudents.addNewStudent(new Student("Kari Nordmann", 4));
        tasksForStudents.addNewStudent(new Student("Ola Pettersen", 6));
        tasksForStudents.addNewStudent(new Student("Camilla Birkelund", 8));
        tasksForStudents.addNewStudent(new Student("Donald Duck", 2));

        String newStudentName;
        int newStudentTasks;
        Scanner input = new Scanner(System.in);
        int userInputNumber;
        int chooseStudent;

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
                    newStudentName = input.next();
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
