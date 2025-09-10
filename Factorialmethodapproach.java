package com.techmasters.placement;

import java.util.Scanner;

public class Factorialmethodapproach {
	
	public static long calculateFactorial(int n) {
		long f=1;
		for(int i=1; i<=n;i++) {
			f*=i;
		}
		return f;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to find factorial: ");
		int n=sc.nextInt();
		//invoke the function;
		long result=calculateFactorial(n);
		System.out.println("Factorial of "+ n + " is "+ result);
		sc.close();
		

	}

}
