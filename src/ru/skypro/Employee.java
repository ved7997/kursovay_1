package ru.skypro;

public class Employee {
   private final String name;
    private final String firstName;
    private final String lastName;
    private final int id;
    private  double zp;
    private int department;

    public Employee(String name, String firstName, String lastName, int id, int department, double zp){
        this.name = name;
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.department = department;
        this.zp = zp;
    }

//    public Employee(double zp){
//        this.zp = zp;
//    }

//    public (){
//
//    }

    public String getOb() {
        return id + " " + name + " " + firstName + " " + lastName + " " + " Отдел №" + department + " оклад: " + zp + " руб.";
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

    public void setZp(double zp) {
        this.zp = zp;
    }

    public void setDepartment(int department) {
        this.department = department;
    }
}
