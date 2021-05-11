package stream.lab05.service;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import stream.lab05.model.EmployeeIncludeCompany;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
@Data
@Builder
@AllArgsConstructor
public class EmployeeMapper {

    /*
    Write method which will receive List of Employees and will return
    map< CompanyName , List<Employee>>
    Yes each employee has property: String companyName
    */
    public Map<String, List<EmployeeIncludeCompany>> mappingCompaniesToEmployers(List<EmployeeIncludeCompany> employees) {
        return employees.stream()
                .collect(Collectors.groupingBy(EmployeeIncludeCompany::getCompany));
    }

    /*
    Write method which receive map from previous method and returns
    Map< CompanyName,NumberOfWorkers>
    */
    public Map<String, Integer> mappingCompanyToItsSize(List<EmployeeIncludeCompany> employees) {
        return  mappingCompaniesToEmployers(employees).entrySet().stream()
                .collect(Collectors.toMap(key -> key.getKey(), value -> value.getValue().size() ));


    }

    /*trying another approach ..  */
    public Map<String, Long> mappingCompanyToItsSizeV2(List<EmployeeIncludeCompany> employees) {
        return  employees.stream()
                .collect(Collectors.groupingBy(EmployeeIncludeCompany::getCompany,Collectors.counting()));


    }

}


