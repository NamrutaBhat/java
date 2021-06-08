package com.dev.devapp.facebook.dao;

import com.dev.devapp.facebook.dto.FaceBookDTO;

import java.sql.SQLException;
import java.util.List;

public interface FaceBookDAO {
	
	   public void createFaceBook(FaceBookDTO bookDTO)throws ClassNotFoundException ,SQLException;
	    public List<FaceBookDTO> getAllFaceBookDetails()throws ClassNotFoundException ,SQLException;
	    
	    public void updatePasswordByName(String password,String name) throws ClassNotFoundException ,SQLException;
		public void deleteDetailsByName(String name) throws ClassNotFoundException ,SQLException;
		public List<String> getAllEmails()throws ClassNotFoundException, SQLException;
		public List<String> getPasswordByEmail(String email)throws ClassNotFoundException, SQLException;
		public List<String> getEmailByName(String name)throws ClassNotFoundException, SQLException;
	    

}
