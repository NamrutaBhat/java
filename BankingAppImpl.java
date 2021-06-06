package com.xworkz.banking_app.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.banking_app.dto.BankingAppDTO;

import static com.xworkz.banking_app.constants.Constants.DELETE_USER_BY_ACCOUNT_NO;
import static com.xworkz.banking_app.constants.Constants.DRIVER_CLASS_NAME;
import static com.xworkz.banking_app.constants.Constants.INSERT_QUERY;
import static com.xworkz.banking_app.constants.Constants.SELECT_QUERY;
import static com.xworkz.banking_app.constants.Constants.UPDATE_AGE_BY_DONOR_NAME;
import static com.xworkz.banking_app.constants.Constants.URL;

public class BankingAppImpl implements BankingAppDAO {

	@Override
	public void createBankApp(BankingAppDTO bankDTO) throws ClassNotFoundException, SQLException {
		
		Class.forName(DRIVER_CLASS_NAME);
		Connection con = DriverManager.getConnection(URL);
		PreparedStatement preparedStatement = con.prepareStatement(INSERT_QUERY);

		preparedStatement.setString(1,bankDTO.getUserName());
		preparedStatement.setInt(2,bankDTO.getAccountNumber());
		preparedStatement.setInt(3,bankDTO.getAge());
		preparedStatement.setString(4,bankDTO.getPassword());
		preparedStatement.setString(5,bankDTO.getAddress());
		preparedStatement.setString(6,bankDTO.getContactNumber());
		preparedStatement.setString(7,bankDTO.getEmail());
		
		preparedStatement.executeUpdate();
		preparedStatement.close();
		con.close();
		
	}

	@Override
	public void updateAgeByName(int age, String userName) throws ClassNotFoundException, SQLException {
		
		Class.forName(DRIVER_CLASS_NAME);
		Connection con = DriverManager.getConnection(URL);
		PreparedStatement preparedStatement = con.prepareStatement(UPDATE_AGE_BY_DONOR_NAME);
		preparedStatement.setInt(1, age);
		preparedStatement.setString(2, userName);
		
		preparedStatement.executeUpdate();
		preparedStatement.close();
		con.close();
	}

	@Override
	public void deleteUser(int accountNumber) throws ClassNotFoundException, SQLException {
		Class.forName(DRIVER_CLASS_NAME);
		Connection con = DriverManager.getConnection(URL);
		PreparedStatement preparedStatement = con.prepareStatement(DELETE_USER_BY_ACCOUNT_NO);
		preparedStatement.setInt(1, accountNumber );
		
		preparedStatement.executeUpdate();
		preparedStatement.close();
		con.close();
		
	}

}
