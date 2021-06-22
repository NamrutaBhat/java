package com.xworkz.whats_app.service;

import java.util.List;

import com.xworkz.whats_app.dao.WhatsAppDAO;
import com.xworkz.whats_app.dao.WhatsAppDAOImpl;
import com.xworkz.whats_app.dto.WhatsAppDTO;


//service layer-> validation/business logic
public class WhatsAppServiceImpl implements WhatsAppService{
	
	// service layer has a relationship with dao
	private WhatsAppDAO  whatsAppDAO;
	public WhatsAppServiceImpl() {
		whatsAppDAO=new WhatsAppDAOImpl();
		
	}

	public void validateAndCreateWhatsApp(WhatsAppDTO appDTO) {
		 if(appDTO!=null) {
			 if(appDTO.getContacts() > 0)
			 whatsAppDAO.saveWhatsApp(appDTO);
		 }
		 else
		 {
			 System.out.println(" Sorry!!that contact does not exist..");
		 }
		
		
	}

	public void getAllDetailsOfContacts() {
		whatsAppDAO.getAllDetailsOfContacts();
		
	}

	public void updateStatusByContacts() {
		whatsAppDAO.updateStatusByContacts();
		
	}

	public int deleteUserById(int id) {
		if(id>0) {
		 whatsAppDAO.deleteUserById(id);
		}
		else
		{
			System.out.println("id doesn't exists");
		}
		return id;
	}

	public List<WhatsAppDTO> getAllWhatsAppDetails() {
	return  whatsAppDAO.getAllWhatsAppDetails();
	}
	
	

}
