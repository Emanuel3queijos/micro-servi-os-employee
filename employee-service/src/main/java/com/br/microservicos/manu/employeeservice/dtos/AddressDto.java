package com.br.microservicos.manu.employeeservice.dtos;

import lombok.Data;

@Data
public class AddressDto {
    private Long id;
    private String cep;
    private String street;
    private String number;

}
