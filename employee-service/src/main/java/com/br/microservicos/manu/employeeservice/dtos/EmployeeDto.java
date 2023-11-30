package com.br.microservicos.manu.employeeservice.dtos;

import lombok.Data;

@Data
public class EmployeeDto
{
    private Long id;
    private String name;
    private String email;
    private AddressDto addressDto;

}
