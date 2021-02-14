package com.ojas.app;

import java.util.Scanner;

public class MultiplesOfNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = sc.nextInt();
		if(number <= 0)
		{
			System.out.println("null");
		}
		else
		{
			MultiplesOfNumber mon = new MultiplesOfNumber();
			int[] res = mon.getMultiplesArray(number);
			
			for(int i=0;i<res.length;i++)
			{
				System.out.print(res[i]+" ");
			}
		}
		sc.close();
	}
	
	public int[] getMultiplesArray(int number)
	{
		int[] arr = new int[10];
		int j = 0;
		for(int i=1;i<=100;i++)
		{
			if(number % i == 0)
			{
				arr[j] = i;
				j++;
			}
		}	
		return arr;
	}

}
