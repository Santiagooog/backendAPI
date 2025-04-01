package com.example.demo;

import com.example.demo.Model.Employee;
import com.example.demo.Model.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    public EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }

    public List<Employee> findByPosition(String position){
        return employeeRepository.findByPosition(position);
    }
    public Employee saveEmployee(Employee employee){
        return employeeRepository.save(employee);
    }
    public boolean deleteEmployee(Long id){
        if(employeeRepository.existsById(id)){
            employeeRepository.deleteById(id);
            return true;
        }
        return false;
    }
    public Employee updateEmployee(Long id, Employee employee){
        return employeeRepository.findById(id).map(employeee ->{
            employeee.setName(employee.getName());
            employeee.setPosition(employee.getPosition());
            employeee.setDescription(employee.getDescription());
            return employeeRepository.save(employeee);
        }).orElse(null);
    }
    public Optional<Employee> getEmployeeById(Long id){
        return employeeRepository.findById(id);
    }
}
