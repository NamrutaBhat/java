package com.xworkz.whats_app.service;

import java.util.List;


import com.xworkz.whats_app.dto.WhatsAppDTO;

public interface WhatsAppService {

	public void validateAndCreateWhatsApp(WhatsAppDTO appDTO);
	public void getAllDetailsOfContacts();
	public void updateStatusByContacts();
	public int deleteUserById(int id);
	public List<WhatsAppDTO> getAllWhatsAppDetails();
	
	
}
