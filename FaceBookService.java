package com.dev.devapp.facebook.service;

import java.sql.SQLException;
import java.util.List;

import com.dev.devapp.facebook.dto.FaceBookDTO;
import com.dev.devapp.facebook.dto.FaceBookDTO;

public interface FaceBookService {
	
	public void validateAndSave(FaceBookDTO bookDTO)throws ClassNotFoundException, SQLException;
	public List<FaceBookDTO> getFaceBookDetails()throws ClassNotFoundException, SQLException;
	public void validateAlongWithUpdate(String password,String name) throws ClassNotFoundException ,SQLException;
	public void validateAndDelete(String name) throws ClassNotFoundException ,SQLException;
	public List<String> validateAndgetAllEmails()throws ClassNotFoundException, SQLException;
	public List<String> validateAndgetPasswordFromEmail(String email)throws ClassNotFoundException, SQLException;
	public List<String> validateAndgetEmailByName(String name)throws ClassNotFoundException, SQLException;
	

}
