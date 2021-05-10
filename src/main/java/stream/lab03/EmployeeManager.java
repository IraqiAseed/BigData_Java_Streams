package stream.lab03;

import stream.lab03.model.EmployeeOnlyWithName;
import stream.lab03.service.EmployeeConverter;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManager {
    public static void main(String[] args) {

        ArrayList<EmployeeOnlyWithName> employees = new ArrayList<>();
        employees.add(new EmployeeOnlyWithName("Hirsh"));
        employees.add(new EmployeeOnlyWithName("Avishay"));
        employees.add(new EmployeeOnlyWithName("Hadas"));

        String namesOfEmployees = EmployeeConverter.builder().build().getEmployeesNames(employees);
        System.out.println(namesOfEmployees);


        ArrayList<EmployeeOnlyWithName> employeesList = new ArrayList<>();
        employeesList.add(new EmployeeOnlyWithName("ASEED"));
        employeesList.add(new EmployeeOnlyWithName("Hirsh"));
        employeesList.add(new EmployeeOnlyWithName("Avishay"));
        employeesList.add(new EmployeeOnlyWithName("HADS"));
        employeesList.add(new EmployeeOnlyWithName("Ran"));
        employeesList.add(new EmployeeOnlyWithName("alice"));
        employeesList.add(new EmployeeOnlyWithName("BOB"));
        employeesList.add(new EmployeeOnlyWithName("Evegeny"));

        List<String> employeesSortedByLength = EmployeeConverter.builder().build().upperCasedEmployeesSortedByLength(employeesList);
        System.out.println(employeesSortedByLength);



    }
}
