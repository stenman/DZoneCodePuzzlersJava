package com.example.dzonecodepuzzlers.nqueen;

import java.util.ArrayList;
import java.util.List;

//Excercise Your Coding Muscles
//04.12.2012 
//We thought we'd try something different here at JavaLobby. For the next few weeks, every Thursday, we'll publish a code puzzler for you to solve. I'm sure they'll be easy to solve for such a gifted community of readers as we have here, but let's give it a go. Use whatever frameworks/languages you think are appropriate to solve the question.
//
//The N Queens Puzzle
//
//One of the classic programming challenges. What you need to do is place 8 queens on an 8x8 chess board in a way that no two queens attack each other. For those who don't play chess, this means that no two queens can be on the same row, column or diagonal.  Sounds simple? Go! 
//
//What's the most efficient way to solve this?

public class NQueensPuzzle {

	List<Queen> queens = new ArrayList<Queen>();

	public NQueensPuzzle() {
		setupBoard();
	}

	private void setupBoard() {

		Queen q1 = new Queen(new int[] { 0, 0 }, "q1");
		Queen q2 = new Queen(new int[] { 0, 0 }, "q2");
		Queen q3 = new Queen(new int[] { 0, 0 }, "q3");
		Queen q4 = new Queen(new int[] { 0, 0 }, "q4");
		Queen q5 = new Queen(new int[] { 0, 0 }, "q5");
		Queen q6 = new Queen(new int[] { 0, 0 }, "q6");
		Queen q7 = new Queen(new int[] { 0, 0 }, "q7");
		Queen q8 = new Queen(new int[] { 0, 0 }, "q8");

		queens.add(q1);
		queens.add(q2);
		queens.add(q3);
		queens.add(q4);
		queens.add(q5);
		queens.add(q6);
		queens.add(q7);
		queens.add(q8);

		assignPosition(q1);
		assignPosition(q2);
		assignPosition(q3);
		assignPosition(q4);
		assignPosition(q5);
		assignPosition(q6);
		assignPosition(q7);
		assignPosition(q8);

		printQueen(q1);
		printQueen(q2);
		printQueen(q3);
		printQueen(q4);
		printQueen(q5);
		printQueen(q6);
		printQueen(q7);
		printQueen(q8);

	}

	private void printQueen(Queen q) {
		int[][] qDd = q.getDd();
		int[][] qDu = q.getDu();
		int[] qStartPos = q.getStartPos();
		System.out.println("SP: [" + qStartPos[0] + "," + qStartPos[1] + "]");
		// for (int[] is : qDd) {
		// System.out.println("DD: [" + is[0] + "," + is[1] + "]");
		// }
		// for (int[] is : qDu) {
		// System.out.println("DU: [" + is[0] + "," + is[1] + "]");
		// }
	}

	private void assignPosition(Queen queen) {

		boolean blocked = false;

		for (int x = 0; x < 8; x++) {
			for (int y = 0; y < 8; y++) {
				blocked = false;
				for (Queen q : queens) {
					if (!q.equals(queen)) {
						if (q.isBlockingPosition(new int[] { x, y })) {
							blocked = true;
						}
					}
				}
				if (!blocked) {
					queen.setStartPos(new int[] { x, y });
					break;
				}
			}
		}
	}

}
