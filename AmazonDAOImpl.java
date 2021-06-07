package com.xworkz.amazon.dao;

import static com.xworkz.amazon.constants.Constants.DELETE_USER_BY_ACCOUNT_NO;
import static com.xworkz.amazon.constants.Constants.DRIVER_CLASS_NAME;
import static com.xworkz.amazon.constants.Constants.INSERT_QUERY;
import static com.xworkz.amazon.constants.Constants.UPDATE_AGE_BY_USER_NAME;
import static com.xworkz.amazon.constants.Constants.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.xworkz.amazon.dto.AmazonDTO;

public class AmazonDAOImpl implements AmazonDAO{
	
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


	@Override
	public void createAmazonApp(AmazonDTO bankDTO) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		
		
		PreparedStatement preparedStatement1=null;
		try {
			preparedStatement1 = getConnection().prepareStatement(INSERT_QUERY);
			preparedStatement1.setString(1, bankDTO.getUserName());
			preparedStatement1.setInt(2, bankDTO.getAge());
			preparedStatement1.setString(3, bankDTO.getEmail());
			preparedStatement1.setString(4, bankDTO.getContactNumber());
			preparedStatement1.setString(5, bankDTO.getPassword());
			preparedStatement1.setString(6, bankDTO.getOrderNames());
			preparedStatement1.addBatch();
			preparedStatement1.executeBatch();
			connection.commit();
			
		} catch (SQLException e) {
			connection.rollback();
		}
		finally {
			preparedStatement1.close();
			closeConnection();
		}
		
		}

	

	@Override
	public void updateAgeByName(int age, String userName) throws ClassNotFoundException, SQLException {
		
		PreparedStatement preparedStatement2 =null;
		try {
			preparedStatement2 = getConnection().prepareStatement(UPDATE_AGE_BY_USER_NAME);
			preparedStatement2.setInt(1,age);
			preparedStatement2.setString(2, userName);
			preparedStatement2.addBatch();
			preparedStatement2.executeBatch();
			connection.commit();
		} catch (SQLException e) {
			connection.rollback();
		}
		
		finally {
			preparedStatement2.close();
			closeConnection();
		}
		
	}

	@Override
	public void deleteUser(int userId) throws ClassNotFoundException, SQLException {
	
		PreparedStatement preparedStatement3 =null;
		try {
			preparedStatement3 = getConnection().prepareStatement(DELETE_USER_BY_ACCOUNT_NO);
			preparedStatement3.setInt(1, userId);
			preparedStatement3.addBatch();
			preparedStatement3.executeBatch();
			connection.commit();
		} catch (SQLException e) {
			
			connection.rollback();
		}
		finally {
			preparedStatement3.close();
			closeConnection();
		}
		
	}

	@Override
	public List<AmazonDTO> getAllOrderDetails() throws ClassNotFoundException, SQLException {
		Statement statement = getConnection().createStatement();
		ResultSet resultSet=statement.executeQuery(SELECT_QUERY);
		List<AmazonDTO> amazonDTOs = new ArrayList<>();
		
		while (resultSet.next()) {

            AmazonDTO bankDTO = new AmazonDTO();
            bankDTO.setUserName(resultSet.getString("id"));
        	bankDTO.setOrderNames(resultSet.getString("amazon_order"));
            amazonDTOs.add(bankDTO);
		}
		
		statement.close();
		closeConnection();
		return amazonDTOs;	  


	}

	}
	
	


