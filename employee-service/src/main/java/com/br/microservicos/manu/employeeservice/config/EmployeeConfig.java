package com.br.microservicos.manu.employeeservice.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmployeeConfig
{

    @Bean
    public ModelMapper modelMapper()
    {
        return new ModelMapper();
    }

}