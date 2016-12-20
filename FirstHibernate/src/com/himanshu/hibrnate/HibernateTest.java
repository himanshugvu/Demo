package com.himanshu.hibrnate;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.himanshu.dto.UserDetails;

public class HibernateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserDetails ud =new UserDetails();
		ud.setUserId(2);
		ud.setUserName("First");
		ud.setDate(new Date());
		ud.setDesc("asass");
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session se = sf.openSession();
		se.beginTransaction();
		se.save(ud);
		se.getTransaction().commit();
		se.close();
		
		ud=null;
		 se = sf.openSession();
		se.beginTransaction();
				
		
		ud = se.get(UserDetails.class, 2);
		System.out.println(ud.toString());
	}

}
