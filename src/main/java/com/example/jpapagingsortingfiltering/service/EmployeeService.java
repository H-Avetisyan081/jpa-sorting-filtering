package com.example.jpapagingsortingfiltering.service;

import com.example.jpapagingsortingfiltering.model.Employee;
import com.example.jpapagingsortingfiltering.model.EmployeePage;
import com.example.jpapagingsortingfiltering.model.EmployeeSearchCriteria;
import com.example.jpapagingsortingfiltering.repository.EmployeeCriteriaRepository;
import com.example.jpapagingsortingfiltering.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmployeeService {
    private final EmployeeCriteriaRepository employeeCriteriaRepository;
    private final EmployeeRepository employeeRepository;

    public Page<Employee> getEmployees(EmployeePage employeePage, EmployeeSearchCriteria employeeSearchCriteria){
        return employeeCriteriaRepository.findAllFilters(employeePage,employeeSearchCriteria);
    }

    public Employee addEmployee( Employee employee){
        return employeeRepository.save(employee);
    }
}
