package com.codegen.services;

import com.codegen.dataModels.Contract;
import com.codegen.repositaries.contractRepositary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class contractService {

	@Autowired
	private contractRepositary contractrepositary;

	public List<Contract> getAllContracts(){
		List<Contract> allContracts = new ArrayList<>();
		contractrepositary.findAll().forEach(allContracts::add);
		return allContracts;
	}

	public void addContract(Contract contract){
		contractrepositary.save(contract);
	}

	public Contract getContract(int id){
		return contractrepositary.findById(id).get();
	}

	public void updateContract(Contract contract){
		contractrepositary.save(contract);
	}

	public void deleteContract(int id){
		contractrepositary.deleteById(id);
	}

}
