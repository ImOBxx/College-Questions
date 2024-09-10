import java.util.Scanner;

public class Exercise14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int num = scanner.nextInt();
	        
	        int sumEven = 0;
	        int sumOdd = 0;
	        
	        for (int i = 1; i <= num; i++) {
	            if (i % 2 == 0) {
	                sumEven += i;
	            } else {
	                sumOdd += i;
	            }
	        }
	        
	        System.out.println("Sum of even numbers from 1 to " + num + " is: " + sumEven);
	        System.out.println("Sum of odd numbers from 1 to " + num + " is: " + sumOdd);
	        scanner.close();
	    }
	}

	
