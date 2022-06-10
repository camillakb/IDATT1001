package Classes;

/**
 * Class to initialize a TaskOversight with relevant methods. 
 */

public class TaskOversight {

    private Student[] students;
    private int numberOfStudents = 0;
    
    /**
     * Simple constructor to initialize TaskOversight.
     */
    public TaskOversight() { 
        this.students = new Student[0];
    }

    /**
     * Get-method for the number of students.
     * @return the number of students.
     */
    public int getNumberOfStudents() { 
        return this.numberOfStudents;
    }

    /**
     * Get-method to find a specific student by their student number.
     * @param studentNumber the student's student number.
     * @return the Student object that the student number belongs to.
     */
    public Student getStudent(int studentNumber){ 
        return this.students[studentNumber];
    }

    /**
     * Method to add a new student to the TaskOversight.
     * @param newStudent the student that will be added.
     */
    public void addNewStudent(Student newStudent) {
        Student[] newStudentList = new Student[this.numberOfStudents + 1]; 
        
        for (int i = 0; i < this.numberOfStudents; i++) { 
            newStudentList[i] = this.students[i];
        }

        newStudentList[newStudentList.length - 1] = newStudent; 
        this.students = newStudentList;
        this.numberOfStudents = newStudentList.length; 
    }

    /**
     * Method to approve a new task for a student.
     * @param studentNumber the number of the student that will get a task approved.
     */
    public void addNumberOfTasksForStudent(int studentNumber) { 
        this.students[studentNumber].addNumberOfTasks();
    }

    /**
     * ToString method for the TaskOversight.
     */
    public String toString() { 
        String callMethods2 = "";
        callMethods2 = callMethods2.concat("Number of registered students: " + getNumberOfStudents() + "\n\n");
        
        for (int i = 0; i < this.numberOfStudents; i++) {
            callMethods2 = callMethods2.concat(i + ". " + this.students[i].getName() + "\n\n");
        }

        return callMethods2;
    }
}
