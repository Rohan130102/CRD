package com.dailywork.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.dailywork.dao.UserDAO;
import com.dailywork.pojo.Task;
import com.dailywork.pojo.User;
import com.dailywork.utils.HibernateUtils;

public class UserDAOImpl implements UserDAO {

	private SessionFactory sessionFactory;
	private Session session;

	@Override
	public List<User> get() {
		String status = "";
		Transaction tx = null;
		List<User> li = new ArrayList<>();
		try {
			sessionFactory = HibernateUtils.getSessionFactory();
			session = sessionFactory.openSession();
			tx = session.beginTransaction();
			li = session.createQuery("from User", User.class).getResultList();
			tx.commit();
			status = "success";
		} catch (Exception ex) {
			System.out.println("failure");
			tx.rollback();
			status = "failure";
			ex.printStackTrace();
		} finally {
			sessionFactory.close();
		}
		return li;
	}

	@Override
	public User getUserById(int id) {
		String status = "";
		User user = new User();
		try {
			sessionFactory = HibernateUtils.getSessionFactory();
			session = sessionFactory.openSession();
			user = (User) session.get(User.class, id);
		} catch (Exception ex) {
			System.out.println("failure");
			status = "failure";
			ex.printStackTrace();
		} finally {
//			session.close();
//			sessionFactory.close();
		}
		return user;
	}

	@Override
	public String save(User user) {
		String status = "";
		Transaction tx = null;
		try {
			sessionFactory = HibernateUtils.getSessionFactory();
			session = sessionFactory.openSession();
			tx = session.beginTransaction();
			session.save(user);
			tx.commit();
			status = "success";
		} catch (Exception ex) {
			System.out.println("failure");
			tx.rollback();
			status = "failure";
			ex.printStackTrace();
		} finally {
			if (session.isOpen() || null != session)
				session.close();
		}
		return status;
	}

	@Override
	public String update(User user) {
		String status = "";
		Transaction tx = null;
		try {
			sessionFactory = HibernateUtils.getSessionFactory();
			session = sessionFactory.openSession();
			tx = session.beginTransaction();
			session.saveOrUpdate(user);
			tx.commit();
			status = "success";
		} catch (Exception ex) {
			System.out.println("failure");
			tx.rollback();
			status = "failure";
			ex.printStackTrace();
		} finally {
//			session.close();
//			sessionFactory.close();
		}
		return status;
	}

	@Override
	public User login(String email, String password) {
		User user = new User();
		try {
			sessionFactory = HibernateUtils.getSessionFactory();
			session = sessionFactory.openSession();
			CriteriaBuilder builder = session.getCriteriaBuilder();
			CriteriaQuery<User> query = builder.createQuery(User.class);
			Root<User> root = query.from(User.class);
			query.select(root).where(builder.equal(root.get("email"), email));
			Query<User> q = session.createQuery(query);
			user = q.getSingleResult();
		} catch (Exception ex) {
			System.out.println("failure");
			ex.printStackTrace();
		} finally {
		}
		return (user != null && (user.getPassword().equals(password))) ? user : null;
	}

	@Override
	public String save(Task t) {
		String status = "";
		Transaction tx = null;
		try {
			sessionFactory = HibernateUtils.getSessionFactory();
			session = sessionFactory.openSession();
			tx = session.beginTransaction();
			session.save(t);
			tx.commit();
			status = "success";
		} catch (Exception ex) {
			System.out.println("failure");
			tx.rollback();
			status = "failure";
			ex.printStackTrace();
		} finally {
			sessionFactory.close();
		}
		return status;
	}

}
