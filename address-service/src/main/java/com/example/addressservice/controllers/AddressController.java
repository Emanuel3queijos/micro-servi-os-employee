package com.example.addressservice.controllers;


import com.example.addressservice.dtos.AddressDTO;
import com.example.addressservice.entities.Address;
import com.example.addressservice.services.AddressService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;

@RequiredArgsConstructor
@RestController
public class AddressController {


    private final AddressService addressService;


    @GetMapping("/address/{employeeId}")
    public ResponseEntity<AddressDTO> findAddressByiD(@PathVariable Long employeeId) {

        AddressDTO addressDTO = addressService.findAddressByEmployeeId(employeeId);

        return ResponseEntity.ok(addressDTO);
    }
    @PostMapping("/address/register")
    public ResponseEntity<AddressDTO> register(@RequestBody Address address) {
        AddressDTO addressDTO = addressService.register(address);
        return ResponseEntity.created(URI.create("/addresses/" + addressDTO.getId())).body(addressDTO);

    }




}
