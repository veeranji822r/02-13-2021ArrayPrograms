package com.ojas.app;

import java.util.Scanner;

public class StartAndEndNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[2];
		System.out.println("Enter the start and end number: ");
		for(int ir=0;ir<arr.length;ir++)
		{
			arr[ir] = sc.nextInt();
		}
		StartAndEndNumber saen = new StartAndEndNumber();
		int[] reArray = saen.fizzArray(arr);
		System.out.print("[ ");
		for(int ir=0;ir<reArray.length;ir++)
		{
			System.out.print(reArray[ir]+" ");
		}
		System.out.println("]");
		sc.close();
	}
	
	public int[] fizzArray(int[] inputArray)
	{
		int start = inputArray[0];
		int end = inputArray[1];
		int[] arr = new int[end-start];
		
		for(int i=0;i<arr.length;i++)
		{
			if(start < end)
			{
				arr[i] = start;
				start++;
			}	
		}
		return arr;
	}

}
