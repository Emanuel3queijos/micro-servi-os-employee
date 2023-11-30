package com.example.addressservice.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@RequiredArgsConstructor

public class AddressDTO {

    private Long id;
    private String cep;
    private String street;
    private String number;
    private Long employeeId;

}
