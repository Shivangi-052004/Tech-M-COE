package sample;

import java.util.Scanner;

public class Employee {
    private int id;
    private String EmpName;
    private int salary;
    private int exp;

    public Employee(int id, String EmpName, int salary, int exp) {
        this.id = id;
        this.EmpName = EmpName;
        this.salary = salary;
        this.exp = exp;
    }

    public void setEmployee() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        this.id = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("Enter Employee Name: ");
        this.EmpName = scanner.nextLine();

        System.out.print("Enter Salary: ");
        this.salary = scanner.nextInt();

        System.out.print("Enter the work experience: ");
        this.exp = scanner.nextInt();

        // Do NOT close scanner here (removing scanner.close();)
    }

    public static void getloaneligiblity(int exp, int salary) {
        if (exp > 5) {
            if (salary == 600000) {
                System.out.println("2 lakhs of loan is granted");
            } else if (salary >= 1000000) {
                System.out.println("5 lakhs of loan is granted");
            } else if (salary >= 1500000) {
                System.out.println("7 lakhs of loan is granted");
            } else {
                System.out.println("Loan is not granted due to insufficient salary.");
            }
        } else {
            System.out.println("Loan is not granted due to insufficient experience.");
        }
    }

    public String getEmployeeDetails() {
        return "EmpId: " + id + ", Name of the employee: " + EmpName + ", Salary: " + salary;
    }

    public static void main(String[] args) {
        Employee Emp = new Employee(0, null, 0, 0);
        Emp.setEmployee();
        System.out.println(Emp.getEmployeeDetails()); // Print employee details

        // Now, getloaneligiblity() will execute correctly
        getloaneligiblity(Emp.exp, Emp.salary);
    }
}

