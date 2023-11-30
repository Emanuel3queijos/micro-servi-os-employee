package com.br.microservicos.manu.employeeservice.repo;

import com.br.microservicos.manu.employeeservice.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Long>
{

}
