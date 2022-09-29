package com.training.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CreateEmployee {
	public static void main(String[] args) {
		
		EntityManagerFactory emf = null;
		EntityManager em = null;
		try {
			emf = Persistence.createEntityManagerFactory("Employee_Details");
			em = emf.createEntityManager();
			em.getTransaction().begin();
			
			Employee e = new Employee(); 
			e.setId(101);
			e.setName("Test");
			e.setSalary(1000.5f);
			e.setDept_id("ADM");
			
			em.persist(e);
			em.getTransaction().commit();
			System.out.println("Employee is added!");
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			em.close();
			emf.close();
		}
	}

}