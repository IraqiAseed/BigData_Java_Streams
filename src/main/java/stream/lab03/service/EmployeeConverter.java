package stream.lab03.service;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import stream.lab03.model.EmployeeOnlyWithName;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Data
@Builder
@NoArgsConstructor
public class EmployeeConverter {


    /*
         Write method which will receive list of employees and will return
         string with their names separated by comma:
         Output : String which contains text: Hirsh,Avishay,Hadas
     */
    public String getEmployeesNames(ArrayList<EmployeeOnlyWithName> employees) {
        return employees.stream()
                .map(employee -> employee.getName())
                .reduce((name1, name2) -> name1 + "," + name2)
                .get();
    }

    /*
             Write method which will receive list of employees and will return List
             of their names (only the uppercased ones) sorted by length.
     */

    public List<String> upperCasedEmployeesSortedByLength(ArrayList<EmployeeOnlyWithName> employees) {
        return employees.stream()
                .filter(e -> e.getName().equals(e.getName().toUpperCase()))
                .sorted(Comparator.comparingInt(e -> e.getName().length()))
                .map(EmployeeOnlyWithName::getName)
                .collect(Collectors.toList());

    }
}