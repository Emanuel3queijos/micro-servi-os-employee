package com.example.addressservice.services;

import com.example.addressservice.dtos.AddressDTO;
import com.example.addressservice.entities.Address;
import com.example.addressservice.exceptions.AppException;
import com.example.addressservice.repositories.AddressRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class AddressService {


    @Autowired
    private ModelMapper modelMapper;


    private final AddressRepository addressRepository;


    public AddressDTO findAddressByEmployeeId(Long employeeId) {
        Address address= addressRepository.findAddressByEmployeeId(employeeId).orElseThrow(() -> new AppException("", HttpStatus.NOT_FOUND));

        return modelMapper.map(address, AddressDTO.class);
    }

    public AddressDTO register(Address address) {
        Address savedAddress = addressRepository.save(address);
        return modelMapper.map(savedAddress, AddressDTO.class);
    }


}
