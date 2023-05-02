package controller;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Address;
import model.Employee;

public class AppForEmployee {

	public static void main(String[] args) {

Employee emp=new Employee();
Scanner scanner=new Scanner(System.in);
System.out.println("Enter the employee id");
int id=Integer.parseInt(scanner.nextLine());
System.out.println("Enter the employee name");
String name=scanner.nextLine();

System.out.println("Enter the employee mail");
String mail=scanner.nextLine();

System.out.println("Enter the employee salary");
double sal=Double.parseDouble(scanner.nextLine());
System.out.println("Enter the employee street address");
String street=scanner.nextLine();
System.out.println("Enter the employee state address");
String state=scanner.nextLine();
System.out.println("Enter the employee city address");
String city=scanner.nextLine();
System.out.println("Enter the employee pin code");
String pinCode=scanner.nextLine();
Address address=new Address();
address.setCity(city);
address.setPinCode(pinCode);
address.setState(state);
address.setStreet(street);
emp.setEmpId(id);
emp.setEmpName(name);
emp.setEmail(mail);
emp.setEmpSalary(sal);
emp.setAddress(address);

//where is my persitance area
//name of the persistance unit


EntityManagerFactory factory=Persistence.createEntityManagerFactory("PU");
EntityManager manager=factory.createEntityManager();
manager.getTransaction().begin();
manager.persist(emp);
manager.getTransaction().commit();
scanner.close();
	}

}