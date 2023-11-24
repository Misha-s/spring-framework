package com.tomato.bootstrap;

import com.tomato.repository.CourseRepository;
import com.tomato.repository.DepartmentRepository;
import com.tomato.repository.EmployeeRepository;
import com.tomato.repository.RegionRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataGenerator implements CommandLineRunner {

    private final RegionRepository regionRepository;
    private final DepartmentRepository departmentRepository;

    private final CourseRepository courseRepository;

    private final EmployeeRepository employeeRepository;

    public DataGenerator(RegionRepository regionRepository, DepartmentRepository departmentRepository, CourseRepository courseRepository, EmployeeRepository employeeRepository) {
        this.regionRepository = regionRepository;
        this.departmentRepository = departmentRepository;
        this.courseRepository = courseRepository;
        this.employeeRepository = employeeRepository;
    }


    @Override
    public void run(String... args) throws Exception {

        System.out.println("---------Region start-----------");
        //System.out.println( regionRepository.findByCountry("Canada"));
       //System.out.println( regionRepository.findDistinctByCountry("United States"));
        //System.out.println(regionRepository.findByCountryContaining("United"));
       // System.out.println(regionRepository.findByCountryContainingOrderByCountry("Asia"));
       // System.out.println(regionRepository.findTop2ByCountry("Canada"));
        System.out.println("---------Region end------------");

        System.out.println("---------Department start-----------");
        //System.out.println(departmentRepository.findByDepartment("Furniture"));
//        System.out.println(departmentRepository.findByDivisionIs("Home"));
//        System.out.println(departmentRepository.findByDivisionEquals("Health"));
       // System.out.println(departmentRepository.findDistinctTop3ByDivisionContains("Hea"));
        System.out.println("---------Department end-----------");

        System.out.println("---------Employee start-----------");
//        System.out.println( employeeRepository.findEmployeeByEmailNotNull().size());
//        System.out.println( employeeRepository.findEmployeeByEmailIsNull().size());
//        System.out.println( employeeRepository.findByFirstNameAndLastNameOrEmail("","","fmorffew4@a8.net"));
        //System.out.println( employeeRepository.findByFirstNameIsNot("Stefania"));
       // System.out.println( employeeRepository.findByLastNameStartingWith("Ta"));
//        System.out.println( employeeRepository.findBySalaryGreaterThan(79000).size());
//        System.out.println( employeeRepository.findBySalaryLessThan(40000).size());
//        System.out.println( employeeRepository.findBySalaryLessThanEqual(30000).size());
        //System.out.println( employeeRepository.findBySalaryIsGreaterThanEqualOrderBySalaryDesc(50000));
//        System.out.println( employeeRepository.findDistinctTop3BySalaryLessThan(30000));
      //  System.out.println( employeeRepository.findDistinctTop3BySalaryLessThan(30000));
        System.out.println("---------Employee end-----------");


        System.out.println("---------Employee JPQL start-----------");
       // System.out.println( employeeRepository.getEmployeeDetail());
      //  System.out.println( employeeRepository.getEmployeeSalary());
        //System.out.println(employeeRepository.getEmployeeDetail("dtrail8@tamu.edu").get());

        //employeeRepository.getEmployeeSalaryNotEqual(75900).forEach(System.out::println);
       // System.out.println( employeeRepository.getEmployeeFirstNameLike("%Mi"));

        System.out.println("---------Employee JPQL end-----------");


        System.out.println("---------Course start-----------");
        //courseRepository.findByCategory("Spring").forEach(System.out::println);
        //courseRepository.findByCategoryOrderByName("Spring").forEach(System.out::println);

        //System.out.println( courseRepository.existsByName("Rapid Spring Boot Application Development"));
       // System.out.println(courseRepository.countByCategory("Spring"));
       // courseRepository.findByNameStartsWith("Fully Reactive").forEach(System.out::println);
        //courseRepository.streamByCategory("Spring").forEach(System.out::println);


        System.out.println("---------Course end-----------");



    }
}
