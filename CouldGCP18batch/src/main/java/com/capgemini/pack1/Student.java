package com.capgemini.pack1;

import java.util.Arrays;

public class Student 
{
	public int findMaxMarks(int[] marks)
	{
		Arrays.sort(marks);
		return marks[marks.length-1];
	}
}