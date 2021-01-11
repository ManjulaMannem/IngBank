package com.bak.bankkata.repository;

import org.springframework.stereotype.Repository;

import com.bak.bankkata.model.CustomerAccountDetails;

import org.springframework.data.repository.CrudRepository;  

@Repository
public interface CustomerTransactionHistoryRepository extends CrudRepository<CustomerAccountDetails, Integer> {


}
