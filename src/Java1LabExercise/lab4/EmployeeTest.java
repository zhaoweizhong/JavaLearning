package Java1LabExercise.lab4;

import java.util.Scanner;

public class EmployeeTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Employee employee1 = new Employee();
        Employee employee2 = new Employee();

        System.out.println("Employee 1");
        System.out.println("Enter the first name: ");
        employee1.setFirstName(input.nextLine());
        System.out.println("Enter the last name: ");
        employee1.setLastName(input.nextLine());
        System.out.println("Enter the monthly salary: ");
        employee1.setMonthlySalary(input.nextDouble());
        employee1.display();

        String test=input.nextLine();

        System.out.println("Employee 2");
        System.out.println("Enter the first name: ");
        employee2.setFirstName(input.nextLine());
        System.out.println("Enter the last name: ");
        employee2.setLastName(input.nextLine());
        System.out.println("Enter the monthly salary: ");
        employee2.setMonthlySalary(input.nextDouble());
        employee2.display();

        System.out.println("Give each employee 10% raise");
        System.out.println("Employee 1: " + 1.1 * employee1.getMonthlySalary());
        System.out.println("Employee 2: " + 1.1 * employee2.getMonthlySalary());
    }
}
