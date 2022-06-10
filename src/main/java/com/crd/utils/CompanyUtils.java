package com.crd.utils;

import java.util.ArrayList; 
import java.util.List;

import org.apache.commons.lang3.RandomStringUtils;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class CompanyUtils {

	private static SessionFactory sessionFactory;
	private static Session session;

	public static String companyGSTNGenerator() {
		List<String> list = getGSTNList();
		String gstn = null;
		while (true) {
			String test = randomiser();
			if (!(list.contains(test))) {
				gstn = test;
				break;
			}
		}
		return gstn;
	}

	private static String randomiser() {
		String gstn = (RandomStringUtils.randomNumeric(2) + RandomStringUtils.randomAlphabetic(5)
				+ RandomStringUtils.randomNumeric(4) + RandomStringUtils.randomAlphabetic(1)
				+ RandomStringUtils.randomNumeric(1) + RandomStringUtils.randomAlphabetic(1)
				+ RandomStringUtils.randomNumeric(1)).toUpperCase();
		return gstn;
	}

	public static List<String> getGSTNList() {
		Transaction tx = null;
		List<String> li = new ArrayList<>();
		try {
			sessionFactory = HibernateUtils.getSessionFactory();
			session = sessionFactory.openSession();
			tx = session.beginTransaction();
			li = session.createQuery("companyGSTN from Company", String.class).getResultList();
			tx.commit();
		} catch (Exception ex) {
			System.out.println("failure");
			tx.rollback();
			ex.printStackTrace();
		} finally {
			sessionFactory.close();
		}
		return li;
	}

	public static void main(String[] args) {
		System.out.println(companyGSTNGenerator());
	}
}
