package com.crd.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.crd.pojo.Company;
import com.crd.utils.HibernateUtils;

public class UserService {

	private SessionFactory sessionFactory;
	private Session session;
	
	public void save(Company company) {
		Transaction tx = null;
		try {
			sessionFactory = HibernateUtils.getSessionFactory();
			session = sessionFactory.openSession();
			tx = session.beginTransaction();
			session.save(company);
			tx.commit();
		} catch (Exception ex) {
			System.out.println("failure");
			tx.rollback();
			ex.printStackTrace();
		} finally {
			if (session.isOpen() || null != session)
				session.close();
		}
	}
}
