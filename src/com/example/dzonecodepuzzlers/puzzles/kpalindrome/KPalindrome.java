package com.example.dzonecodepuzzlers.puzzles.kpalindrome;

//Thursday Code Puzzler:K Palindromes
//08.29.2013   
//It's Thursday, so it's time for another code puzzler. The idea is simple: solve the coding problem as efficiently as you can, in any language or framework that you find suitable.
//
//K Palindromes
//
//You probably already know what a palindrome is: a string to results in the same word, whether read left to right, or right to left. A K Palindrome is when a string can be tranformed into a palindrome by changing K characters at most. Regular palindromes have K=0. 
//
//Your challenge today is to write a method which takes a string and a value for k and returns true if it the string qualifies as a K palindrome. 

public class KPalindrome {

	public void testKPalindrome() {
		System.out.println("lobor (expect true): " + kPalindrome("lobor", 1));
		System.out.println("lobor (expect false): " + kPalindrome("lobor", 0));
		System.out.println("lobor (expect false): " + kPalindrome("lobor", 2));
		System.out.println("lobbor (expect true): " + kPalindrome("lobbor", 1));
		System.out.println("lobbor (expect false): " + kPalindrome("lobbor", 0));
		System.out.println("lobbor (expect false): " + kPalindrome("lobbor", 2));

	}

	public boolean kPalindrome(String str, int k) {
		for (int i = 0; i < str.length() / 2; i++) {
			if (str.toLowerCase().substring(i, i + 1)
					.compareTo(str.toLowerCase().substring(str.length() - (i + 1), str.length() - i)) != 0) {
				k--;
			}
		}
		if (k == 0) {
			return true;
		}
		return false;
	}
}
