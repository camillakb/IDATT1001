package Classes;
public class TaskOversight {

    private Student[] students;
    private int numberOfStudents = 0;
    
    public TaskOversight() { //Constructor
        this.students = new Student[0];
    }

    public int getNumberOfStudents() { //Number of students registered
        return this.numberOfStudents;
    }

    public Student getStudent(int studentNumber){ //Check a specific student
        return this.students[studentNumber];
    }

    public void addNewStudent(Student newStudent) { //Register a new student
        Student[] newStudentList = new Student[this.numberOfStudents + 1]; //Making a new array
        for(int i = 0; i < this.numberOfStudents; i++) { //Adding the old values to the new array
            newStudentList[i] = this.students[i];
        }
        newStudentList[newStudentList.length - 1] = newStudent; //Adding the new student to new array
        this.students = newStudentList;
        this.numberOfStudents = newStudentList.length; //Saving the new array and its length
    }

    public void addNumberOfTasksForStudent(int studentNumber) { //Approve a task for a student
        this.students[studentNumber].addNumberOfTasks();
    }

    public String toString() { 
        String callMethods2 = "";
        callMethods2 = callMethods2.concat("Number of registered students: " + getNumberOfStudents() + "\n\n");
        for(int i = 0; i < this.numberOfStudents; i++) {
            callMethods2 = callMethods2.concat(i + ". " + this.students[i].getName() + "\n\n");
        }

        return callMethods2;
    }

}
