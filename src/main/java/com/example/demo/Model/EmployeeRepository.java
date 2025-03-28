package com.example.demo.Model;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmployeeRepository {
    private List<Employee> employees = new ArrayList<>();
    public EmployeeRepository() {
        employees.add(new Employee(1L, "Jessica", "Talero", "Coordinadora"));
        employees.add(new Employee(2L, "Carlos", "Ayala", "Soporte"));
        employees.add(new Employee(3L, "Rafael", "Triviño", "Inventario"));
        employees.add(new Employee(4L, "Harold", "Nieto", "Soporte"));
        employees.add(new Employee(5L, "Diana", "Rocha", "Apoyo"));
        employees.add(new Employee(6L, "Dayana", "Rodriguez", "Documentadora"));
        employees.add(new Employee(7L, "Jhonatan", "Ramirez", "Soporte"));
        employees.add(new Employee(8L, "Santiago", "Gomez", "Aprendiz"));
        employees.add(new Employee(9L, "Dayana", "Cardenas", "Aprendiz"));
    }
    public List<Employee> getAllEmployees() {
        return employees;
    }
    public Employee getEmployee(Long id) {
        for (Employee employee : employees) {
            if (employee.getId().equals(id)) {
                return employee;
            }
        }
        return null;
    }

    public void saveEmployee(Employee employee) {
        employees.add(employee);
    }
    public void updateEmployee(Employee employee) {
        int index = employees.indexOf(employee);
        employees.set(index, employee);
    }
    public void deleteEmployee(Long id) {
        employees.remove(id);
    }

}
