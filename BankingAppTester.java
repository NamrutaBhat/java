package com.xworkz.banking_app;

import java.sql.SQLException;
import java.util.Scanner;

import com.xworkz.banking_app.dto.BankingAppDTO;
import com.xworkz.banking_app.service.BankingAppService;
import com.xworkz.banking_app.service.BankingServiceImpl;


public class BankingAppTester {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {   
	Scanner sc=new Scanner(System.in);
	
	BankingAppDTO bankDTO=new BankingAppDTO();
	
	System.out.println("enter user name");
	bankDTO.setUserName(sc.next());
	
	System.out.println("enter account number");
	bankDTO.setAccountNumber(sc.nextInt());
	
	System.out.println("enter age");
	bankDTO.setAge(sc.nextInt());
	
	System.out.println("enter password");
	bankDTO.setAddress(sc.next());
	
	System.out.println("enter address");
	bankDTO.setAddress(sc.next());
	
	System.out.println("enter contact number");
	bankDTO.setContactNumber(sc.next());
	
	System.out.println("enter email");
	bankDTO.setEmail(sc.next());
	
	
	 BankingServiceImpl bankService =new  BankingServiceImpl();
		bankService.validateAndSave(bankDTO);
	
	
	

	}

}
