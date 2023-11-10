package com.tomatos.repository;

import com.tomatos.entity.Departments;
import com.tomatos.entity.Employees;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeptRepository extends JpaRepository<Departments, String> {


}
