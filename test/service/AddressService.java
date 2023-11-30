package com.example.addressservice.service;

import com.example.addressservice.dtos.AddressDto;
import com.example.addressservice.entity.Address;
import com.example.addressservice.repo.AddressRepo;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService
{

    private AddressRepo addressRepo;

    @Autowired
    private ModelMapper modelMapper;

    public AddressDto findAddressByEmployeeId(Long employeeId)
    {
        Address address = addressRepo.findAddressByEmployeeId(employeeId);
        return modelMapper.map(address, AddressDto.class);
    }

    public AddressDto createAddress(Address address){
        Address savedAddress = addressRepo.save(address);
        return modelMapper.map(savedAddress, AddressDto.class);
    }


}
