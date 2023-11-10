package com.tomatos.bootstrap;
import com.tomatos.entity.Departments;
import com.tomatos.entity.Employees;
import com.tomatos.enums.Gender;
import com.tomatos.repository.DeptRepository;
import com.tomatos.repository.EmplRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class DataGenerator implements CommandLineRunner {

    EmplRepository emplRepository;

    public DataGenerator(EmplRepository emplRepository) {
        this.emplRepository = emplRepository;
    }


    @Override
    public void run(String... args) throws Exception {

        List<Employees> employeeList = new ArrayList<>();
        List<Departments> deptList  = new ArrayList<>();

        Departments dept1 = new Departments("Sports","Outdoors");
        Departments dept2 = new Departments("Tools","Hardware");
        Departments dept3 = new Departments("Clothing","Men's");
        Departments dept4 = new Departments("Computers","Electronics");


        Employees emp1 = new Employees("John","McAlister","johnMc@gmail.com", LocalDate.of(2023,02,8), Gender.MALE, BigDecimal.valueOf(138000));
        Employees emp2 = new Employees("Samuel","Travolta","Travolta@gmail.com", LocalDate.of(2023,04,15), Gender.MALE, BigDecimal.valueOf(153000));
        Employees emp3 = new Employees("Aston","Duncan","Dunkan@gmail.com", LocalDate.of(2023,07,25), Gender.MALE, BigDecimal.valueOf(189000));
        Employees emp4 = new Employees("Jackie","Trent","trent@gmail.com", LocalDate.of(2023,12,13), Gender.MALE, BigDecimal.valueOf(155000));

        emp1.setDepartments(dept1);
        emp2.setDepartments(dept2);
        emp3.setDepartments(dept3);
        emp4.setDepartments(dept4);

        employeeList.addAll(Arrays.asList(emp1,emp2,emp3,emp4));
        deptList.addAll(Arrays.asList(dept1,dept2,dept3,dept4));

        emplRepository.saveAll(employeeList);
       // deptRepository.saveAll(deptList);

    }
}
