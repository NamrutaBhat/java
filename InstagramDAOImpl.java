package com.xworkz.instagram.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import com.xworkz.instagram.dto.InstagramDTO;

public class InstagramDAOImpl implements InstagramDAO {

	@Override
	public void save(InstagramDTO instagramDTO) {
		Configuration configuration=new Configuration();
		configuration.configure();
		configuration.addAnnotatedClass(InstagramDTO.class);
		SessionFactory factory=configuration.buildSessionFactory();
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		session.save(instagramDTO);
		transaction.commit();
		session.close();
		factory.close();
		
	}

	@Override
	public InstagramDTO getAllStories(InstagramDTO instagramDTO) {
		
		Configuration configuration=new Configuration();
		configuration.configure();
		configuration.addAnnotatedClass(InstagramDTO.class);
		SessionFactory factory=configuration.buildSessionFactory();
		Session session=factory.openSession();
		InstagramDTO instagramDTO1=session.get(InstagramDTO.class,1);
		session.close();
		factory.close();
		return instagramDTO1;
	}

	@Override
	public void updatePasswordByName(String name, String password) {
		Configuration configuration=new Configuration();
		configuration.configure();
		configuration.addAnnotatedClass(InstagramDTO.class);
		SessionFactory factory=configuration.buildSessionFactory();
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		InstagramDTO instagramDTO1=session.get(InstagramDTO.class,1);
		if(instagramDTO1!=null)
		{
			instagramDTO1.setPassword(password);
			instagramDTO1.setName(name);
			session.update(instagramDTO1);
		}
		transaction.commit();
		session.close();
		factory.close();
		
		
	}

	@Override
	public void deleteUserById(int id, String name) {
		Configuration config = new Configuration();
		config.configure();
		config.addAnnotatedClass(InstagramDTO.class);
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();
		InstagramDTO bluetoothSpeakerDTO2 = session.get(InstagramDTO.class,id);
		Transaction transaction = session.beginTransaction();
		session.delete(bluetoothSpeakerDTO2 );
		transaction.commit();
		session.close();
		factory.close();
		
	}

}
