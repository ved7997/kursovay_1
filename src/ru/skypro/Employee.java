package ru.skypro;

public class Employee {
   private final String name;
    private final String firstName;
    private final String lastName;
    private int id;
    private  double zp;
    private int department;
    static int number;

    public Employee(String name, String firstName, String lastName, int department, double zp){
        this.name = name;
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.zp = zp;
          number = number + 1;
        this.id = number;
    }

@Override
    public String toString() {
        return id + " " + name + " " + firstName + " " + lastName + " " + " Отдел №" + department + " оклад: " + zp + " $";
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

    public double getZp() {
        return zp;
    }

    public int getDepartment() {
        return department;
    }

    public void setId(int zp) {
        this.zp = zp;
    }

    public void setDepartment(int department) {
        this.department = department;
    }
}
