import java.util.Scanner;

public class Exercise18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        int reversedNumber = 0;
        int originalNumber = number;
        
        while (number != 0) {
            int digit = number % 10; // Extract the last digit
            reversedNumber = reversedNumber * 10 + digit; // Append the digit to the reversed number
            number /= 10; // Remove the last digit from the number
        }
        
        System.out.println("Reverse of " + originalNumber + " is: " + reversedNumber);
        scanner.close();
    
		

	}

}
