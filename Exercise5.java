import java.util.Scanner;

public class Exercise5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int a, b;
		int temp;
		System.out.println("Input A: ");
		a = in.nextInt();
		System.out.println("Input B: ");
		b = in.nextInt();
		temp = a;
		a = b;
		b = temp;
		System.out.println("New Values: a = " + a);
		System.out.println("New Values: b = " + b);
		
		
		

	}

}
