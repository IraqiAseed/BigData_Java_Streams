package stream.lab05.model;


import lombok.Builder;
import lombok.Data;
import java.util.List;
import java.util.Map;
@Data
@Builder
public class EmployeeIncludeCompany {
    private String name;
    private String company;


}
