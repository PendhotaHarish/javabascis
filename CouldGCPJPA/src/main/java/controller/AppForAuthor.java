package controller;

import java.util.Scanner;

import javax.persistence.EntityManager;

import dao.AuthorServiceImpl;
import model.Author;

public class AppForAuthor {

	public static void main(String[] args) 
	{
		EntityManager em=utility.AuthorUtility.getEntityManagerFactory().createEntityManager();
		int x=10;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the First name");
		String fn=sc.nextLine();
		System.out.println("Enter the middle name");
		String mn=sc.nextLine();
		System.out.println("Enter the last name");
		String ln=sc.nextLine();
		System.out.println("Enter author phone number");
		Long pn=Long.parseLong(sc.nextLine());
		Author au=new Author(0,fn,mn,ln,pn);
		AuthorServiceImpl  asi=new AuthorServiceImpl();
		asi.insert(au);
		System.out.println("Enter the new phone number");
		Long npn=Long.parseLong(sc.nextLine());
		System.out.println("Enter the author id");
		int nid=Integer.parseInt(sc.nextLine());
		System.out.println("Enter the First name");
		String nfn=sc.nextLine();
		asi.update(nid,npn,nfn);
		System.out.println("Enter the delete phone number");
		System.out.println("Enter the author id");
		int did=Integer.parseInt(sc.nextLine());
		asi.remove(did);
		sc.close();
	}
}
