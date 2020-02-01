package com.huytran;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface CustomerResponsitory extends CrudRepository<Customer, Long> {

	@Query("FROM Customer AS c WHERE c.lastname=:lastname")
	public List<Customer> findByLastname(@Param("lastname") String lastname);

}
