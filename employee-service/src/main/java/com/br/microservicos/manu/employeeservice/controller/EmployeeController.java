package com.br.microservicos.manu.employeeservice.controller;

import com.br.microservicos.manu.employeeservice.dtos.EmployeeDto;
import com.br.microservicos.manu.employeeservice.entity.Employee;
import com.br.microservicos.manu.employeeservice.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees/{id}")
    ResponseEntity<EmployeeDto> getEmployeeDetails(@PathVariable("id") Long id) {

        EmployeeDto
                employeeResponse = employeeService.getEmployeeById(id);
        return ResponseEntity.status(HttpStatus.OK).body(employeeResponse);

    }

    @PostMapping("/employee/register")
    ResponseEntity<EmployeeDto>createEmployee(@RequestBody Employee employee){
        EmployeeDto employeeDto = employeeService.create(employee);
        return ResponseEntity.status(HttpStatus.CREATED).body(employeeDto);
    }
}
