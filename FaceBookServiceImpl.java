package com.dev.devapp.facebook.service;

import java.sql.SQLException;
import java.util.List;

import com.dev.devapp.facebook.dao.FaceBookDAO;
import com.dev.devapp.facebook.dao.FaceBookDAOImpl;
import com.dev.devapp.facebook.dto.FaceBookDTO;


public class FaceBookServiceImpl  implements FaceBookService{

public FaceBookDAO faceBookDAO ;
	
	public   FaceBookServiceImpl()
	{
		faceBookDAO=new FaceBookDAOImpl();
	}
	@Override
	public void validateAndSave(FaceBookDTO bookDTO) throws ClassNotFoundException, SQLException {
		if(bookDTO!=null)
		{
			if(bookDTO.getId()>0&& bookDTO.getName()!=null &&bookDTO.getEmail()!=null &&bookDTO.getPassword()!=null){
				
				faceBookDAO.createFaceBook(bookDTO);
				
			}
		}
		
	}
	@Override
	public List<FaceBookDTO> getFaceBookDetails() throws ClassNotFoundException, SQLException {
		
		return faceBookDAO.getAllFaceBookDetails();
	}
	@Override
	public void validateAlongWithUpdate(String password, String name) throws ClassNotFoundException, SQLException {
if(password!=null && name!=null) {
			
			faceBookDAO.updatePasswordByName(password, name);
		}
			System.out.println("dont enter null values,it encounters with null pointer exception");
		
	}
		
	
	@Override
	public void validateAndDelete(String name) throws ClassNotFoundException, SQLException {
if( name!=null) {
			
			faceBookDAO.deleteDetailsByName(name);
		      }
		
	System.out.println("name not found");
		
	}

		
	
	@Override
	public List<String> validateAndgetAllEmails() throws ClassNotFoundException, SQLException {
		return faceBookDAO.getAllEmails();
	}
	@Override
	public List<String> validateAndgetPasswordFromEmail(String email) throws ClassNotFoundException, SQLException {
		return faceBookDAO.getPasswordByEmail(email);
	}
	@Override
	public List<String> validateAndgetEmailByName(String name) throws ClassNotFoundException, SQLException {
	//	if(name!=null)
		return faceBookDAO.getEmailByName(name);
		
	}
}
