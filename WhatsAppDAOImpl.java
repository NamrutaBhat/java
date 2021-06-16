package com.xworkz.whats_app.dao;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.whats_app.dto.WhatsAppDTO;

public class WhatsAppDAOImpl implements  WhatsAppDAO {
//dao will work with the method that is crud operation 
	@Override
	public void saveWhatsApp(WhatsAppDTO appDTO) {
	//hibernate logic
		
		Configuration configuration=new Configuration();
		configuration.configure();
		configuration.addAnnotatedClass(WhatsAppDTO.class);
		SessionFactory factory=configuration.buildSessionFactory();
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		session.save(appDTO);
		transaction.commit();
		session.close();
		factory.close();
		
		
	}

}
