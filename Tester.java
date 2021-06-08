package com.dev.devapp.facebook.dto;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.dev.devapp.facebook.dao.FaceBookDAO;
import com.dev.devapp.facebook.dao.FaceBookDAOImpl;
import com.dev.devapp.facebook.service.FaceBookService;
import com.dev.devapp.facebook.service.FaceBookServiceImpl;

public class Tester {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the id");
	        int id = sc.nextInt();
	        System.out.println("Enter the name");
	        String name = sc.next();
	        System.out.println("Enter the email");
	        String email= sc.next();
	        System.out.println("Enter the password");
	        String password = sc.next();

	        System.out.println();
	        FaceBookDTO fbDTO = new FaceBookDTO();

	        fbDTO.setId(id);
	        fbDTO.setName(name);
	        fbDTO.setEmail(email);
	        fbDTO.setPassword(password);

	        System.out.println(fbDTO);

	        FaceBookDAO bookDAO = new FaceBookDAOImpl();
	       
	        try {
				bookDAO.createFaceBook(fbDTO);
			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
	        
	        try {
				bookDAO.getAllFaceBookDetails();
			} catch (ClassNotFoundException | SQLException e) {
				
				e.printStackTrace();
			} 
	        
	        //Service Layer-validate the data/Business Logic 
	          
	        
	      List<FaceBookDTO> bookDTOs;
		try {
			bookDTOs = bookDAO.getAllFaceBookDetails();
			 for(FaceBookDTO facebookDTO :bookDTOs){
		            if(facebookDTO!=null) {
		                System.out.println(facebookDTO);
		} 
			 }
		}		catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} 
	        
	        System.out.println("--------");

	        //abstraction
	        FaceBookService bookService=new FaceBookServiceImpl();
	        try {
				bookService.validateAndSave(fbDTO);
				
			    }
	        catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			} 
				
	      
	      
	            //bookDTOs.foreach(System.out::println);
	        System.out.println("Enter to get emails");
	        int emails= sc.nextInt();
	        
	        for(int i =0;i<emails;i++) {
	        	
	        	System.out.println("Enter name to fetch email");
	            String name1 = sc.next();
	        	
	        	
	        try {
	        	List<String> emaill=bookService.validateAndgetAllEmails();
		
				for(String email1 :emaill){
		            if(email1!=null){
		                 System.out.println(email1.toString());
		            }
		         }
				
			} catch (ClassNotFoundException |SQLException e) {
				e.printStackTrace();
				
				}
	        
	        }

	        
	        
	        System.out.println("this is to fetch password by mail ");
	        int pas = sc.nextInt();
	        for(int j =0;j<pas;j++) {
	        	System.out.println("Enter email adress to fetch password");
	            String email1 = sc.next();
	        	
	        	
	        try {
	        	System.out.println("password");
	        	List<String> pass=bookService.validateAndgetPasswordFromEmail(email);
				for(String passswd :pass){
		            if(passswd!=null){
		                 System.out.println(passswd.toString());
		            }
		         }
				
			} catch (ClassNotFoundException |SQLException e) {
				e.printStackTrace();
				
				}
	        
	        
	     }
	        
	        
	        System.out.println("Enter the no of records to delete");
	    	
	    	int n = sc.nextInt();
	    	
	    	for(int i=0;i<n;i++) {
	    		
	    		System.out.println("Enter the name to delete");
	    		String name2 = sc.next();

	    		try {
	    			bookService.validateAndDelete(name2);
	    			System.out.println("deleted");
	    			
	    		} catch (ClassNotFoundException |SQLException e) {
	    			e.printStackTrace();
	    			
	    			}
	    			
	    	}
	    		
	    		try {
	    			bookService.getFaceBookDetails();
	    			
	    		} catch (ClassNotFoundException |SQLException e) {
	    			e.printStackTrace();
	    			
	    			}
	    		
	        

	}
}



