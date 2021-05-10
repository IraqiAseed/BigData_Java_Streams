package stream.lab01.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class EmployeeWithMonthlySalary {
    private String name;
    private int[] salary;

}
