package stream.lab04.service;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import stream.lab04.model.EmployeeExpensive;
import stream.lab04.model.Gender;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Data
@Builder
@AllArgsConstructor
public class EmployeeHandler {

    /*
        Write method which will receive list of employees and will return List
        of their names sorted by salary of employee, starting from most
        expensive employee
     */
    public List<String> getEmployeesNamesSortedBySalary(List<EmployeeExpensive> employeeList) {
        return employeeList.stream()
                    .sorted((e1,e2) -> e2.getSalary() - e1.getSalary())
                    .map(EmployeeExpensive::getName)
                    .collect(Collectors.toList());

    }

    /*
        Write method which will return list of employees and will calculate
        sum of man salaries against sum of woman salaries
    */

    public Map<Gender,Integer> salariesByGender(List<EmployeeExpensive> employeeList) {
                return employeeList.stream()
                .collect(Collectors.groupingBy( EmployeeExpensive::getGender ,
                                                Collectors.summingInt(EmployeeExpensive::getSalary)));
    }

    /*
        public boolean isManEmployeesMoreExpensive (List<Employee>)
     */
    public boolean isManEmployeesMoreExpensive (List<EmployeeExpensive> employeeList){
        return salariesByGender(employeeList).get(Gender.MALE) > salariesByGender(employeeList).get(Gender.FEMALE);
    }

}
