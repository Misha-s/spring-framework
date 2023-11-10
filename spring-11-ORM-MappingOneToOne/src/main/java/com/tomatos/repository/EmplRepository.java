package com.tomatos.repository;

import com.tomatos.entity.Employees;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmplRepository extends JpaRepository<Employees,Long> {
}
