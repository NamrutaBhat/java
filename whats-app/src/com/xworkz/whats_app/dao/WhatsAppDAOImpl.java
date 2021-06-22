package com.xworkz.whats_app.dao;



import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import com.xworkz.sweets.sweet.HibernateUtil;
import com.xworkz.whats_app.dto.WhatsAppDTO;

public class WhatsAppDAOImpl implements  WhatsAppDAO {
//dao will work with the method that is crud operation 
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

	public void getAllDetailsOfContacts() {
		
		Session session=null;
		Transaction transaction=null;
		try {
			
		
			SessionFactory factory=HibernateUtil.getSessionFactory();
		     session=factory.openSession();
			transaction = session.beginTransaction();
			 WhatsAppDTO whasAppDTO = session.get(WhatsAppDTO.class,1);
			 transaction = session.beginTransaction();
			 transaction .commit();
		}
		catch(HibernateException e) {
			if(transaction!=null) 
				transaction.rollback();
			
		}
			
			finally {
				if(session!=null) {
					session.close();
				}
				
			}	
	}
	

	public void updateStatusByContacts() {
		Session session=null;
		Transaction transaction=null;
		try {
		SessionFactory factory=HibernateUtil.getSessionFactory();
	     session=factory.openSession();
		transaction = session.beginTransaction();
		   WhatsAppDTO whasAppDTO = session.get(WhatsAppDTO.class,3);
		   whasAppDTO.setStatus("status");
		 transaction = session.beginTransaction();
		session.update(whasAppDTO);
		transaction.commit();
		}
		catch(HibernateException e) {
			if(transaction!=null) 
				transaction.rollback();
			
		}
			
			finally {
				if(session!=null) {
					session.close();
				}
				
			}	
	}

	public int deleteUserById(int id) {
		Session session=null;
		Transaction transaction=null;
		try {
		SessionFactory factory=HibernateUtil.getSessionFactory();
	     session=factory.openSession();
	     WhatsAppDTO whasAppDTO = session.get(WhatsAppDTO.class,id);
		transaction = session.beginTransaction();
		session.delete(whasAppDTO);
		transaction.commit();
		
		
	}
	catch(HibernateException e) {
		if(transaction!=null) 
			transaction.rollback();
		
	}
		
		finally {
			if(session!=null) {
				session.close();
			}
			
		}	
		return id;
	}

	public List<WhatsAppDTO> getAllWhatsAppDetails() {
		System.out.println("into method of getAllBluetoothSpeaker()");
		Session session=null;
		List<WhatsAppDTO> bluetoothSpeakerDTOs=new ArrayList<WhatsAppDTO>();
		try {
	 session= HibernateUtil.getSessionFactory().openSession();
	Query query=session.createQuery("select dto from BluetoothSpeakerDTO dto");
	bluetoothSpeakerDTOs=query.list();
	
	}catch(Exception e) {
		e.printStackTrace();
	}finally {
		if(session!=null) {
			session.close();
		}else {
			System.out.println("session cant be closed");
		}
		
		if(HibernateUtil.getSessionFactory()!=null) {
			HibernateUtil.getSessionFactory().close();
		}
	}
		return bluetoothSpeakerDTOs;
	}
	
	
	
}
