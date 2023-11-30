package com.br.microservicos.manu.employeeservice.service;

import com.br.microservicos.manu.employeeservice.dtos.AddressDto;
import com.br.microservicos.manu.employeeservice.dtos.EmployeeDto;
import com.br.microservicos.manu.employeeservice.entity.Employee;
import com.br.microservicos.manu.employeeservice.feignclient.AddressClient;
import com.br.microservicos.manu.employeeservice.repo.EmployeeRepo;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;


@Service
public class EmployeeService
{
    @Autowired
    private EmployeeRepo employeeRepo;

    @Autowired
    public ModelMapper modelMapper;


    @Autowired
    AddressClient addressClient;



    public EmployeeDto create(Employee employeeDto){

        Employee savedEmployee = employeeRepo.save(employeeDto);
        return modelMapper.map(savedEmployee, EmployeeDto.class);
    }


    public EmployeeDto getEmployeeById(Long id)
    {
        Employee employee = employeeRepo.findById(id).get(); //db call
        EmployeeDto employeeResponse = modelMapper.map(employee, EmployeeDto.class);
        AddressDto addressResponse = addressClient.getAddressByEmployeeId(id);
        employeeResponse.setAddressDto(addressResponse);
        return employeeResponse;
    }

}
