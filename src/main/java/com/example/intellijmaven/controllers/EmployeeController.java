package com.example.intellijmaven.controllers;

import com.example.intellijmaven.entities.Employee;
import com.example.intellijmaven.repositories.EmployeeRepository;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
    private EmployeeRepository repository;

    public EmployeeController(EmployeeRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public @ResponseBody
    Iterable<Employee> getEmployees() {
        return repository.findAll();
    }

    @PostMapping
    public @ResponseBody Employee addEmployee(@RequestBody Employee newEmployee) {
        newEmployee = repository.save(newEmployee);
        return newEmployee;
    }

    @GetMapping("/{id}")
    public @ResponseBody Optional<Employee> getEmployee(@PathVariable Long id) {
        return repository.findById(id);
    }
}
