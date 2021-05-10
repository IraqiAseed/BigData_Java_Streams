package stream.lab01.service;

import lombok.*;
import stream.lab01.model.EmployeeWithGlobalSalary;
import stream.lab01.model.EmployeeWithMonthlySalary;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

@Data
@Builder
@NoArgsConstructor

public class EmployeeContainer {

    /*
      Write method which receives list of employees and returns sum of
      their salaries
      */
    public int sumOfSalariesGlobal(List<EmployeeWithGlobalSalary> employees) {
        return employees.stream().mapToInt(EmployeeWithGlobalSalary::getSalary).sum();
    }

    /*
    Class employee has salaries (array property for salary of each month)
    Employee{
        private
        int [] salary = new int [12]
    }
    Write method which will calculate salaries of all employees per year
    */
    public int sumOfSalariesMonthly(List<EmployeeWithMonthlySalary> employees) {
        return employees.stream()
                .map(EmployeeWithMonthlySalary::getSalary)
                .flatMapToInt(arr -> IntStream.of(Arrays.stream(arr).sum()))
                .sum();
    }
}
