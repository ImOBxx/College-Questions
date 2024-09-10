import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		System.out.println("C. TO F.");
		Scanner in = new Scanner(System.in);
		double C, F;
		System.out.print("Input Centigrade: ");
		C = in.nextDouble();
		F = (C * 9 / 5) + 32 ;
		System.out.println("Temperature in Farenheit: " + F);
		
		

	}

}
