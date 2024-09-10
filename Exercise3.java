import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		double A, r, pie, C;
		System.out.println("------Circle-------");
		System.out.println(" ");
		System.out.println("Input Radius: ");
		r = in.nextDouble();
		pie = Math.PI;
		A = pie * (r * r);
		Math.round(A);
		System.out.println("Area of a Circle: " + A);
		C = 2 * pie * r;
		Math.round(C);
		System.out.println("Circumference of a Circle: " + C);
		
		
		
		
		
		

	}

}
