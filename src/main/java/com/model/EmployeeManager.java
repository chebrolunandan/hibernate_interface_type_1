package com.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class EmployeeManager {
	 public String insertData(Employee E,RegularEmployee R, ContractEmployee C)
	  {
	    SessionFactory factory = new Configuration().configure().buildSessionFactory();
	    Session session = factory.openSession();
	    
	    session.getTransaction().begin();
	    session.persist(E);
	    session.persist(R);
	    session.persist(C);
	    session.getTransaction().commit();
	    
	    session.close();
	    factory.close();
	    return "Data inserted successfully";
	  }
}
