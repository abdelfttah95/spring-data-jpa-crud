package com.blabla.springboot.crud.dao;

import com.blabla.springboot.crud.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 *
 * @author abdel
 */
//@RepositoryRestResource(path = "members")
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
    // there is no need to write any  code for CRUD operations 
    // that is the benifit of spring data jpa ...
}
