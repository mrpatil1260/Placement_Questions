package com.techmasters.placement;

import java.util.Scanner;

public class Reversethenumber {

	public static void main(String[] args) {
		 //dynamic input
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ot reverse: ");
		int num =sc.nextInt(); // 145
		int reversed=0;
		//lets loop so that we can reach any maximum number
		System.out.println("Given number : "+ num);
		while(num!=0) {
			int digit=num%10; // last 145%10 ==> 5:digit ; 14%10==> 4; 1%10=> 1
			reversed=reversed*10+digit; // reversed value will change
			// as the loop executs untill it goes false
			num=num/10;// num will updates as well as removes the last 
			// digit. 145/10=> 14/10==> 1/10==> ; num=1, digit :4, reversed:54;
		}
		
		System.out.println("Reversed number: "+ reversed);
		sc.close();
	}
}
