package com.denominations.driver;

import java.util.Scanner;

public class DenominationsDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the size of currency denominations");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		
		int notes[] = new int[size];
		System.out.println("Enter the currency denominations value");
		for (int i=0; i<size; i++) {
			notes[i] = sc.nextInt();
		}
		
		System.out.println("Enter the amount you want to pay");
		int amount= sc.nextInt();
		
		MergeSortImplement mergesort = new MergeSortImplement();
		NotesCount notescount = new NotesCount();

		mergesort.sort(notes, 0, notes.length-1);
		notescount.notesCountImplement(notes,amount);
	}

}
