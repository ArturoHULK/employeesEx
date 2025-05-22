package com.jarmdev.employees.dao;

import com.jarmdev.employees.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> findAll();
    Employee findById(Long id);
    Employee save(Employee employee);
    void deleteById(Long id);

}
