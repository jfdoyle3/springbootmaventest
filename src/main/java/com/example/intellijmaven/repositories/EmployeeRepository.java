package com.example.intellijmaven.repositories;

import com.example.intellijmaven.entities.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {
}
