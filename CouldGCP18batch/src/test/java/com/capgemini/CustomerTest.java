package com.capgemini;
import com.capgemini.pack1.Customer;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import java.util.Scanner;
import org.junit.Test;
public class CustomerTest
{
	Scanner sc=null;
	@Test
	public void testAadharCardnum()
	{
		sc=new Scanner(System.in);
		System.out.println("Enter the Aadhar number");
		String ad=sc.nextLine();
		boolean b=Customer.isValidAadharNo(ad);
		assertTrue(b);
	}
	@Test
	public void testFirstandLastName()
	{
		sc=new Scanner(System.in);
		System.out.println("Enter the first name");
		String fn=sc.nextLine();
		System.out.println("Enter the last name");
		String ln=sc.nextLine();
		assertNotEquals(fn,ln);
	}
	@Test
	public void testEmail()
	{
		sc=new Scanner(System.in);
		System.out.println("Enter the emailId");
		String email=sc.nextLine();
		assertNotNull(email);
	}
}
