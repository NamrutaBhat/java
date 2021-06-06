package com.xworkz.banking_app.dao;

import java.sql.SQLException;

import com.xworkz.banking_app.dto.BankingAppDTO;

public interface BankingAppDAO {

	public void  createBankApp(BankingAppDTO bankDTO)  throws ClassNotFoundException , SQLException;
	public void updateAgeByName(int age  ,String userName) throws  ClassNotFoundException , SQLException;
	public void deleteUser(int accountNumber) throws ClassNotFoundException , SQLException;

}
