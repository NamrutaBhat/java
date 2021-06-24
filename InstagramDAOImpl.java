package com.xworkz.instagram.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.xworkz.instagram.dto.InstagramDTO;
import com.xworkz.spectshop.spects.dto.SpectsDTO;
import com.xworkz.sweets.sweet.HibernateUtil;

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

	@Override
	public InstagramDTO getAllDetailsOfInstaById(int id) {
		Session session=null;
		String hql="select dto from InstagramDTO dto where dto.instaId="+id+"";
		InstagramDTO instagramDTO=new InstagramDTO ();
		
		
		
		try {
		session=HibernateUtil.getSessionFactory().openSession();
	Query query=	session.createQuery(hql);
	instagramDTO=(InstagramDTO)query.uniqueResult();
		
	}
		catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(session!=null) {
				session.close();
			}
			else {
				System.out.println("session cant be closed");
			}
			
			if(HibernateUtil.getSessionFactory()!=null) {
				HibernateUtil.getSessionFactory().close();
			}
		}
			return instagramDTO;
	}

	@Override
	public String getStoryByName(String name) {
		Session session=null;
		String story=null;
		String hql="select dto.brand from InstagramDTO dto where dto.perfumesName='"+name+"'";
		InstagramDTO instagramDTO=new InstagramDTO ();
		try {
			session=HibernateUtil.getSessionFactory().openSession();
		Query query=	session.createQuery(hql);
		 story=(String)query.uniqueResult();
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(session!=null) {
				session.close();
			}
			else {
				System.out.println("session cant be closed");
			}
			
			if(HibernateUtil.getSessionFactory()!=null) {
				HibernateUtil.getSessionFactory().close();
			}
		}
			return  story;
	}

	@Override
	public Object[] getAccountTypeAndNameById(int id) {
		Session session=null;
		Object[] accountTypeAndName=null;
		String hql="select dto.accountType,dto.companyName from InstagramDTO dto where dto.instaId="+id+"";
		InstagramDTO instagramDTO=new InstagramDTO();
		try {
			session=HibernateUtil.getSessionFactory().openSession();
		Query query=	session.createQuery(hql);
		accountTypeAndName=(Object[])query.uniqueResult();
		return accountTypeAndName;	
		}
		catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(session!=null) {
				session.close();
			}
			else {
				System.out.println("session cant be closed");
			}
			
			if(HibernateUtil.getSessionFactory()!=null) {
				HibernateUtil.getSessionFactory().close();
			}
		}
			return null;
		
	}

	@Override
	public List getPasswordAndNameById(int id) {
		Session session=null;
		List passwordAndName=null;
		String hql="select dto.password,dto.perfumesName from InstagramDTO dto where dto.instaId="+id+"";
		InstagramDTO instagramDTO=new InstagramDTO();
		try {
			session=HibernateUtil.getSessionFactory().openSession();
		Query query=	session.createQuery(hql);
		passwordAndName=query.getResultList();
		return passwordAndName;	
		}
		catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(session!=null) {
				session.close();
			}
			else {
				System.out.println("session cant be closed");
			}
			
			if(HibernateUtil.getSessionFactory()!=null) {
				HibernateUtil.getSessionFactory().close();
			}
		}
			return null;
	}

}
