package com.codegen.controllers;

import com.codegen.dataModels.Contract;
import com.codegen.services.contractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class contractControler {

	@Autowired
	private contractService contractservice;

	@RequestMapping("/contracts")
	public List<Contract> getAllContracts(){
		return contractservice.getAllContracts();
	}

	@RequestMapping("/contracts/{contractId}")
	public Optional<Contract> getContract(@PathVariable(value ="contractId" ) int contractId){
		return Optional.ofNullable( contractservice.getContract( contractId ) );
	}

	@RequestMapping(value = "/contracts", method = RequestMethod.POST)
	public void addContract(@RequestBody Contract contract){
		contractservice.addContract(contract);
	}


}
