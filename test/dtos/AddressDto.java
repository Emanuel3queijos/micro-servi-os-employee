package com.example.addressservice.dtos;

import lombok.Data;

@Data
public class AddressDto {
private Long id;
private String cep;
private String street;
private String number;

}
