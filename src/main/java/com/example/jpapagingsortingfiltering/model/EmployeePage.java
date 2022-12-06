package com.example.jpapagingsortingfiltering.model;


import lombok.Data;
import org.springframework.data.domain.Sort;

@Data
public class EmployeePage {
    private int pageNumber = 0;
    private int pageSize = 0;
    private Sort.Direction sortDirection = Sort.Direction.ASC;
    private String sortBy = "lastName";
}
