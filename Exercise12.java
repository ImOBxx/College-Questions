import java.util.Scanner;

public class Exercise12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        
        System.out.println("Sum of numbers up to " + num + " is: " + sum);
        scanner.close();
    }

		

	}


