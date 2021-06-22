package com.xworkz.whats_app.dao;

import java.util.List;

import com.xworkz.whats_app.dto.WhatsAppDTO;

public interface WhatsAppDAO {

	//dao-persistence logic /database logic 
	public void saveWhatsApp(WhatsAppDTO appDTO);
	public void getAllDetailsOfContacts();
	public void updateStatusByContacts();
	public int deleteUserById(int id);
	public List<WhatsAppDTO> getAllWhatsAppDetails();
	
	
}
