package com.javaintro;

public class Task7 {

	public static void main(String[] args) {
		int number = 251;

        boolean group9 = false;
        for (int k = 2; k <= number / 2; k++) {
         if (number % k == 0) {
         group9 = true;
         break;
          }
          }
         if (!group9)
          System.out.println( "This is a prime number: "+number);
        else
          System.out.println(" This is not a prime number:  "+ number);
	}

}
