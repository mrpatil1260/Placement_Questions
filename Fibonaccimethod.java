package com.techmasters.placement;

import java.util.Scanner;

public class Fibonaccimethod {
	
	public static void printFobonacci(int seq) {
		int first=0, second=1;
		System.out.println("Fibonacci series upto"+ seq + "terms");
		for(int i=1; i<=seq; i++) {
			System.out.print(first + " ");
			int next=first+second;
			first=second;
			second=next;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no. of sequence: ");
		int seq=sc.nextInt();
		printFobonacci(seq);
		sc.close();
	}
}
