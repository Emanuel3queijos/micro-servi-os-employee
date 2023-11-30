package com.example.addressservice.repo;

import com.example.addressservice.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepo extends JpaRepository<Address, Long>
{
        //address based on an employeeid
        Address findAddressByEmployeeId(@Param("employeeId") Long employeeId);
}
