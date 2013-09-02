package com.example.dzonecodepuzzlers.puzzles;

public class KPalindrome {
	
	public void testKPalindrome(){
		System.out.println("lobor (expect true): " + kPalindrome("lobor", 1));
		System.out.println("lobor (expect false): " + kPalindrome("lobor", 0));
		System.out.println("lobor (expect false): " + kPalindrome("lobor", 2));
		System.out.println("lobbor (expect true): " + kPalindrome("lobbor", 1));
		System.out.println("lobbor (expect false): " + kPalindrome("lobbor", 0));
		System.out.println("lobbor (expect false): " + kPalindrome("lobbor", 2));

	}
	
	public boolean kPalindrome(String str, int k){
		for (int i = 0; i < str.length()/2; i++) {
			if(str.toLowerCase().substring(i, i+1).compareTo(str.toLowerCase().substring(str.length()-(i+1), str.length()-i)) != 0){
				k--;
			}
		}
		if(k==0){
			return true;
		}
		return false;
	}
}
