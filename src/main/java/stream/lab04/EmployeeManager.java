package stream.lab04;
import stream.lab04.model.EmployeeExpensive;
import stream.lab04.model.Gender;
import stream.lab04.service.EmployeeHandler;

import java.util.List;
import java.util.Map;

public class EmployeeManager {
    public static void main(String[] args) {



        List<EmployeeExpensive> employeesList = List.of(
                        EmployeeExpensive.builder().name("Alice").salary(10000).gender(Gender.FEMALE).build(),
                        EmployeeExpensive.builder().name("Bob").salary(20000).gender(Gender.MALE).build(),
                        EmployeeExpensive.builder().name("John").salary(5000).gender(Gender.MALE).build(),
                        EmployeeExpensive.builder().name("BB").salary(10).gender(Gender.FEMALE).build(),
                        EmployeeExpensive.builder().name("CC").salary(20).gender(Gender.FEMALE).build(),
                        EmployeeExpensive.builder().name("DD").salary(30).gender(Gender.FEMALE).build());

        List<String> sortedEmployeeBySalary = EmployeeHandler.builder().build().
                getEmployeesNamesSortedBySalary(employeesList);

        System.out.println(sortedEmployeeBySalary);

        Map<Gender, Integer> genderSalary = EmployeeHandler.builder().build().salariesByGender(employeesList);

        System.out.println(genderSalary);


        boolean isManSalaryMore = EmployeeHandler.builder().build().isManEmployeesMoreExpensive(employeesList);
        System.out.println(isManSalaryMore);

    }
}
