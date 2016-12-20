package com.himanshu.hibrnate;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.himanshu.dto.UserDetails1;

public class HibernateTest1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserDetails1 ud =new UserDetails1();
		ud.setUserName("First");
		ud.setDate(new Date());
		ud.setDesc("asass");
		
		UserDetails1 ud1 =new UserDetails1();
		ud1.setUserName("Second");
		ud1.setDate(new Date());
		ud1.setDesc("asaassass");
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session se = sf.openSession();
		se.beginTransaction();
		se.save(ud);
		se.save(ud1);
		se.getTransaction().commit();
		se.close();
		
		
	}
}
