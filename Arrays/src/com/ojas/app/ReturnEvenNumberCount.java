package com.ojas.app;

import java.util.Scanner;

public class ReturnEvenNumberCount {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i] = sc.nextInt();
		}
		ReturnEvenNumberCount renc = new ReturnEvenNumberCount();
		int res = renc.countEven(arr);
		System.out.println("EvenNumbers are "+res);
		sc.close();
	}

	public int countEven(int[] arr)
	{
		int count = 0;
		for(int index=0;index<arr.length;index++)
		{
			if(arr[index] % 2 == 0)
			{
				count++;
			}
		}
		return count;
		
	}
}
