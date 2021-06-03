package com.work.jdbc.dto;

public class VaccineDTOEx {
	
	private String name;
	private String mfgDate;
	private int quantity;
	
	public VaccineDTOEx() {
		System.out.println("");
	
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMfgDate() {
		return mfgDate;
	}
	public void setMfgDate(String mfgDate) {
		this.mfgDate = mfgDate;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	
}


