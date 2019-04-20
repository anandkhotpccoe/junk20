package com.crud.path.repository;

import org.springframework.data.repository.CrudRepository;

import com.crud.path.entity.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

}
