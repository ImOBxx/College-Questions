import java.util.Scanner;

public class Exerceise13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int num = scanner.nextInt();
	        
	        long factorial = 1; // factorial can grow large, so we use long data type
	        
	        // Calculate factorial
	        for (int i = 1; i <= num; i++) {
	            factorial *= i;
	        }
	        
	        System.out.println("Factorial of " + num + " is: " + factorial);
	        scanner.close();

	}

}