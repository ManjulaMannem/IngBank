package com.bak.bankkata.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.bak.bankkata.model.CustomerAccountDetails;
import com.bak.bankkata.service.CustomerTransactionHistoryService;

@RestController
public class CustomerTransactionHistoryController {
	@Autowired  
	CustomerTransactionHistoryService txHisService ;  
	@GetMapping("/getHistory/{accno}")  
	public String getTxHistory (@PathVariable int accNo)   
	{  
		try {
			List<CustomerAccountDetails> customerAccountDetailsList = txHisService.getTxHistory(accNo);
			  System.out.println(customerAccountDetailsList);  
		}
		catch(Exception e) {
			//System.out.println(e.getStackTrace().toString());
		}
		return null;
	}  
}
