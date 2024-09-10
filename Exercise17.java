import java.util.Scanner;

public class Exercise17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        System.out.println("Digits of the entered number:");
        findDigits(number);
        
        scanner.close();
    }
    
    // Method to find digits of a number
    public static void findDigits(int number) {
        // If the number is negative, make it positive
        if (number < 0)
            number *= -1;

        // Convert the number to a string
        String numStr = String.valueOf(number);
        
        // Iterate through the characters of the string and print each digit
        for (int i = 0; i < numStr.length(); i++) {
            System.out.println(numStr.charAt(i));
        }
    }


}
