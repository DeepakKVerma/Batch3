package com.training.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class UpdateEmployee {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = null;
		EntityManager em = null;
		try {
			emf = Persistence.createEntityManagerFactory("Employee_Details");
			em = emf.createEntityManager();
			em.getTransaction().begin();
			
			Employee e = em.find(Employee.class, 101);
			e.setSalary(1500.5f);
			em.getTransaction().commit();
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			em.close();
			emf.close();
		}
	}

}