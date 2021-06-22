package com.xworkz.sweets.sweet;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

public static  SessionFactory sessionFactory=null;
public static  SessionFactory getSessionFactory() {
	return sessionFactory;
}
static
{
	Configuration config = new Configuration();
	config.configure();
	sessionFactory = config.buildSessionFactory();
}
}
