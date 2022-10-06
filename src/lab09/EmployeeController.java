package lab09;

import java.util.List;

public class EmployeeController {
    public int calculateTotalSalary(List<Employee> employeeList){
        int totalSalary = 0;
        for (int index = 0; index < employeeList.size(); index++) {
            totalSalary += employeeList.get(index).getSalary();
        }
        return totalSalary;
    }
}