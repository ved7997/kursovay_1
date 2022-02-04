package ru.skypro;

public class Employee {
   private final String name;
    private final String firstName;
    private final String lastName;
    private int id;
    private  double salary;
    private int department;
    static int number;

    public Employee(String name, String firstName, String lastName, int department, double salary){
        this.name = name;
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.salary = salary;
        number = number + 1;
        this.id = number;
    }

@Override
    public String toString() {
        return id + " " + name + " " + firstName + " " + lastName + " " + " Отдел №" + department + " оклад: " + salary + " $";
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getsalary() {
        return salary;
    }

    public int getDepartment() {
        return department;
    }

    public void setsalary(int salary) {
        this.salary = salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }
}
