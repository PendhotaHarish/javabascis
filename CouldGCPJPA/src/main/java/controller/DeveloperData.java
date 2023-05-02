package controller;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Developer;
import model.Project;
public class DeveloperData 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Developer dv=new Developer();
		System.out.println("Enter the developer id");
		int id=Integer.parseInt(sc.nextLine());
		System.out.println("Enter the developer name");
		String dn=sc.nextLine();
		System.out.println("Enter the developer phone");
		Long dp=Long.parseLong(sc.nextLine());
		System.out.println("Enter the developer mail");
		String dm=sc.nextLine();
		System.out.println("Enter the project name");
		String pn=sc.nextLine();
		System.out.println("Enter the project type");
		String pt=sc.nextLine();
		System.out.println("Enter the project location");
		String pl=sc.nextLine();
		Project project=new Project();
		project.setProjectName(pn);
		project.setProjectType(pt);
		project.setProjectLocation(pl);
		dv.setDevId(id);
		dv.setDevName(dn);
		dv.setDevPhone(dp);
		dv.setDevMail(dm);
		dv.setProject(project);
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("PU");
		EntityManager manager=factory.createEntityManager();
		manager.getTransaction().begin();
		manager.persist(dv);
		manager.getTransaction().commit();
		sc.close();
	}
}
