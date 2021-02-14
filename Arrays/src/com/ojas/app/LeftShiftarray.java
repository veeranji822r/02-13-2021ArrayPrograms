package com.ojas.app;

import java.util.Scanner;
import java.util.Arrays;
public class LeftShiftarray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		for(int ir=0;ir<size;ir++)
		{
			arr[ir] = sc.nextInt();
		}
		
		LeftShiftarray  lsa = new LeftShiftarray();
		int[] rarr = lsa.withoutTen(arr);
		System.out.print("[ ");
		for(int i=rarr.length-1;i>=0;i--)
		{
			System.out.print(rarr[i]+" ");
		}
		System.out.print("]");
	}
	public int[] withoutTen(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] == 10)
			{
				arr[i] = 0;
			}
		}
		Arrays.sort(arr);
		return arr;
	}

}
