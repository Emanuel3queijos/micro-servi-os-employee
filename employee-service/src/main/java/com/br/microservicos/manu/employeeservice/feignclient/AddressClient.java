package com.br.microservicos.manu.employeeservice.feignclient;

import com.br.microservicos.manu.employeeservice.dtos.AddressDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "address-service", url="http://localhost:8082/")
public interface AddressClient {
    @GetMapping("/address/{id}")
    AddressDto getAddressByEmployeeId(@PathVariable("id") Long id);

}
