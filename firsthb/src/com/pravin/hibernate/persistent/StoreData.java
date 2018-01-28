package com.pravin.hibernate.persistent;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StoreData {
    public static void main(String[] args) {
	SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
		.buildSessionFactory();
	Session session = factory.openSession();
	Transaction transaction = session.beginTransaction();
	Employee emp = new Employee();
	emp.setId(115);
	emp.setFirstName("pravin");
	emp.setLastName("patil");
	session.persist(emp);
	transaction.commit();
	System.out.println("successfully saved");
    }
}
