package com.work.jdbc.dto;

public class Vaccine {

	public static void main(String[] args) {
		VaccineDTOEx vaccinedtoEx=new VaccineDTOEx();
		vaccinedtoEx.setMfgDate("jan 2021");
		vaccinedtoEx.setName("CoviShield");
		vaccinedtoEx.setQuantity(5);
	
		System.out.println(vaccinedtoEx.getMfgDate());
		System.out.println(vaccinedtoEx.getName());
		System.out.println(vaccinedtoEx.getQuantity());

	}

}
