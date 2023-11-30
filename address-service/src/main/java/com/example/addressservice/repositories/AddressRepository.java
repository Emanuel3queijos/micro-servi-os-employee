package com.example.addressservice.repositories;

import com.example.addressservice.entities.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {

    Optional<Address> findById(Long id);

    Optional<Address>findAddressByEmployeeId(@Param("employeeId") Long id);
}
