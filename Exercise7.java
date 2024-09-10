import java.util.Scanner;

public class Exercise7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		System.out.println("Input A: ");
		a = sc.nextInt();
		System.out.println("Input B: ");
		b = sc.nextInt();
		System.out.println("Input C: ");
		c = sc.nextInt();
		if (a > b && a > c)
		{
			System.out.println("Greatest Number is A");
		}
		else if (b > c)
		{
			System.out.println("Greatest Number is B");
		}
		else 
		{
			System.out.println("Greatest Number is C");
		}
		
		

	}

}
