package com.jarmdev.employees.service;

import com.jarmdev.employees.dao.EmployeeDAO;
import com.jarmdev.employees.entity.Employee;
import com.jarmdev.employees.request.EmployeeRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final  EmployeeDAO employeeDAO;

    public EmployeeServiceImpl(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    @Override
    public List<Employee> findAll() {
        return employeeDAO.findAll();
    }

    @Override
    public Employee findById(Long id) {
        return employeeDAO.findById(id);
    }

    @Transactional
    @Override
    public Employee save(EmployeeRequest request) {
        return employeeDAO.save(convertToEmployee(0L, request));
    }

    @Transactional
    @Override
    public Employee update(Long id, EmployeeRequest request) {
        return employeeDAO.save(convertToEmployee(id, request));
    }

    @Override
    public Employee convertToEmployee(Long id, EmployeeRequest request) {
        return new Employee(id,
                request.getFirstName(),
                request.getLastName(),
                request.getEmail());
    }

    @Transactional
    @Override
    public void deleteById(Long id) {
        employeeDAO.deleteById(id);
    }


}
