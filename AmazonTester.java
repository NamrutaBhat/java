package com.xworkz.amazon;

import java.util.List;
import java.util.Scanner;

import com.xworkz.amazon.dto.AmazonDTO;
import com.xworkz.amazon.service.AmazonService;
import com.xworkz.amazon.service.AmazonServiceImpl;

import java.sql.SQLException;

public class AmazonTester {

	public static void main(String[] args) {
Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the entries of data:");
		int no = s.nextInt();
		
		for(int i=0;i<no;i++) {
			
		
		    AmazonDTO amazonDTO = new AmazonDTO();	
			System.out.println("Enter  user name");
			amazonDTO.setUserName(s.next());
			
			System.out.println("Enter age");
			amazonDTO.setAge(s.nextInt());
			
			System.out.println("Enter email");
			amazonDTO.setEmail(s.next());
			
			System.out.println("Enter contact number");
			amazonDTO.setContactNumber(s.next());;
			
			
			System.out.println("Enter password");
			amazonDTO.setPassword(s.next());
			
			System.out.println("Enter total amount");
			amazonDTO.setOrderNames(s.next());
			
			System.out.println(amazonDTO);
			System.out.println();
			
			AmazonService amazonService = new AmazonServiceImpl();
			try {
				amazonService.createAmazonApp(amazonDTO);
				
			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
				
				}
			
		}
		
		AmazonService amazonService = new AmazonServiceImpl();
	
		System.out.println("Enter the records that need to be updated");
		
		int noOfRecord = s.nextInt();
		
		for(int i=0;i< noOfRecord;i++) {
		
			System.out.println("Enter Name ");
			String userName = s.next();
			System.out.println("Enter age");
			int age = s.nextInt();
		
		try {
			amazonService.updateAgeByName(age, userName);
			System.out.println("age is updated");
			
		} catch (ClassNotFoundException |SQLException e) {
			e.printStackTrace();
			
			}
		
		}
		
		System.out.println("Enter the no. of records  to delete");
		
		int toDelete = s.nextInt();
		
		for(int i=0;i<toDelete;i++) {
			
			System.out.println("Enter the userId to delete");
			int userId = s.nextInt();
		
		try {
			amazonService.deleteUser(userId);
			
			
		} catch (ClassNotFoundException |SQLException e) {
			e.printStackTrace();
			
			}
		}
			
			
		
		try {
			amazonService.getAllOrderNames();
			System.out.println("details list");	
			
		} catch (ClassNotFoundException |SQLException e) {
			e.printStackTrace();
			
			}
		
		
		
		AmazonService amService = new AmazonServiceImpl();
		
		List<AmazonDTO> amazonDTOs;
		try {
			amazonDTOs = amService.getAllOrderNames();
			 for(AmazonDTO amazonDTO :amazonDTOs){
		           if(amazonDTO!=null){
		                System.out.println(amazonDTO);
		           }
		        }
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
         
       
		
	}


	}


