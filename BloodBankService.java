package com.xworkz.blood_bank.service;

import java.sql.SQLException;

import com.xworkz.blood_bank.dto.BloodBankDTO;

public interface BloodBankService {
	
	
	public void validateAndSave(BloodBankDTO bloodBankDTO) throws ClassNotFoundException, SQLException ;
	public void updateAgeByName(int age , String donorName) throws ClassNotFoundException, SQLException ; 

}
