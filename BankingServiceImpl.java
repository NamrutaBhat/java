package com.xworkz.banking_app.service;

import java.sql.SQLException;

import com.xworkz.banking_app.dao.BankingAppDAO;
import com.xworkz.banking_app.dao.BankingAppImpl;
import com.xworkz.banking_app.dto.BankingAppDTO;


public class BankingServiceImpl implements BankingAppService {

	private BankingAppDAO bankingAppDAO;

	public BankingServiceImpl() {

		bankingAppDAO = new BankingAppImpl();
	}
	
	@Override
	public void validateAndSave(BankingAppDTO bankDTO) throws ClassNotFoundException, SQLException {
		if (bankDTO != null) {
			if (bankDTO.getAge() > 18 && bankDTO.getUserName() != null) {
				bankingAppDAO.createBankApp(bankDTO);
			}
			else {
				System.out.println("Sorry !.. We are unable to process that data");
			}
		}
		else {
			System.out.println("Found Empty Object ... Please fill the data Again..");
		}
		
	}

	@Override
	public void updateAgeByName(int age, String userName) throws ClassNotFoundException, SQLException {
		
		if(age > 18 && userName != null)
		{
			bankingAppDAO.updateAgeByName(age, userName);
		}
	}

	@Override
	public void deleteUser(int accountNumber) throws ClassNotFoundException, SQLException {
		if(accountNumber >0) {
			bankingAppDAO.deleteUser(accountNumber);
		}
	}

	
}
