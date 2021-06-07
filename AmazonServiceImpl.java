package com.xworkz.amazon.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.xworkz.amazon.dao.AmazonDAO;
import com.xworkz.amazon.dao.AmazonDAOImpl;
import com.xworkz.amazon.dto.AmazonDTO;

import static com.xworkz.amazon.constants.Constants.DELETE_USER_BY_ACCOUNT_NO;
import static com.xworkz.amazon.constants.Constants.DRIVER_CLASS_NAME;
import static com.xworkz.amazon.constants.Constants.INSERT_QUERY;
import static com.xworkz.amazon.constants.Constants.UPDATE_AGE_BY_USER_NAME;
import static com.xworkz.amazon.constants.Constants.*;

public class AmazonServiceImpl implements AmazonService{
	
Connection connection = null;
	
	private Connection getConnection() {
		try {
			Class.forName(DRIVER_CLASS_NAME);
			connection = DriverManager.getConnection(URL);
			connection.setAutoCommit(false);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return connection;
			
	}
	
	private void closeConnection() {
		try {
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	

	public AmazonDAO amazonDAO;
	
	public AmazonServiceImpl(){
		
		amazonDAO = new AmazonDAOImpl();
		
	}

	@Override
	public void createAmazonApp(AmazonDTO bankDTO) throws ClassNotFoundException, SQLException {
		if(bankDTO!=null) {
			if(bankDTO.getUserName()!=null &&bankDTO.getAge()>18 &&bankDTO.getEmail()!=null) {
				amazonDAO.createAmazonApp(bankDTO);
			}
			else {
				System.out.println("Sorry ! unable to create the account");
			}
		}
	}

	@Override
	public void updateAgeByName(int age, String userName) throws ClassNotFoundException, SQLException {
		if(age > 18 && userName != null)
		{
			amazonDAO.updateAgeByName(age, userName);
		}
		
		
	}

	@Override
	public void deleteUser(int userId) throws ClassNotFoundException, SQLException {
		if(userId>0) {
			amazonDAO.deleteUser(userId);
		}
		else {
			System.out.println("user id doesnt exists");
		}
		
	}

	
	public List<AmazonDTO> getAllOrderNames() throws ClassNotFoundException, SQLException {
		Statement statement = getConnection().createStatement();
		ResultSet resultSet=statement.executeQuery(SELECT_QUERY);
		List<AmazonDTO> amazonDTOs = new ArrayList<>();
		
		while (resultSet.next()) {

            AmazonDTO bankDTO = new AmazonDTO();
            bankDTO.setUserName(resultSet.getString("user_name"));
            bankDTO.setAge(resultSet.getInt(2));
            bankDTO.setEmail(resultSet.getString("email"));
            bankDTO.setContactNumber(resultSet.getString("contact_no"));
            bankDTO.setPassword(resultSet.getString("password"));
            bankDTO.setOrderNames(resultSet.getString("order_detail"));
            amazonDTOs.add(bankDTO);
		}
		
		statement.close();
		closeConnection();
		return amazonDTOs;	  

	}
	



}
