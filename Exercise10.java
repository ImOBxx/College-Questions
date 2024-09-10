import java.util.Scanner;

public class Exercise10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		double M, P, H, E, B;
		System.out.println("Input Physics Marks: ");
		P = in.nextDouble();
		System.out.println("Input Maths Marks: ");
		M = in.nextDouble();
		System.out.println("Input Hindi Marks: ");
		H = in.nextDouble();
		System.out.println("Input Englsh Marks: ");
		E = in.nextDouble();
		System.out.println("Input Biology Marks: ");
		B = in.nextDouble();
		double average = (M + P + H + E + B) / 500.0;
        double percentage = average * 100;
		System.out.println("Your Percentage is: " + percentage + "%");
		
		if (percentage >= 90)
		{
			System.out.println("Grade: A");
			System.out.println("Congratulations!");
			
		}
		else if (percentage < 90 && percentage >= 80)
		{
			System.out.println("Grade: B");
			System.out.println("Well Done!");
	    }
		else if (percentage < 80 && percentage >= 60)
		{
		
		System.out.println("Grade: C");
		System.out.println("Good!");
		}
		else 
		{
			System.out.println("Grade: D");
			System.out.println("Better luck next time!");
			
		}
	}
}

			
		
