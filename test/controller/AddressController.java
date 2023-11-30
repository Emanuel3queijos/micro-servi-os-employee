package com.example.addressservice.controller;

import com.example.addressservice.dtos.AddressDto;
import com.example.addressservice.entity.Address;
import com.example.addressservice.service.AddressService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class AddressController
{
    @Autowired
    private AddressService addressService;

    @PostMapping("/address/create")
    public ResponseEntity<AddressDto> createAddress(@RequestBody Address address){

    AddressDto  addressDto = addressService.createAddress(address);
    return ResponseEntity.status(HttpStatus.CREATED).body(addressDto);


    }
    @GetMapping("/address/{employeeId}")
    public ResponseEntity<AddressDto> getAddressByEmployeeId(@PathVariable("employeeId")Long id)
    {
AddressDto  addressResponse = addressService.findAddressByEmployeeId(id);
        return ResponseEntity.status(HttpStatus.OK).body(addressResponse);
    }
}
