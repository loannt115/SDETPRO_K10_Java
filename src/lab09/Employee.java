package lab09;

public class Employee {
    private String name;
    private int salary;

    public Employee() {
    }

    public Employee(String name) {
        this.name = name;
    }

    public Employee(int salary) {
        this.salary = salary;
    }

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "{name = '" + name + "', salary = '" + salary + "'}";
    }
}