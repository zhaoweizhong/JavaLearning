package LabExercise.lab4;

import java.util.Scanner;

public class GradebookTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the instructor's name and course name below: ");

        String testInstructor = input.nextLine();
        String testCourseName = input.nextLine();

        Gradebook testGradebook = new Gradebook();

        testGradebook.setInstructor(testInstructor);
        testGradebook.setCourseName(testCourseName);
        testGradebook.displayMessage();
    }
}
