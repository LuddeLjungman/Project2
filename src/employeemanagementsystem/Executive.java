
package employeemanagementsystem;


public class Executive extends Employee {
    
    public Executive(String employeeName, int employeeAge, String employeeGender, double employeeSalary) {
        super(employeeName, employeeAge, employeeGender, employeeSalary);
    }
   @Override
    public String toString() {
        return "Executive [name: " + getName() + ", gender: " + getGender()
                + ", salary: " + getSalary() + ", age: " + getAge() + ", IDnumber: " + idnum + "]\n";
    }
}
