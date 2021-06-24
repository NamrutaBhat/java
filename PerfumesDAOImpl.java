package com.xworkz.perfumes.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.xworkz.perfumes.dto.PerfumesDTO;
import com.xworkz.sweets.sweet.HibernateUtil;





public class PerfumesDAOImpl implements PerfumesDAO{

	@Override
	public void createPerfumes(PerfumesDTO perfumesDTO) {
		Session session=null;
		Transaction transaction=null;
				
				try {
				SessionFactory factory=HibernateUtil.getSessionFactory();
			     session=factory.openSession();
				// factory=configuration.buildSessionFactory();
				// session=factory.openSession();
			      transaction=session.beginTransaction();
				session.save(perfumesDTO);
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

	@Override
	public PerfumesDTO getTheDetails(PerfumesDTO perfumesDTO) {
		Session session=null;
		Transaction transaction=null;
				
				try {
				SessionFactory factory=HibernateUtil.getSessionFactory();
			     session=factory.openSession();
			     transaction=session.beginTransaction();
					session.save(perfumesDTO);
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
				return perfumesDTO;	
	}

	@Override
	public void updatePriceByCompanyName(double price, String companyName) {
		Session session=null;
	Transaction transaction=null;
	try {
	SessionFactory factory=HibernateUtil.getSessionFactory();
     session=factory.openSession();
	transaction = session.beginTransaction();
	   PerfumesDTO perfumesDTO = session.get( PerfumesDTO.class,price);
	   perfumesDTO.setPrice(price);
	 transaction = session.beginTransaction();
	session.update(perfumesDTO);
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


	@Override
	public void deleteById(int id) {
		Session session=null;
		Transaction transaction=null;
		try {
		SessionFactory factory=HibernateUtil.getSessionFactory();
	     session=factory.openSession();
	     PerfumesDTO perfumesDTO = session.get(PerfumesDTO.class,id);
		transaction = session.beginTransaction();
		session.delete(perfumesDTO);
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

	@Override
	public List<PerfumesDTO> getAllPerfumesDetails() {
		System.out.println("into method of getAllperfumeDetails()");
		Session session=null;
		List<PerfumesDTO> perfumesDTOs=new ArrayList<PerfumesDTO>();
		try {
	 session= HibernateUtil.getSessionFactory().openSession();
	Query query=session.createQuery("select dto from PerfumesDTO dto");
	perfumesDTOs=query.list();
	
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
		
		return perfumesDTOs;
	}

	@Override
	public PerfumesDTO getAllDetailsById(int id) {
		Session session=null;
		String hql="select dto from PerfumesDTO dto where dto.perfumesId="+id+"";
		PerfumesDTO perfumesDTO=new PerfumesDTO ();
		
		
		
		try {
		session=HibernateUtil.getSessionFactory().openSession();
	Query query=	session.createQuery(hql);
	perfumesDTO=(PerfumesDTO)query.uniqueResult();
		
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
			return perfumesDTO;
	}

	@Override
	public String getNameByPrice(double price) {
		Session session=null;
		String perfumeName=null;
		String hql="select dto.perfumeName from PerfumesDTO dto where dto.price='"+price+"'";
		PerfumesDTO perfumesDTO=new PerfumesDTO();
		try {
			session=HibernateUtil.getSessionFactory().openSession();
		Query query=	session.createQuery(hql);
		perfumeName=(String)query.uniqueResult();
			
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
			return perfumeName;
	}

	@Override
	public Object[] getCompanyNameExpDateById(int id) {
		Session session=null;
		Object[] companyNameExpDate=null;
		String hql="select dto.companyName,dto.expDate from PerfumesDTO dto where dto.perfumesId="+id+"";
		PerfumesDTO perfumesDTO=new PerfumesDTO();
		try {
			session=HibernateUtil.getSessionFactory().openSession();
		Query query=	session.createQuery(hql);
		companyNameExpDate=(Object[])query.uniqueResult();
		return companyNameExpDate;	
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
	public List getPerfumeNameAndExpDateById(Object[] id) {
		Session session=null;
		List perfumeNameAndExpDate=null;
		String hql="select dto.perfumeName,dto.expDate from PerfumesDTO dto where dto.perfumesId="+id+"";
		PerfumesDTO perfumesDTO=new PerfumesDTO ();
		try {
			session=HibernateUtil.getSessionFactory().openSession();
		Query query=	session.createQuery(hql);
		 perfumeNameAndExpDate=query.getResultList();
		return  perfumeNameAndExpDate;	
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
				
		
	


