package Java1LabExercise.lab4;

public class Employee {
    /** three instance variables——a first name (type String), a last name (type String) and a monthly salary (double) */
    private String firstName,lastName;
    private double monthlySalary;

    /** Provide a constructor that initializes the three instance variables. */
    Employee(){}
    Employee(String firstname, String lastName, double monthlySalary){
        this.firstName = firstname;
        this.lastName = lastName;
        this.monthlySalary = monthlySalary;
    }

    /** Provide a set and a get method for each instance variable. */
    public void setFirstName(String first){
        firstName = first;
    }
    public void setLastName(String last){
        lastName = last;
    }
    public void setMonthlySalary(double monthlySalary){
        if(monthlySalary >= 0.0){this.monthlySalary = monthlySalary;}  // If the monthly salary is not positive, do not set its value.
    }

    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public double getMonthlySalary(){ return monthlySalary; }

    public void display(){
        System.out.println("First Name: " + getFirstName());
        System.out.println("Last Name: " + getLastName());
        System.out.println("Monthly Salary: " + getMonthlySalary());
    }
}
