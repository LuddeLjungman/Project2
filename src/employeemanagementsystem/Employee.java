package employeemanagementsystem;

import java.util.ArrayList;

public class Employee {

    private String name, gender;
    private double salary;
    private int age;
    int idnum = 10;
    static int count = 1;
    private double bonusD = salary * 0.1;
    private double bonusS = salary * 0.15;
    private double bonusE = salary * 0.2;

    public double getBonusD() {
        return bonusD;
    }

    public void setBonusD(double bonusD) {
        this.bonusD = bonusD;
    }

    public double getBonusS() {
        return bonusS;
    }

    public void setBonusS(double bonusS) {
        this.bonusS = bonusS;
    }

    public double getBonusE() {
        return bonusE;
    }

    public void setBonusE(double bonusE) {
        this.bonusE = bonusE;
    }

    public void bonus() {

        System.out.println("");
    }

    public Employee(String employeeName, int employeeAge, String employeeGender, double employeeSalary) {
        name = employeeName;
        age = employeeAge;
        gender = employeeGender;
        idnum = count++;
        salary = employeeSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getIdnum() {
        return idnum;
    }

    public void setIdnum(int idnum) {
        this.idnum = idnum;

    }
    public static void display(){
        
    }

    @Override
    public String toString() {
        return "Employee [name: " + name + ", gender: " + gender
                + ", salary: " + salary + ", age: " + age + ", IDnumber: " + idnum + "]\n";
    }

}
