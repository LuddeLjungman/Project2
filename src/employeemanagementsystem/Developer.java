
package employeemanagementsystem;

import java.util.ArrayList;


public class Developer extends Employee {
    
    public Developer(String employeeName, int employeeAge, String employeeGender, double employeeSalary) {
        super(employeeName, employeeAge, employeeGender, employeeSalary);
    }
    @Override
    public String toString() {
        return "Developer [name: " + getName() + ", gender: " + getGender()
                + ", salary: " + getSalary() + ", age: " + getAge() + ", IDnumber: " + idnum + "]\n";
    }
}