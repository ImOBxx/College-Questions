import java.util.Scanner;

public class Exercise6 {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in)) {
			double a, b;
			System.out.println("Input A: ");
			a = in.nextDouble();
			System.out.println("Input B: ");
			b = in.nextDouble();
			if (a == b)
			{
				System.out.println("Numbers Are Equal.");
			}
			else 
			{
				System.out.println("Numbers are not Equal.");
				
			}
		}
		
		

	}
}


