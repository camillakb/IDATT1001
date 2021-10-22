package Classes;
public class TaskOversight {

    private Student[] students;
    private int numberOfStudents = 0;
    
    public TaskOversight() {
        this.students = new Student[0];
    }

    public int getNumberOfStudents() { //Number of students registered
        return numberOfStudents;
    }

    public Student getStudent(int studentNumber){
        return this.students[studentNumber];
    }

    public void addNewStudent(Student newStudent) { //Register a new student
        Student[] newStudentList = new Student[this.numberOfStudents + 1];
        for(int i = 0; i < this.numberOfStudents; i++) {
            newStudentList[i] = this.students[i];
        }
        newStudentList[newStudentList.length - 1] = newStudent;
        this.students = newStudentList;
        this.numberOfStudents = newStudentList.length;
    }

    public void addNumberOfTasksForStudent(int studentNumber) { //Add a new task for a specific student
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
