package com.example.demo;

import com.example.demo.Model.Employee;
import com.example.demo.Model.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployees() {
        return employeeRepository.getAllEmployees();
    }
    public Employee getEmployeeById(Long id) {
        return employeeRepository.getEmployee(id);
    }
    public void addEmployee(Employee employee) {
        employeeRepository.saveEmployee(employee);
    }
    public void updateEmployee(Employee employee) {
        employeeRepository.updateEmployee(employee);
    }
    public void deleteEmployee(Long id) {
        employeeRepository.deleteEmployee(id);
    }


}
