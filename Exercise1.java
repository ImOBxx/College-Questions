import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		double M, P, H, B, E;
		System.out.println("Input Maths Marks: ");
		M = in.nextInt();
		System.out.println("Input Physics Marks: ");
		P = in.nextInt();
		System.out.println("Input Hindi Marks: ");
		H = in.nextInt();
		System.out.println("Input Biology Marks: ");
		B = in.nextInt();
		System.out.println("Input Engish Marks: ");
		E = in.nextInt();
		double sum = M + P + H + B + E;
		System.out.println("Sum: " + sum);
		double percentage = ((sum / 500.0 ) * 100);
		System.out.println("Percenatge: " + percentage);
		
		
		

	}

}
