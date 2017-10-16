package Java1LabExercise.lab4;

public class Gradebook {
    /** Include a String instance variable that represents the name of the course’s instructor. */
    private String instructor="Unknown",course="Unknown";
    public Gradebook(String ins,String crs){
        instructor = ins;
        course = crs;
    }

    /** Provide a set method to change the instructor’s name and a get method to retrieve it. */
    public Gradebook(){}
    public Gradebook(String test){System.out.println("Test");}

    /** Modify the constructor to specify two parameters—one for the course name and one for the instructor’s name. */
    public void setInstructor(String name){
        instructor = name;
    }
    public String getInstructor(){
        return instructor;
    }
    public void setCourseName(String name){
        course = name;
    }
    public String getCourseName(){
        return course;
    }

    /** Modify method displayMessage to output the welcome message and course name, followed by "This course is presented by: " and the instructor’s name. */
    public void displayMessage(){
        System.out.printf("This is the grade book for %s\nAnd this course is presented by %s\n", getCourseName(), getInstructor());
    }
}
