import java.util.Scanner;

public class Exercise17P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        int sum = 0;
        int originalNumber = number;
        
        while (number != 0) {
            int digit = number % 10; // Extract the last digit
            sum += digit; // Add the digit to the sum
            number /= 10; // Remove the last digit from the number
        }
        
        System.out.println("Sum of digits of " + originalNumber + " is: " + sum);
        scanner.close();
    }

	

}

