package com.xworkz.banking_app.service;

import java.sql.SQLException;

import com.xworkz.banking_app.dto.BankingAppDTO;

public interface BankingAppService {

	public void validateAndSave(BankingAppDTO bloodBankDTO) throws ClassNotFoundException, SQLException ;
	public void updateAgeByName(int age , String userName) throws ClassNotFoundException, SQLException ; 
	public void deleteUser(int accountNumber) throws ClassNotFoundException , SQLException;
	
}
