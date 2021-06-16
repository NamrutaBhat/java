package com.xworkz.whats_app;

import com.xworkz.whats_app.constants.StatusPrivacy;
import com.xworkz.whats_app.dto.WhatsAppDTO;
import com.xworkz.whats_app.service.WhatsAppService;
import com.xworkz.whats_app.service.WhatsAppServiceImpl;

public class WhatsAppTester {

	public static void main(String[] args) {
		WhatsAppDTO appDTO=	new WhatsAppDTO();
		
		appDTO.setWhatsappId(1);
		appDTO.setPrivacy(StatusPrivacy.MY_CONTACTS);
		appDTO.setContacts(8454679898L);
		appDTO.setChat("hii");
		appDTO.setStatus("qhoutes");
		
		WhatsAppService whatsAppService=new WhatsAppServiceImpl();
		whatsAppService.validateAndCreateWhatsApp(appDTO);																																																																																																																																																																																		
		
		

	}

}
