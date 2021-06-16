package com.xworkz.whats_app.service;

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

	@Override
	public void validateAndCreateWhatsApp(WhatsAppDTO appDTO) {
		 if(appDTO!=null) {
			 if(appDTO.getContacts() > 0)
			 whatsAppDAO.saveWhatsApp(appDTO);
		 }
		
		
		
	}
	
	

}
