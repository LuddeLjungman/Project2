package employeemanagementsystem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class EmployeeData extends Employee {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<Employee> emp = new ArrayList<>();
    static ArrayList<Double> sal = new ArrayList<Double>();

    public static void add() {
        int choice;
        String userInput = " ";
        System.out.println("Please select position of new employee");
        System.out.println("1. Executive");
        System.out.println("2. Developer");
        System.out.println("3. Sales");
        choice = isUserPositionInputValid();
        //sc.nextLine();

        switch (choice) {
            case 1:
                addExecutive();
                break;
            case 2:
                addDeveloper();
                break;
            case 3:
                addSales();
                break;
            default:
                throw new AssertionError();
        }
    }

    public static void addExecutive() {
        System.out.println("Please enter name of employee:");
        String N = sc.nextLine();

        System.out.println("Please enter age of employee:");
        int A = isUserInputValid();
        //sc.nextLine();

        System.out.println("Please enter Gender of employee:");
        String G = employeeGender();

        System.out.println("Please enter salary of employee:");
        double SA = sc.nextDouble();
        sc.nextLine();

        Employee E = new Executive(N, A, G, SA);
        emp.add(E);
        sal.add(SA);

        System.out.println("Done! The new employee has been added");
    }

    public static void addDeveloper() {
        System.out.println("Please enter name of employee:");
        String N = sc.nextLine();

        System.out.println("Please enter age of employee:");
        int A = isUserInputValid();
        //sc.nextLine();

        System.out.println("Please enter Gender of employee:");
        String G = employeeGender();

        System.out.println("Please enter salary of employee:");
        double SA = sc.nextDouble();
        sc.nextLine();

        Employee E = new Developer(N, A, G, SA);
        emp.add(E);
        sal.add(SA);

        System.out.println("Done! The new employee has been added");
    }

    public static void addSales() {
        System.out.println("Please enter name of employee:");
        String N = sc.nextLine();

        System.out.println("Please enter age of employee:");
        int A = isUserInputValid();
        //sc.nextLine();

        System.out.println("Please enter Gender of employee:");
        String G = employeeGender();

        System.out.println("Please enter salary of employee:");
        double SA = sc.nextDouble();
        sc.nextLine();

        Employee E = new Sales(N, A, G, SA);
        emp.add(E);
        sal.add(SA);

        System.out.println("Done! The new employee has been added");
    }

    public static void removeEmployee() {

        System.out.println("\nRemove employee\n");
        System.out.println("1. By name");
        System.out.println("2. By ID");

        int choice;
        choice = sc.nextInt();
        sc.nextLine();
        switch (choice) {
            case 1:
                removeEmployeeByName();
                break;
            case 2:
                removeEmployeeById();
                break;
            default:
                throw new AssertionError();
        }
    }

    public static void removeEmployeeByName() {
        System.out.println(emp);
        System.out.println("Enter name for employee you want to remove");
        String name = sc.nextLine();

        for (int i = emp.size() - 1; i >= 0; i--) {

            if (emp.get(i).getName().equalsIgnoreCase(name)) {
                emp.remove(emp.get(i));
                System.out.println("Employee " + name + " has been removed from the system.");
            }
        }
    }

    public static void removeEmployeeById() {
        System.out.println(emp);
        System.out.println("Enter Id for employee");
        int id = sc.nextInt();
        sc.nextLine();

        for (int i = emp.size() - 1; i >= 0; i--) {

            if (emp.get(i).getIdnum() == id) {
                emp.remove(emp.get(i));
                System.out.println("Employee with " + id + "number" + " has been removed from the system.");
            } else {
                System.out.println("Invalid id");
            }
        }
    }

    public static void updateEmployee() {

        System.out.println("Employee update\nWhat do you want to update?");
        System.out.println("1. Employee name");
        System.out.println("2. Employee age");
        System.out.println("3. Employee salary");
        int choice = sc.nextInt();
        sc.nextLine();
        switch (choice) {
            case 1:
                updateEmployeeName();
                break;
            case 2:
                updateEmployeeAge();
                break;
            case 3:
                updateEmployeeSalary();
                break;

            default:
                throw new AssertionError();
        }
    }

    public static void updateEmployeeName() {
        System.out.println(emp);
        System.out.println("Enter Id for employee:");
        int id = sc.nextInt();
        sc.nextLine();
        for (Employee employee : emp) {

            if (employee.getIdnum() == id) {
                System.out.println("Enter the new name for employee:");
                String name = sc.nextLine();
                employee.setName(name);
                System.out.println("Employee is updated");
            } else {
                System.out.println("Invalid ID");
            }
        }
    }

    public static void updateEmployeeAge() {
        System.out.println(emp);
        System.out.println("Enter Id for employee:");
        int id = sc.nextInt();
        sc.nextLine();
        for (Employee employee : emp) {

            if (employee.getIdnum() == id) {
                System.out.println("Enter the new age for employee:");
                int age = sc.nextInt();
                employee.setAge(age);
                System.out.println("employee is updated");
            } else {
                System.out.println("invalid id");
            }
        }
    }

    public static void updateEmployeeSalary() {
        System.out.println(emp);
        System.out.println("Enter Id for employee:");
        int id = sc.nextInt();
        sc.nextLine();
        for (Employee employee : emp) {

            if (employee.getIdnum() == id) {
                System.out.println("Enter  the new age for employee:");
                double salary = sc.nextDouble();
                employee.setSalary(salary);
                System.out.println("employee is updated");
            } else {
                System.out.println("invalid id");
            }
        }
    }

    public static void SearchByName() {

        System.out.println("Enter name for employee:");
        String name = sc.nextLine();
        for (Employee employee : emp) {

            if (employee.getName().equalsIgnoreCase(name)) {
                System.out.println(employee.toString());
                break;
            } else {
                System.out.println("The name does not exist!");
            }
        }
    }

    public static void SearchById() {

        System.out.println("Enter id for employee:");
        int id = sc.nextInt();
        sc.nextLine();
        for (Employee employee : emp) {

            if (employee.getIdnum() == id) {
                System.out.println(employee.toString());
            } else {
                System.out.println("The id does not exist!");
            }
        }
    }

    public static void showAllEmployees() {

        for (Employee emp : emp) {
            System.out.println(emp);
            emp.display();
        }
        System.out.println("");
    }

    public static void averageSalary() {

        int total = 0;
        int avg = 0;
        for (int i = 0; i < sal.size(); i++) {
            total += sal.get(i);
            avg = total / sal.size();

        }
        System.out.println("The Average IS:" + avg);
    }

    public static int isUserInputValid() {
        String userInputString;
        int userInput = 0;
        boolean isInputValid;

        do {
            userInputString = sc.nextLine();
            try {
                userInput = Integer.parseInt(userInputString);
                isInputValid = true;
                if (userInput <= 0) {
                    isInputValid = false;
                    System.out.println("You have entered a negative number, please try again.");
                }
            } catch (Exception e) {

                System.out.println("Input not valid, try again!");
                isInputValid = false;
            }
        } while (isInputValid == false);
        return userInput;

    }

    public static void minmaxSalary() {

        System.out.println("The minimum salary in the company is " + Collections.min(sal));

        System.out.println("The maximum salary in the company is " + Collections.max(sal));

    }

    public static String employeeGender() {
        int choice;
        String userInput;
        System.out.println("Please select gender of new employee");
        System.out.println("1. Female");
        System.out.println("2. Male");
        System.out.println("3. Non binary");
        choice = isUserPositionInputValid();
        //sc.nextLine();

        switch (choice) {
            case 1:
                userInput = "Female";
                break;
            case 2:
                userInput = "Male";
                break;
            case 3:
                userInput = "Non binary";
                break;
            default:
                System.out.println(("Wrong input, please choose 1, 2 or 3."));
                throw new AssertionError();
        }
        return userInput;
    }

    /*public static void showOverallBonus(){
        System.out.println("The total bonus for the company is " + ( + bonusS + bonusE));
    }*/
    public static int isUserPositionInputValid() {
        String userInputString;
        int userInput = 0;
        boolean isInputValid;

        do {
            userInputString = sc.nextLine();
            try {
                userInput = Integer.parseInt(userInputString);
                isInputValid = true;
                if (userInput < 1 || userInput > 3) {
                    isInputValid = false;
                    System.out.println("Please enter 1,2 or 3");
                }
            } catch (Exception e) {

                System.out.println("Input not valid, try again!");
                isInputValid = false;
            }
        } while (isInputValid == false);
        return userInput;
    }

    public EmployeeData(String employeeName, String employeePosition, int employeeAge, String employeeGender, double employeeSalary) {
        super(employeeName, employeeAge, employeeGender, employeeSalary);
    }

}
