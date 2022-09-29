package com.training.jpa;
import javax.persistence.*;

public class EmployeeDetails {
	public static void main(String[] args) {
		EntityManagerFactory emf = null;
		EntityManager em = null;
		try {
			emf = Persistence.createEntityManagerFactory("Employee_Details");
			em = emf.createEntityManager();
			
			Employee e = em.find(Employee.class, 101);
			if(e != null ) {
				System.out.println("ID is " + e.getId() + ", name is " + e.getName() + ", Salary is " + e.getSalary() + " and department is " + e.getDept_id());
			} else {
				System.out.println("Employee doesn't exist");
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			em.close();
			emf.close();
		}
	}

}
