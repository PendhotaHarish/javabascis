package controller;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Department;
import model.Employees;
public class AppForEmployees 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("PU");
		EntityManager em=factory.createEntityManager();
		Department d=new Department();
		d.setId(25);
		d.setName("cse");
		Department d1=new Department();
		d1.setId(26);
		d1.setName("mech");
		Employees ep=new Employees();
		ep.setEmId(3);
		ep.setName("harish");
		ep.setEmpSalary(4578.0);
		Employees ep1=new Employees();
		ep1.setEmId(4);
		ep1.setName("pendhota");
		ep1.setEmpSalary(5678.0);
		d.addEmployess(ep);
		d.addEmployess(ep1);
		d1.addEmployess(ep);
		d1.addEmployess(ep1);
		em.getTransaction().begin();
		em.persist(d);
		em.persist(d1);
		em.getTransaction().commit();
	}
}
