package com.techmasters.placement;

import java.util.Scanner;

public class Palindrome {
	
	public static boolean isPalindrome(String str) {
		str=str.toLowerCase(); // optional
		//assume String str="racecar"; 
		int left=0; // 0 the position
		int right=str.length()-1; // 7-1==> 6 positions i.e..; [0-6]
		//compare character from both the ends
		while(left<right) {
			if(str.charAt(left)!=str.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
		
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		String choice;
		 do {
			System.out.println("Enter string to check for palindrome: ");
			String str=sc.nextLine();
			
			if(isPalindrome(str)) {
				System.out.println("The string is palindome");
			}else {
				System.out.println("The string is not palindrome");
			}
			System.out.println("Do you want to check another string? (yes/no)");
			choice=sc.nextLine().toLowerCase();
		}while(choice.equals("yes"));
		System.out.println("Program exited..!");
		sc.close();
		//"racecar"
	}
}