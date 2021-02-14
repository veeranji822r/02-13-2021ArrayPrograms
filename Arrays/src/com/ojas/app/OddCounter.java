package com.ojas.app;

import java.util.Scanner;

public class OddCounter {
	public static void main(String[] args) 
	{	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array:");
 		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the elements..");		
		for(int ir=0;ir<size;ir++)
		{
			arr[ir] = sc.nextInt();
		}
		OddCounter oc = new OddCounter();
		if(size == 10)
		{
			int result = oc.getOddCount(arr);
			System.out.println("The odd numbers are: "+result);
		}
		else
		{
			System.out.println("size is lessthen "+size+" so we can't move forword");
		}
 		sc.close();

	}
	public int getOddCount(int[] inputArray)
	{	
		int count = 0;
		for(int ir=0;ir<inputArray.length;ir++)
		{
			if(inputArray[ir] % 2 == 1)
			{
				count++;
			}	
		}
		return count;
	}
}
