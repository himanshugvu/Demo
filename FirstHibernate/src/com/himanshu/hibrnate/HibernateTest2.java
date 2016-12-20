package com.himanshu.hibrnate;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.himanshu.dto.Address;
import com.himanshu.dto.UserDetails2;

public class HibernateTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserDetails2 ud =new UserDetails2();
		ud.setUserName("First");
		Address ad = new Address();
		ad.setCity("city");
		ad.setStreet("city");
		ad.setState("city");
		ad.setPin("city");
		ud.setAddress(ad);
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session se = sf.openSession();
		se.beginTransaction();
		se.save(ud);
		se.getTransaction().commit();
		se.close();
		
		
	}
}
