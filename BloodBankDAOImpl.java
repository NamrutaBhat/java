package com.xworkz.blood_bank.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


import com.xworkz.blood_bank.dto.BloodBankDTO;

import static com.xworkz.blood_bank.constants.Constants.DRIVER_CLASS_NAME;
import static com.xworkz.blood_bank.constants.Constants.INSERT_QUERY;
import static com.xworkz.blood_bank.constants.Constants.URL;
import static com.xworkz.blood_bank.constants.Constants.UPDATE_AGE_BY_DONOR_NAME;

public class BloodBankDAOImpl implements BloodBankDAO {

	@Override
	public void createBloodBank(BloodBankDTO bankDTO)  throws ClassNotFoundException, SQLException  {
		Class.forName(DRIVER_CLASS_NAME);
		Connection con = DriverManager.getConnection(URL);
		PreparedStatement preparedStatement = con.prepareStatement(INSERT_QUERY);
				
				preparedStatement.setInt(1,bankDTO.getBloodBankId());
				preparedStatement.setString(2,bankDTO.getDonorName());
				preparedStatement.setInt(3,bankDTO.getDonorAge());
				preparedStatement.setLong(4,bankDTO.getContactNo());
				preparedStatement.setBoolean(5,bankDTO.isSmoker());
				preparedStatement.setString(6,bankDTO.getBloodBankLocation());
				preparedStatement.executeUpdate();
				preparedStatement.close();
				con.close();
				
				
				
	}
	
	
	public void updateAgeByName(int age, String donorName) throws ClassNotFoundException, SQLException {
		Class.forName(DRIVER_CLASS_NAME);
		Connection con = DriverManager.getConnection(URL);
		PreparedStatement preparedStatement = con.prepareStatement(UPDATE_AGE_BY_DONOR_NAME);
		preparedStatement.setInt(1, age);
		preparedStatement.setString(2, donorName);

		preparedStatement.executeUpdate();

		preparedStatement.close();
		con.close();
		
	}
	
	

}
