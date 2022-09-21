package com.javaintro;

public class Fibonschi {

	public static void main(String[] args) {
		//Write a Java Program to print the first 10 numbers of
		//Fibonacci series. 0 1 1 2 3 5 8 13 21 34
		
		//approach 1
		
		int a=0;
		int b=1;
		int c=0;
		
		System.out.print(a+" ");
		
		for(int i=1;i<10;i++) {
			a=b;
			b=c;
			c=a+b;
			System.out.print(c+" ");
		}
		System.out.println();
		
		//approach 2
		
		int[]arr=new int[10];
		arr[0]=0;
		arr[1]=1;
		
		for (int i=2;i<10;i++) {
			arr[i]=arr[i-1]+arr[i-2];
		}
		for(int h:arr) {
		System.out.print(h+" ");
		}

	}

}
