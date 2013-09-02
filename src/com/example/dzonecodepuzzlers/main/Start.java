package com.example.dzonecodepuzzlers.main;

import java.util.Arrays;

import com.example.dzonecodepuzzlers.puzzles.KPalindrome;

public class Start {

	public static void main(String[] args) {

		// KPalindrome
		// KPalindrome kPalindrome = new KPalindrome();
		// kPalindrome.testKPalindrome();

		// NQueensPuzzle
		// NQueensPuzzle nQueensPuzzle = new NQueensPuzzle();
		// nQueensPuzzle.testNQueensPuzzle();
		
		
		nQueen();
		
	}
	
	public static void nQueen(){
		//Skapa ett bräde (array) på 8x8 rutor. 1-8, a-h
		String[][] board = new String[8][8];
		int k = 0;
		
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				k++;
				System.out.println("k="+k+" "+board[j]);
			}
		}
		
		
		//"placera" ut en drottning på en ruta
		
		//räkna ut vilka rutor som nu är lediga/upptagna
		
		//repetera
		
	}
}
