package com.capgemini;
import static org.junit.Assert.assertEquals;

import java.util.Scanner;
import org.junit.Test;
import com.capgemini.pack1.Student;
public class StudentTest 
{
	@Test
	public void testFindMarks()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array length");
		int n=sc.nextInt();
		System.out.println("Enter the array Elements");
		int[] marks=new int[n];
		for(int i=0;i<marks.length;i++)
		{
			marks[i]=sc.nextInt();
		}
		Student s=new Student();
	    int actualRes=s.findMaxMarks(marks);
	    System.out.println("Enter your expected output");	   
		int expectedResult=sc.nextInt();
		assertEquals(expectedResult, actualRes);
		sc.close(); 
	}
}
