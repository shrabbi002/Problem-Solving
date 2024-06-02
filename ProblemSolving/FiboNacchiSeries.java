package ProblemSolving;

import java.util.Scanner;

public class FiboNacchiSeries {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the number of terms: ");
	        int N = scanner.nextInt();
	        
	        int a = 0, b = 1;
	        System.out.print(a + " " + b + " ");
	        
	        for (int i = 3; i <= N; i++) {
	            int next = a + b;
	            System.out.print(next + " ");
	            a = b;
	            b = next;
	        }

	}

}
