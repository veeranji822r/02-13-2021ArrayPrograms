package com.ojas.app;

import java.util.Scanner;

public class ArraySum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array:");
 		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the elements..");		
		for(int ir=0;ir<size;ir++)
		{
			arr[ir] = sc.nextInt();
		}
		ArraySum as = new ArraySum();
		int res = as.getSumOfArray(arr);
		sc.close();
		System.out.println("The Sum of Array is: "+res);
	}
	public int getSumOfArray(int[] inputArray)
	{
		int sum = 0;
		if(inputArray.length > 0)
		{
			for(int ir=0;ir<inputArray.length;ir++)
			{
				sum += inputArray[ir];
			}
		}
		else
		{
			sum = -1;
		}
		return sum;
	}

}
