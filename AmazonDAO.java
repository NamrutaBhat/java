package com.xworkz.amazon.dao;

import java.sql.SQLException;
import java.util.List;

import com.xworkz.amazon.dto.AmazonDTO;


public interface AmazonDAO {

	public void  createAmazonApp(AmazonDTO bankDTO)  throws ClassNotFoundException , SQLException;
	public void updateAgeByName(int age  ,String userName) throws  ClassNotFoundException , SQLException;
	public void deleteUser(int userId) throws ClassNotFoundException , SQLException;
	public List<AmazonDTO> getAllOrderDetails() throws ClassNotFoundException,SQLException;
	
	
	
}
