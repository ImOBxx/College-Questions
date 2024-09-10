import java.util.Scanner;

public class Exercise15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int numTerms = scanner.nextInt();
        
        // Fibonacci series initialization
        int first = 0, second = 1;
        System.out.println("Fibonacci Series:");
        System.out.print(first + " " + second + " ");
        
        // Generate and print Fibonacci series
        for (int i = 3; i <= numTerms; i++) {
            int next = first + second;
            System.out.print(next + " ");
            first = second;
            second = next;
        }
        
     
    }
}



