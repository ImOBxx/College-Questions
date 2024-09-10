import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		double SI, P, R, T;
		double CI, n, t;
		System.out.println("Calculate Simple Interest: ");
		
		
		System.out.print("Input Principal: ");
		P = in.nextDouble();
		System.out.print("Input Rate of Interest: ");
		R = in.nextDouble();
		System.out.print("Input Time: ");
		T = in.nextDouble();
		SI  = (P * R * T) / 100;
		System.out.println("Simple Interest: " + SI);
		
		System.out.println("---------------------------------");
		
		System.out.println("Calculate Compound Interest: ");
	    System.out.print("Input number of times interest applied per time period: ");
		n = in.nextDouble();
		CI = P * ((1 + (R / 100) * n)  - P;
		System.out.println("Compound Interest: " + CI);
		
		
		
		
		

	}

}
