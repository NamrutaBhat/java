package com.dev.devapp.facebook.dao;

import com.dev.devapp.facebook.dto.FaceBookDTO;
import java.sql.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import  static com.dev.devapp.facebook.constants.Constants.*;

public class FaceBookDAOImpl  implements FaceBookDAO{
	
	
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
	 
	 public void createFaceBook(FaceBookDTO bookDTO){
	        Connection connection = null;
	       // Statement statement = null;
	        PreparedStatement psmt=null;

	        try {
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql1", "root", "vinuvasu");
	            psmt=connection.prepareStatement("insert into facebook_table values(?,?,?,?)");
	            psmt.setInt(1, bookDTO.getId());
	            psmt.setString(2, bookDTO.getName());
	            psmt.setString(3, bookDTO.getEmail());
	            psmt.setString(4, bookDTO.getPassword());
	            
	            int i=psmt.executeUpdate();
	            System.out.println(i);
	            
	           // statement = connection.createStatement();
	          //  statement.execute("insert into facebook_table values(" + bookDTO.getId() + ",'" + bookDTO.getName() + "','" + bookDTO.getEmail() + "','" + bookDTO.getPassword() + "')");
	         //   statement.execute("insert into facebook_table values(?,?,?,?)");
	            
	            
	        } catch (ClassNotFoundException | SQLException e) {
	            e.printStackTrace();
	        } finally {
	            if (psmt!= null) {
	                try {
	                    psmt.close();
	                } catch (SQLException e) {
	                    e.printStackTrace();
	                }
	            }
	            if (connection!= null) {
	                try {
	                    ( connection).close();
	                } catch (SQLException e) {
	                    e.printStackTrace();
	                }
	            }

	        }

	    }

	    @Override
	    public List<String> getAllEmails() throws ClassNotFoundException, SQLException {
	       
		@Override
		public void updatePasswordByName(String password, String name) throws ClassNotFoundException, SQLException {
			PreparedStatement preparedstatement1 = null;
			   
		    try {
		    	preparedstatement1 = getConnection().prepareStatement(UPDATE_PASSWORD_BY_NAME);
		    	preparedstatement1.setString(1, password);
		    	preparedstatement1.setString(2, name);
		    	preparedstatement1.addBatch();
		        preparedstatement1.executeBatch();
		        connection.commit();
		    	 } catch (SQLException e) {
		             connection.rollback();
		         } finally {
		         	 preparedstatement1.close();
		         	 closeConnection();

		         }
		   
			}

		
		

		@Override
		public void deleteDetailsByName(String name) throws ClassNotFoundException, SQLException {
			PreparedStatement preparedstatement3 = null;
			try {
		    	preparedstatement3 = getConnection().prepareStatement(DELETE_QUERY);
		    	preparedstatement3.setString(1, name);
		    	preparedstatement3.addBatch();
		        preparedstatement3.executeBatch();
		        connection.commit();
		    	 } catch (SQLException e) {
		             connection.rollback();
		         } finally {
		         	 preparedstatement3.close();
		         	 closeConnection();

		         }
			
			
		}
			
		

	

		@Override
		public List<String> getPasswordByEmail(String email) throws ClassNotFoundException, SQLException {
			PreparedStatement preparedstatement2 = null;
			 List<String> password1 = new ArrayList<>();

	        try {
	            preparedstatement2 = getConnection().prepareStatement(SELECT_PASSWORD_BY_EMAIL);
	            preparedstatement2.setString(1, email);
	            ResultSet resultSet = preparedstatement2.executeQuery();
	           
	            while (resultSet.next()) {
	            password1.add(resultSet.getString("password"));
	           
	            }

	        } catch (SQLException e) {
	            e.printStackTrace();
	        } 
	        finally {
	        	preparedstatement2.close();
	        	
	        	closeConnection();
	        }
	        return password1;
		}
			
			
		

		@Override
		public List<String> getEmailByName(String name) throws ClassNotFoundException, SQLException {
			PreparedStatement preparedstatement3 = null;
			 List<String> email1 = new ArrayList<>();

	        try {
	           
	            preparedstatement3 = getConnection().prepareStatement(SELECT_EMAIL_BY_NAME);
	            preparedstatement3.setString(1, name);
	            ResultSet resultSet = preparedstatement3.executeQuery();
	           
	            while (resultSet.next()) {
	            email1.add(resultSet.getString("email"));
	           
	            }

	        } catch (SQLException e) {
	            e.printStackTrace();
	        } 
	        finally {
	        	preparedstatement3.close();
	        	
	        	closeConnection();
	        }
	        return email1;
		}
		
		@Override
		public List<String> getAllFaceBookDetails() throws ClassNotFoundException, SQLException {
			Statement statement = null;
	        List<String> emailAll = new ArrayList<>();

	        try {
	            
	            statement = getConnection().createStatement();
	            ResultSet resultSet = statement.executeQuery(SELECT_EMAILS_QUERY);
	            while (resultSet.next()) {
	              
	               emailAll.add(resultSet.getString("email"));
	            }

	        } catch (SQLException e) {
	            e.printStackTrace();
	        } 
	        finally {
	        	statement.close();
	        	
	        	closeConnection();
	        }
	        return emailAll;
		
		}

	    }

		
		

	


