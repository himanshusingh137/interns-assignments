package com.IH.challenge4;

import java.util.Scanner;

public class PalindromeOrNot {
	
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.print("Enter the String :");
		String st=scan.nextLine();
		if(isPalindrome(st)) {
			System.out.println(st+" is Palindrome.");
		}
		else {
			System.out.println(st+" is not a Palindrome.");
		}
			scan.close();
	}
	
	private static boolean isPalindrome(String s) {	
		int len=s.length();
		char[] c=new char[len];
		for(int i=0;i<len;i++) {
			c[i]=s.charAt(i);
		}
		String temp="";
		for(int j=len-1;j>=0;j--) {
			temp=temp+c[j];
		}
		if(temp.equals(s)) {
			return true;
		}
		else {
			return false;
		}
	}


}
