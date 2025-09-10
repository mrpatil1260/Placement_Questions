package com.techmasters.placement;

import java.util.Scanner;

public class Reverserthestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string to reverse");
		String s=sc.nextLine();
		String reversed="";
		System.out.println("Entered string is: " + s);
		for(int i=s.length()-1; i>=0; i--) {
			reversed=reversed+s.charAt(i); // N I
			
		}
		System.out.println("Reversed string is: " + reversed);
		sc.close();

	}

}
