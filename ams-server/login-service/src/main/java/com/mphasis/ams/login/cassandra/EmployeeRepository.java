package com.mphasis.ams.login.cassandra;

import org.springframework.data.cassandra.repository.CassandraRepository;
//import org.springframework.data.cassandra.repository.Query;
//import org.springframework.data.repository.CrudRepository;

import com.mphasis.ams.login.cassandra.entity.Employee;

public interface EmployeeRepository extends CassandraRepository<Employee, Integer>
{
//	Employee findByEid(BigInteger eid);

//	@Query("Select * from customer where firstname=?0")
//	List<Employee> findByFirstName(String firstName);
//
//	@Query("Select * from customer where lastname=?0")
//	List<Employee> findByLastName(String lastName);

}
