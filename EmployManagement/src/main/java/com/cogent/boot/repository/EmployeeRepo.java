package com.cogent.boot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cogent.boot.entity.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Long> {

	//trying to add customize methods that going to add additional methods
	// we cab add n number of methods here that will be user defined
	// now here we can use the power of Native query and hit some queries on the database
	
	@Query(value = "SELECT e FROM Employee e ORDER BY name")
	public List<Employee> findAllSortedByName();
	
	@Query(value = "select * from employee order by salary", nativeQuery=true)
	public List<Employee> findAllSortedBySalary();
	
	@Query(value = "SELECT e FROM Employee e WHERE e.name =:name ")
	public Employee findEmployeeByName(@Param("name") String name);
	
}
