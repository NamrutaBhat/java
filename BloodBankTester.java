package com.xworkz.blood_bank;

import java.sql.SQLException;
import java.util.Scanner;

import com.xworkz.blood_bank.dto.BloodBankDTO;
import com.xworkz.blood_bank.service.BloodBankService;
import com.xworkz.blood_bank.service.BloodBankServiceImpl;

public class BloodBankTester {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		
		 
		 
		 BloodBankDTO dto=new BloodBankDTO();
		 System.out.println("enter id");
		 dto.setBloodBankId(sc.nextInt());
		 
		 System.out.println("enter name");
		 dto.setDonorName(sc.next());
		 
		 System.out.println("enter age");
		 dto.setDonorAge(sc.nextInt());
		 
		 System.out.println("enter contact number");
		 dto.setContactNo(sc.nextLong());
		 
		 System.out.println("enter smoker or not");
		 dto.setSmoker(sc.nextBoolean());
		 
		 System.out.println("enter location");
		 dto.setBloodBankLocation(sc.next());
		 
		 
		 BloodBankService bankService = new BloodBankServiceImpl();
			try {
				bankService.validateAndSave(dto);

			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}


	}

}
