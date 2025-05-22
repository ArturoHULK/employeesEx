package com.jarmdev.employees.service;

import com.jarmdev.employees.entity.Employee;
import com.jarmdev.employees.request.EmployeeRequest;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAll();
    Employee findById(Long id);
    Employee save(EmployeeRequest request);
    Employee update(Long id, EmployeeRequest request);
    Employee convertToEmployee(Long id, EmployeeRequest request);
    void deleteById(Long id);
}
