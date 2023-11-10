package com.tomatos.repository;

import com.tomatos.entity.Departments;
import com.tomatos.entity.Employees;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeptRepository extends JpaRepository<Departments, String> {


}
