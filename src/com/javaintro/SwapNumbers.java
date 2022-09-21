package com.javaintro;

import java.util.Scanner;

public class SwapNumbers {

	public static void main(String[] args) {
		
		// Write a program to swap 2 numbers without a
		//temporary variable?
		
		System.out.println("APPROACH1");
		
		Scanner scan =new Scanner(System.in);
		
		int a =scan.nextInt();
		int b =scan.nextInt();
		
		System.out.println("Numbers before swaping"+a+" "+b);
		
			a=b+a;
			b=a-b;
			a=a-b;
						
		System.out.println("Numbers after swaping"+a+" "+b);
		
		System.out.println("APPROACH2");
		
		int[]x=new int[1];
		int[]y=new int[1];
		
		 for(int o:x) {
			 for(int u:y) {
				 x[o]=scan.nextInt();
				 y[u]=scan.nextInt();
				 
				 System.out.println("Numbers before swaping"+x[o]+" "+y[u]);
				 
				 x[o]=y[u]+x[o];
				 y[u]=x[o]-y[u]; 
				 x[o]=x[o]-y[u];
				 
				 for (int q:x) {
					 for (int w:y) {
						 System.out.println("numbers after swaping "+q+" "+w);
					 }
				 }
				 
		 }
	}
}
}

