package stream.lab05;
import stream.lab05.model.EmployeeIncludeCompany;
import stream.lab05.service.EmployeeMapper;

import java.util.List;
import java.util.Map;
public class EmployeeWithCompanyManager {
    public static void main(String[] args) {


        List<EmployeeIncludeCompany> employessListWithCompany = List.of(
                EmployeeIncludeCompany.builder().name("Alice").company("Microsoft").build(),
                EmployeeIncludeCompany.builder().name("Bob").company("Google").build(),
                EmployeeIncludeCompany.builder().name("Semion").company("Naya").build(),
                EmployeeIncludeCompany.builder().name("Ran").company("Google").build(),
                EmployeeIncludeCompany.builder().name("Evgeny").company("Naya").build());

        Map<String, List<EmployeeIncludeCompany>> stringCompamyListMap = EmployeeMapper.builder().build()
                                                    .mappingCompaniesToEmployers(employessListWithCompany);


        System.out.println(stringCompamyListMap);



        Map<String, Integer> companiesSize = EmployeeMapper.builder().build()
                .mappingCompanyToItsSize(employessListWithCompany);

        System.out.println(companiesSize);


        Map<String, Long> companiesSizev2 = EmployeeMapper.builder().build()
                .mappingCompanyToItsSizeV2(employessListWithCompany);

        System.out.println(companiesSize);

    }
}
