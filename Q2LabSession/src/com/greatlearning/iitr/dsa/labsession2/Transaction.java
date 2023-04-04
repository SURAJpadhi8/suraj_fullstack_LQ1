package com.greatlearning.iitr.dsa.labsession2;

import java.util.Scanner;

class Transaction 
 {
	public static void main(String args[]) throws Exception 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Size of Transaction Array");
		int size = s.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the Values of Array");
		for (int i = 0; i < size; i++)
			arr[i] = s.nextInt();
		System.out.println("Enter the Total no of Targets that Needs to be Achieved");
		int targetNo = s.nextInt();
		while (targetNo-- != 0)
		{
			int flag = 0;
			long target;
			System.out.println("Enter the Value of Target");
			target = s.nextInt();
			long sum = 0;
			for (int i = 0; i < size; i++)
			{
				sum += arr[i];
				if (sum >= target) 
				{
					System.out.println("Target Achieved after " + (i + 1) + " Transactions ");
					flag = 1;
					break;
				}
			}
			if (flag == 0) 
			{
				System.out.println("Given Target is not Achieved ");
				s.close();

			}
		}
	}
}