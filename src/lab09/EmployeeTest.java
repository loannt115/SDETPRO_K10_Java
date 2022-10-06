package lab09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee e1 = new FullTimeEmployee();
        Employee e2 = new ContractEmployee();
        Employee e3 = new FullTimeEmployee();
        Employee e4 = new ContractEmployee();
        Employee e5 = new FullTimeEmployee();

//        e1.setSalary(10000);

//        List<Employee> employeeList = Arrays.asList(e1, e2, e3, e4, e5);
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        employeeList.add(e4);
        employeeList.add(e5);

        System.out.println(employeeList);
        int totalSalary = new EmployeeController().calculateTotalSalary(employeeList);
        System.out.println("Total salary: " + totalSalary);

    }
}