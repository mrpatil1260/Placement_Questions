package com.techmasters.placement;

public class Reversedpalindrome {

	public static void main(String[] args) {
		int n=1235; // 5321
		int reversed=0;
		int copy_Of_n=n;
		System.out.println("Value of n before reverse: "+n);//1235
		while(n!=0) {
			int digit=n%10;
			reversed=reversed*10+digit;
			n/=10;
		}
		System.out.println("Value of n after reverse " + n); // 0
		if(copy_Of_n==reversed) {
			System.out.println(copy_Of_n + "is a palindrome");
		}else {
			System.out.println(copy_Of_n + "is not a palindome");
		}
		System.out.println("Value of reversed number "+ reversed);
		
	}
}