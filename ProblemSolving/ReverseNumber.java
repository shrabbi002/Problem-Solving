package ProblemSolving;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
    	
    	 Scanner scanner = new Scanner(System.in);
         System.out.print("Enter a number: ");
         int N = scanner.nextInt();
         
         int reverse = 0;
         while (N != 0) {
             int digit = N % 10;
             reverse = reverse * 10 + digit;
             N /= 10;
         }
         
         System.out.println("Reverse of the number is: " + reverse);
    	
    	
    }

}
