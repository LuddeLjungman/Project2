
package employeemanagementsystem;


public class Sales extends Employee {
    
    public Sales(String employeeName, int employeeAge, String employeeGender, double employeeSalary) {
        super(employeeName, employeeAge, employeeGender, employeeSalary);
    }
    @Override
    public String toString() {
        return "Sales [name: " + getName() + ", gender: " + getGender()
                + ", salary: " + getSalary() + ", age: " + getAge() + ", IDnumber: " + idnum + "]\n";
    }
}
