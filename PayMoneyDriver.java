package com.paymoney.driver;

import java.util.Scanner;

public class PayMoneyDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("Enter the size of transaction array");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		
		int inparr[] = new int[size];
		System.out.println("Enter the values of array");
		for (int i=0; i<size; i++) {
			inparr[i] = sc.nextInt();
		}
		
		System.out.println("Enter the total number of targets that needs to be achieved");
		int targetno= sc.nextInt();
		
		if(targetno>=1) {
			
			for(int i=0; i<targetno; i++) {
				
				System.out.println("Enter the value of target");
				int target= sc.nextInt();
				TargetAchiever(inparr, target);
				
			}
			
		}
		
		else {
			
			System.out.println("Invalid target number");
			
		}
		

	}

	private static void TargetAchiever(int[] inparr, int target) {
		// TODO Auto-generated method stub
		
		long sum=0;
		int flag =0;
		
		for(int i=0; i<inparr.length; i++) {
	
			sum+=inparr[i];
			
				if(sum>=target) {
				
					System.out.println("Target achieved after "+(i+1)+" transactions");
					flag =1;
					break;
				}
		}
			 
		if (flag == 0){
					
			System.out.println("Given target is not achieved");
					
		}
				
	}
				
}
		
	
		
