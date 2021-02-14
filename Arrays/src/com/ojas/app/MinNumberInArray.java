package com.ojas.app;

import java.util.Scanner;

public class MinNumberInArray {

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
		
		MinNumberInArray mnia = new MinNumberInArray();
		if(size == 10)
		{
			int minNumber = mnia.minValue(arr);
			System.err.println("Maximum Number in an Array: "+minNumber);
		}
		else
		{
			System.out.println("-1");
		}
		sc.close();
	}
	
	public int minValue(int[] inputArray)
	{
		int min = inputArray[0];
		for(int i=1;i<inputArray.length;i++)
		{
			if(min > inputArray[i])
			{
				min = inputArray[i];
			}
		}
		return min ;
	}
}

