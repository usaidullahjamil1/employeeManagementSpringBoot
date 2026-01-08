package net.javaguides.springboot_.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.javaguides.springboot_.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long>{

}
