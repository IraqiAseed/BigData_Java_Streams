package stream.lab04.model;

import lombok.Builder;
import lombok.Data;
import stream.lab04.model.Gender;

@Data
@Builder
public class EmployeeExpensive {
    private String name;
    private int salary;
    private Gender gender;

}
