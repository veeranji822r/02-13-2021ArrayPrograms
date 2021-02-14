package com.ojas.app;

import java.util.Scanner;

public class OccuranceCounter {

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
		System.out.println("Enter the number To find it:");
		int givenNumber = sc.nextInt();
		OccuranceCounter oc = new OccuranceCounter();
		int result = oc.getCount(arr,givenNumber);
		System.out.println(+givenNumber+" is repeted "+result);
		sc.close();
	}
	public int getCount(int[] inputArray,int givenNumber)
	{
		int count = 0;
		for(int i=0;i<inputArray.length;i++)
		{
			if(inputArray[i] == givenNumber)
			{
				//System.out.println(i);
				count++;
			}
		}
		if(count <= 0)
		{
			return -1;
		}
		return count;
	}

}
