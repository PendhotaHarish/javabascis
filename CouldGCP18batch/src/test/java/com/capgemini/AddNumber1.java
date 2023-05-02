package com.capgemini;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.Scanner;

import org.junit.Test;

import com.capgemini.pack1.AddNumber;

public class AddNumber1 
{
	@Test
	public void testAddNumber()
	{
		Scanner scanner=new Scanner(System.in);
		AddNumber obj=new AddNumber();
		System.out.println("Enter number1");
		int a=scanner.nextInt();
		System.out.println("Enter number2");
		int b=scanner.nextInt();
		
		
		   int actualResult =obj.addNumber(a, b);
		   
			System.out.println("Enter your expected output");	   
		   int expectedResult=scanner.nextInt();
		   assertEquals(expectedResult, actualResult);
		  scanner.close(); 
		
	}
	@Test
	public void testAddNumber1()
	{
		
		AddNumber obj=new AddNumber();
		   int actualResult =obj.addNumber(10, 20);
		   int expectedResult=10;
		   assertNotEquals(expectedResult, actualResult);
		   
		
	}
}
