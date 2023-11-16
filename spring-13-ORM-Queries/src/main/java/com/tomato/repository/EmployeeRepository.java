package com.tomato.repository;

import com.tomato.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {

    //Derived Queries
    //Display all employees with email
    List<Employee> findEmployeeByEmailNotNull();

    //Display all employees with no email
    List<Employee> findEmployeeByEmailIsNull();
    List<Employee> findByFirstNameAndLastNameOrEmail(String firstName, String lastName,String email);

    //Display all Employees that first name is not ''
    List<Employee> findByFirstNameIsNot(String firstName);

    //Display all emp where last name starts with 'Th'
    List<Employee> findByLastNameStartingWith(String lastName);
    //Display all empl with salary higher that 50k
    List<Employee> findBySalaryGreaterThan(Integer salary);
    List<Employee> findBySalaryLessThan(Integer salary);
    List<Employee> findBySalaryLessThanEqualOrderBySalaryDesc(Integer salary);

    //Display all empl that hired between "date" and "Date"
    List<Employee> findByHireDateBetween(LocalDate startDate,LocalDate endDate);

    //Display all empl with salary greater or equal 50k in order
    List<Employee> findBySalaryIsGreaterThanEqualOrderBySalaryDesc(Integer salary);

    //Display top 3 epml that make less than ''
    List<Employee> findDistinctTop3BySalaryLessThan(Integer salary);

    //----------------------JPQL---------------------------------//
    @Query("select e from Employee  e where  e.email = 'dtrail8@tamu.edu'")
    Employee getEmployeeDetail();

    @Query("select e.salary from Employee e where e.email='dtrail8@tamu.edu'")
    Integer getEmployeeSalary();

    @Query("SELECT e FROM Employee e where e.email=?1")
    Optional<Employee> getEmployeeDetail(String email);
    @Query("SELECT e FROM Employee e where e.email=?1 and e.salary =?2")
    Optional<Employee> getEmployeeDetail(String email, int salary);

}
