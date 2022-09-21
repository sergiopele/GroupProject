package com.javaintro;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SecondLargestNumber {
	static BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//10.Write a java program to find the second largest
		//number in the array?
		
		int []numbers = new int[15];
		
		int largest=0;
		int seclarg=0;
		
		for(int i=0;i<numbers.length;i++) {
				numbers[i]=Integer.parseInt(reader.readLine());
				
				if(numbers[i]>seclarg&&numbers[i]<largest) {
						seclarg=numbers[i];
				}else {

						largest=numbers[i];
					}
				}
		
		System.out.println("The Second largest number is : "+seclarg);

	}

}
