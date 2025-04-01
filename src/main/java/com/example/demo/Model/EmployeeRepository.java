package com.example.demo.Model;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    List<Employee> findByPosition(String position);
}
