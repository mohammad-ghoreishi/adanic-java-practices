/**
 * The Student class represents a student in a student administration system.
 * It holds the student details relevant in our context.
 *
 * @author Alireza
 * @version 0.0
 */
public class Student {

    //the student's first name
    private String firstName;

    //the student's last name
    private String lastName;

    //the student ID
    private String id;

    //the grade
    private int grade;


    /**
     * create a new student with a given name and ID number.
     *
     * @param fName first name of student
     * @param lName last name of student
     * @param sID   student ID
     */
    public Student(String fName, String lName,
                   String sID) {
        firstName = fName;
        lastName = lName;
        id = sID;
        grade = 0;

    }

    /**
     * get the first name of student
     *
     * @return firstName field
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param fName set first name of a student
     */
    public void setFirstName(String fName) {
        firstName = fName;
    }

    /**
     * get the last name of student
     *
     * @return latName field
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lName set first name of a student
     */
    public void setLastName(String lName) {
        lastName = lName;
    }


        /**
     * get the id of student
     *
     * @return id field
     */
    public String getID() {
        return id;
    }

    /**
     * @param sID set id of a student
     */
    public void setID(String sID) {
        id = sID;
    }


    /** get the grade of student
     *
     * @return grade field
     */
    public int getGrade() {
        return grade;
    }

    /** @param Grade set grade of a student
     *
     */

    public void setGrade(int Grade) {
        grade = Grade;
    }

    /**
     * print the student's last name and ID number to the output terminal.
     */
    public void print() {
        System.out.println(lastName + ", student ID: " + id + ", grade: " + grade);

    }
}