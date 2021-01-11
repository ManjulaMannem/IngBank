package com.bak.bankkata.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bak.bankkata.model.CustomerAccountDetails;
import com.bak.bankkata.repository.CustomerTransactionHistoryRepository;

@Service
public class CustomerTransactionHistoryService {

	@Autowired
	CustomerTransactionHistoryRepository historyRepos;

	public List<CustomerAccountDetails> getTxHistory(int accNo) {
		
		List<CustomerAccountDetails> customerAccountDetailsList = new ArrayList<CustomerAccountDetails>();
		historyRepos.findAll()
				.forEach(customeraccountdetails -> customerAccountDetailsList.add(customeraccountdetails));
		return customerAccountDetailsList;

	}

}
