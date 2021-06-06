package com.xworkz.blood_bank.dao;

import java.sql.SQLException;

import com.xworkz.blood_bank.dto.BloodBankDTO;

public interface BloodBankDAO {
	public void updateAgeByName(int age, String donorName) throws  ClassNotFoundException , SQLException;

	public void createBloodBank(BloodBankDTO bankDTO)  throws ClassNotFoundException , SQLException;
}
