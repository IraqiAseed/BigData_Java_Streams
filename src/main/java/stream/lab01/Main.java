package stream.lab01;

import stream.lab01.model.EmployeeWithGlobalSalary;
import stream.lab01.model.EmployeeWithMonthlySalary;
import stream.lab01.service.EmployeeContainer;

import java.util.List;

public class Main {
    public static void main(String[] args) {




        List<EmployeeWithGlobalSalary> listOfEmployees = List.of(
                EmployeeWithGlobalSalary.builder().name("Alice").salary(24000).build(),
                EmployeeWithGlobalSalary.builder().name("Bob").salary(42000).build());

        int sumOfSalaries = EmployeeContainer.builder().build().sumOfSalariesGlobal(listOfEmployees);

        System.out.println("sum of employees salaries = " + sumOfSalaries);



        List<EmployeeWithMonthlySalary> listOfEmployeeWithMonthlySalary = List.of(
                EmployeeWithMonthlySalary.builder().name("Alice").salary(new int[]{10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110,120}).build(),
                EmployeeWithMonthlySalary.builder().name("Bob").salary(new int[]{11, 12, 13, 14, 15, 16, 17, 18, 19, 10, 11,12}).build());

        sumOfSalaries = EmployeeContainer.builder().build().sumOfSalariesMonthly(listOfEmployeeWithMonthlySalary);

        System.out.println("sum of employees salaries = " + sumOfSalaries);

    }
}
