package com.ojas.app;

import java.util.Scanner;

public class EvenList {

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
		EvenList el = new EvenList();
		if(size >=10)
		{
			int[] result = el.getEvenArray(arr);
			System.out.print("[ ");
			for(int ir=0;ir<result.length;ir++)
			{
				System.out.print(result[ir]+" ");
			}
			System.out.println("]");
		}
		else
		{
			System.out.println("null");
		}
 		sc.close();

	}
	public int[] getEvenArray(int[] inputArray)
	{	
		int count = 0;
		for(int ir=0;ir<inputArray.length;ir++)
		{
			if(inputArray[ir] % 2 == 0)
			{
				count++;
			}	
		}
		
		int[] narr = new int[count];
		int j = 0;
		for(int ir=0;ir<inputArray.length;ir++)
		{
			if(inputArray[ir] % 2 == 0)
			{
				narr[j] = inputArray[ir];
				
				j++;
			}
		}
		//System.out.println(count);
		return narr;
	}

}
