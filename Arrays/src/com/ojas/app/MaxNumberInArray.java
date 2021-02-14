package com.ojas.app;

import java.util.Scanner;

public class MaxNumberInArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter array Elements..");
		for(int ir=0;ir<size;ir++)
		{
			arr[ir] = sc.nextInt();
		}
		
		MaxNumberInArray mnia = new MaxNumberInArray();
		if(size == 10)
		{
			int maxNumber = mnia.maxValue(arr);
			System.err.println("Maximum Number in an Array: "+maxNumber);
		}
		else
		{
			System.out.println("-1");
		}
		sc.close();
	}
	
	public int maxValue(int[] inputArray)
	{
		int max = inputArray[0];
		for(int i=1;i<inputArray.length;i++)
		{
			if(max < inputArray[i])
			{
				max = inputArray[i];
			}
		}
		return max ;
	}
}
